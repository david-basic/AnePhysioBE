package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.converters.AssessmentToAssessmentResponseDtoConverter;
import hr.dbasic.anephysiobe.converters.CreatePatientRassRequestToPatientRassConverter;
import hr.dbasic.anephysiobe.converters.PhysioFileToPhysioFileResponseDtoConverter;
import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.CreatePatientRassRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.DeletePatientRassRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.UpdatePatientRassRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.assessmentResponse.AssessmentResponseDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Assessment;
import hr.dbasic.anephysiobe.models.physiofile.assessment.PatientRass;
import hr.dbasic.anephysiobe.repositories.AssessmentRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.PhysioFileRepositoryMongo;
import hr.dbasic.anephysiobe.services.AssessmentService;
import hr.dbasic.anephysiobe.validators.CreateAssessmentOnPhysioFileValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AssessmentServiceImpl implements AssessmentService {
    private final AssessmentRepositoryMongo assessmentRepositoryMongo;
    private final PhysioFileRepositoryMongo physioFileRepositoryMongo;
    private final CreatePatientRassRequestToPatientRassConverter createPatientRassRequestToPatientRassConverter;
    private final PhysioFileToPhysioFileResponseDtoConverter physioFileToPhysioFileResponseDtoConverter;
    private final AssessmentToAssessmentResponseDtoConverter assessmentToAssessmentResponseDtoConverter;
    private final CreateAssessmentOnPhysioFileValidator createAssessmentOnPhysioFileValidator;
    
    @Override
    public List<AssessmentResponseDto> getAllAssessments() {
        return assessmentRepositoryMongo.findAll().stream().map(assessmentToAssessmentResponseDtoConverter::convert).toList();
    }
    
    @Override
    public PhysioFileResponseDto createPatientRass(CreatePatientRassRequestDto createPatientRassRequestDto) {
        PatientRass newPR = createPatientRassRequestToPatientRassConverter.convert(createPatientRassRequestDto);
        Assessment foundAssessment = assessmentRepositoryMongo.findById(createPatientRassRequestDto.assessmentId()).orElseThrow(EntityNotFoundException.supplier("Assessment"));
        
        foundAssessment.getPatientRass().add(newPR);
        assessmentRepositoryMongo.save(foundAssessment);
        
        PhysioFile foundFile = physioFileRepositoryMongo.findPhysioFileByAssessmentId(createPatientRassRequestDto.assessmentId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(foundFile);
    }
    
    @Override
    public PhysioFileResponseDto updatePatientRassById(String patientRassId, UpdatePatientRassRequestDto updatePatientRassRequestDto) {
        Assessment foundAssessment = assessmentRepositoryMongo.findById(updatePatientRassRequestDto.assessmentId()).orElseThrow(EntityNotFoundException.supplier("Assessment"));
        
        List<PatientRass> newPatientRassListState = new ArrayList<>();
        
        for (PatientRass patientRass : foundAssessment.getPatientRass()) {
            if (Objects.equals(patientRass.getId(), patientRassId)) {
                patientRass.setScore(updatePatientRassRequestDto.score());
                patientRass.setTerm(updatePatientRassRequestDto.term());
                patientRass.setScoreDescription(updatePatientRassRequestDto.scoreDescription());
                patientRass.setRassDateTime(LocalDateTime.parse(updatePatientRassRequestDto.rassDateTime(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
                patientRass.setAdditionalDescription(updatePatientRassRequestDto.additionalDescription());
            }
            newPatientRassListState.add(patientRass);
        }
        
        foundAssessment.setPatientRass(newPatientRassListState);
        assessmentRepositoryMongo.save(foundAssessment);
        
        PhysioFile foundFile = physioFileRepositoryMongo.findPhysioFileByAssessmentId(updatePatientRassRequestDto.assessmentId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(foundFile);
    }
    
    @Override
    public void deletePatientRassByIdInAssessmentById(DeletePatientRassRequestDto deletePatientRassRequestDto) {
        Assessment foundAssessment = assessmentRepositoryMongo.findById(deletePatientRassRequestDto.assessmentId()).orElseThrow(EntityNotFoundException.supplier("Assessment"));
        foundAssessment.getPatientRass().removeIf(pr -> Objects.equals(pr.getId(), deletePatientRassRequestDto.patientRassId()));
        assessmentRepositoryMongo.save(foundAssessment);
    }
    
    @Override
    public PhysioFileResponseDto createAssessmentOnPhysioFileWithId(String physioFileId) {
        PhysioFile physioFile = physioFileRepositoryMongo.findById(physioFileId).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        createAssessmentOnPhysioFileValidator.validate(physioFile);
        
        Assessment newAssessment = Assessment.builder().patientRass(new ArrayList<>()).notes("").build();
        assessmentRepositoryMongo.save(newAssessment);
        physioFile.setAssessment(newAssessment);
        physioFileRepositoryMongo.save(physioFile);
        
        return physioFileToPhysioFileResponseDtoConverter.convert(physioFile);
    }
}
