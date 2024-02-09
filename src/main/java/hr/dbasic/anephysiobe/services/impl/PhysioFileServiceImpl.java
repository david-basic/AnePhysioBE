package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.converters.PhysioFileToPhysioFileResponseDtoConverter;
import hr.dbasic.anephysiobe.dto.requests.physiofile.CloseFileRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.UpdatePhysioFileRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Assessment;
import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.FunctionalDiagnosis;
import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.PatientFunctionalDiagnosis;
import hr.dbasic.anephysiobe.models.physiofile.goals.Goal;
import hr.dbasic.anephysiobe.models.physiofile.goals.PatientGoal;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.PhysioTest;
import hr.dbasic.anephysiobe.models.physiofile.plans.PatientPlan;
import hr.dbasic.anephysiobe.models.physiofile.plans.Plan;
import hr.dbasic.anephysiobe.models.users.User;
import hr.dbasic.anephysiobe.repositories.*;
import hr.dbasic.anephysiobe.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class PhysioFileServiceImpl implements PhysioFileService {
    private final PhysioFileRepositoryMongo physioFileRepositoryMongo;
    private final PhysioFileToPhysioFileResponseDtoConverter physioFileToPhysioFileResponseDtoConverter;
    private final AssessmentService assessmentService;
    private final PatientFunctionalDiagnosesRepositoryMongo patientFunctionalDiagnosesRepositoryMongo;
    private final UserRepositoryMongo userRepositoryMongo;
    private final CurrentUserService currentUserService;
    private final PatientService patientService;
    private final FunctionalDiagnosisRepositoryMongo functionalDiagnosisRepositoryMongo;
    private final AssessmentRepositoryMongo assessmentRepositoryMongo;
    private final RandomNumberService randomNumberService;
    private final GoalRepositoryMongo goalRepositoryMongo;
    private final PlanRepositoryMongo planRepositoryMongo;
    private final PhysioTestRepositoryMongo physioTestRepositoryMongo;
    
    @Override
    public PhysioFileResponseDto getActivePhysioFileByPatientIdOrCreateNewOne(String patientId) {
        List<PhysioFile> foundFiles = physioFileRepositoryMongo.findPhysioFilesByPatientId(patientId);
        
        List<PhysioFile> activePhysioFilesList = foundFiles.stream().filter(pf -> Objects.isNull(pf.getFileOpenedBy())).toList();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(activePhysioFilesList.size());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        if (!activePhysioFilesList.isEmpty()) {
            return physioFileToPhysioFileResponseDtoConverter.convert(activePhysioFilesList.getFirst());
        } else {
            List<FunctionalDiagnosis> allFDs = functionalDiagnosisRepositoryMongo.findAll();
            List<PatientFunctionalDiagnosis> allPFDs = allFDs.stream().map(fd -> PatientFunctionalDiagnosis.builder().functionalDiagnosis(fd).build()).toList();
            patientFunctionalDiagnosesRepositoryMongo.saveAll(allPFDs);
            
            Assessment newAssessment = Assessment.builder().patientRass(new ArrayList<>()).pointsOfPain(new ArrayList<>()).notes("").build();
            assessmentRepositoryMongo.save(newAssessment);
            
            List<Goal> allGoals = goalRepositoryMongo.findAll();
            List<PatientGoal> allPatientGoalsList = allGoals.stream().map(g -> PatientGoal.patientGoalBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).type(g.getType()).description(g.getDescription()).build()).toList();
            
            List<Plan> allPlans = planRepositoryMongo.findAll();
            List<PatientPlan> allPatientPlansList = allPlans.stream().map(p -> PatientPlan.patientPlanBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).type(p.getType()).description(p.getDescription()).build()).toList();
            
            PhysioTest newPhysioTest = PhysioTest.builder().cpax(new ArrayList<>()).gcs(new ArrayList<>()).mmt(new ArrayList<>()).vas(new ArrayList<>()).build();
            physioTestRepositoryMongo.save(newPhysioTest);
            
            PhysioFile newPhysioFile = PhysioFile.builder()
                    .fileOpenedBy(currentUserService.getCurrentUser())
                    .patient(patientService.getPatientById(patientId))
                    .patientFunctionalDiagnoses(allPFDs)
                    .assessment(newAssessment)
                    .patientGoals(allPatientGoalsList)
                    .patientPlans(allPatientPlansList)
                    .notes("")
                    .patientProcedures(new ArrayList<>())
                    .physioTest(newPhysioTest)
                    .conclussion("")
                    .build();
            
            physioFileRepositoryMongo.save(newPhysioFile);
            
            return physioFileToPhysioFileResponseDtoConverter.convert(newPhysioFile);
        }
    }
    
    @Override
    public List<PhysioFileResponseDto> getAllPhysioFiles() {
        return physioFileRepositoryMongo.findAll().stream().map(
                physioFileToPhysioFileResponseDtoConverter::convert
        ).toList();
    }
    
    @Override
    public PhysioFileResponseDto updatePhysioFileById(String physioFileId, UpdatePhysioFileRequestDto updatePhysioFileRequestDto) {
        PhysioFile foundFile = physioFileRepositoryMongo.findById(physioFileId).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        
        Assessment foundAssessment = assessmentService.getAssessmentById(foundFile.getAssessment().getId());
        foundAssessment.setNotes(updatePhysioFileRequestDto.assessmentNotes());
        assessmentService.saveAssessment(foundAssessment);
        
        patientFunctionalDiagnosesRepositoryMongo.saveAll(updatePhysioFileRequestDto.patientFunctionalDiagnoses());
        
        
        foundFile.setPatientGoals(updatePhysioFileRequestDto.patientGoals());
        foundFile.setPatientPlans(updatePhysioFileRequestDto.patientPlans());
        foundFile.setNotes(updatePhysioFileRequestDto.notes());
        foundFile.setConclussion(updatePhysioFileRequestDto.conclussion());
        
        physioFileRepositoryMongo.save(foundFile);
        return physioFileToPhysioFileResponseDtoConverter.convert(foundFile);
    }
    
    @Override
    public PhysioFileResponseDto closePhysioFileById(String physioFileId, CloseFileRequestDto closeFileRequestDto) {
        PhysioFile foundFile = physioFileRepositoryMongo.findById(physioFileId).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        
        User userClosingTheFile = userRepositoryMongo.findById(closeFileRequestDto.therapistId()).orElseThrow(EntityNotFoundException.supplier("User"));
        
        foundFile.setFileClosedBy(userClosingTheFile);
        foundFile.setFileClosedAt(LocalDateTime.now());
        physioFileRepositoryMongo.save(foundFile);
        
        return physioFileToPhysioFileResponseDtoConverter.convert(foundFile);
    }
    
    @Override
    public List<PhysioFileResponseDto> getAllPhysioFilesOfPatientWithId(String id) {
        List<PhysioFile> foundFiles = physioFileRepositoryMongo.findPhysioFilesByPatientId(id);
        return foundFiles.stream().map(physioFileToPhysioFileResponseDtoConverter::convert).toList();
    }
    
    @Override
    public PhysioFileResponseDto getPhysioFileById(String id) {
        PhysioFile foundFile = physioFileRepositoryMongo.findById(id).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(foundFile);
    }
}
