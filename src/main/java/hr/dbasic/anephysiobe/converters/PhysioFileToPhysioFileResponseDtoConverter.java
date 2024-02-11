package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.responses.departmentResponse.DRBedDto;
import hr.dbasic.anephysiobe.dto.responses.departmentResponse.DRBoxDto;
import hr.dbasic.anephysiobe.dto.responses.departmentResponse.DepartmentResponseDto;
import hr.dbasic.anephysiobe.dto.responses.patientResponse.PatientResponseDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PFRUserDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.procedures.PatientProcedureResponseDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Rass;
import hr.dbasic.anephysiobe.models.physiofile.goals.Goal;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.cpax.AOP;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.EyeOpeningResponse;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.MotorResponse;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.VerbalResponse;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.mmt.Mmt;
import hr.dbasic.anephysiobe.models.physiofile.plans.Plan;
import hr.dbasic.anephysiobe.models.physiofile.procedures.Procedure;
import hr.dbasic.anephysiobe.models.users.User;
import hr.dbasic.anephysiobe.repositories.*;
import hr.dbasic.anephysiobe.services.DepartmentService;
import hr.dbasic.anephysiobe.services.PatientService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class PhysioFileToPhysioFileResponseDtoConverter implements Converter<PhysioFile, PhysioFileResponseDto> {
    private final PatientService patientService;
    private final GoalRepositoryMongo goalRepositoryMongo;
    private final PlanRepositoryMongo planRepositoryMongo;
    private final ProcedureRepositoryMongo procedureRepositoryMongo;
    private final UserRepositoryMongo userRepositoryMongo;
    private final AopRepositoryMongo aopRepositoryMongo;
    private final RassRepositoryMongo rassRepositoryMongo;
    private final EyeOpeningResponseRepositoryMongo eyeOpeningResponseRepositoryMongo;
    private final MotorResponseRepositoryMongo motorResponseRepositoryMongo;
    private final VerbalResponseRepositoryMongo verbalResponseRepositoryMongo;
    private final MmtRepositoryMongo mmtRepositoryMongo;
    private final DepartmentService departmentService;
    
    @Override
    public PhysioFileResponseDto convert(@NonNull PhysioFile source) {
        PatientResponseDto patientResponseDto = patientService.getPatientResponseDtoById(source.getPatient().getId());
        
        List<Goal> fullGoalsList = goalRepositoryMongo.findAll();
        List<Plan> fullPlansList = planRepositoryMongo.findAll();
        List<Procedure> fullProcedureList = procedureRepositoryMongo.findAll();
        
        List<User> allUsers = userRepositoryMongo.findAll();
        List<PFRUserDto> allPhysiotherapists = new ArrayList<>();
        allUsers.forEach(user -> allPhysiotherapists.add(
                PFRUserDto.builder()
                        .id(user.getId())
                        .firstName(user.getFirstName())
                        .lastName(user.getLastName())
                        .title(user.getTitle())
                        .sex(user.getSex().getDisplayName())
                        .role(user.getRole().getDisplayName())
                        .build()));
        
        User foundUserOpened = userRepositoryMongo.findById(source.getFileOpenedBy().getId()).orElseThrow(EntityNotFoundException::new);
        PFRUserDto fileOpenedBy = PFRUserDto.builder()
                .id(foundUserOpened.getId())
                .firstName(foundUserOpened.getFirstName())
                .lastName(foundUserOpened.getLastName())
                .title(foundUserOpened.getTitle())
                .sex(foundUserOpened.getSex().getDisplayName())
                .role(foundUserOpened.getRole().getDisplayName())
                .build();
        
        List<AOP> allAspectsOfPhysicality = aopRepositoryMongo.findAll();
        List<Rass> fullRassList = rassRepositoryMongo.findAll();
        List<EyeOpeningResponse> allEyeOpeningResponses = eyeOpeningResponseRepositoryMongo.findAll();
        List<MotorResponse> allMotorResponses = motorResponseRepositoryMongo.findAll();
        List<VerbalResponse> allVerbalResponses = verbalResponseRepositoryMongo.findAll();
        List<Mmt> mmtList = mmtRepositoryMongo.findAll();
        
        String foundDeptId = getPatientDepartmentId(patientResponseDto);
        
        return new PhysioFileResponseDto(
                source.getId(),
                fileOpenedBy,
                patientResponseDto,
                source.getPatientFunctionalDiagnoses(),
                source.getAssessment(),
                fullRassList,
                fullGoalsList,
                source.getPatientGoals(),
                fullPlansList,
                source.getPatientPlans(),
                source.getNotes(),
                fullProcedureList,
                source.getPatientProcedures().stream().map(pp -> PatientProcedureResponseDto.builder()
                        .id(pp.getId())
                        .description(pp.getDescription())
                        .dateTime(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(pp.getDate()))
                        .workingTherapists(
                                pp.getWorkingTherapists().stream().map(t -> PFRUserDto.builder()
                                        .id(t.getId())
                                        .firstName(t.getFirstName())
                                        .lastName(t.getLastName())
                                        .build()
                                ).toList()
                        )
                        .build()
                ).toList(),
                source.getPhysioTest(),
                allAspectsOfPhysicality,
                allEyeOpeningResponses,
                allMotorResponses,
                allVerbalResponses,
                mmtList,
                source.getConclussion(),
                source.getFileClosedBy() != null ?
                        PFRUserDto.builder()
                                .id(source.getFileClosedBy().getId())
                                .firstName(source.getFileClosedBy().getFirstName())
                                .lastName(source.getFileClosedBy().getLastName())
                                .title(source.getFileClosedBy().getTitle())
                                .sex(source.getFileClosedBy().getSex().getDisplayName())
                                .role(source.getFileClosedBy().getRole().getDisplayName())
                                .build()
                        : null,
                source.getFileClosedAt() != null ?
                        DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(source.getFileClosedAt())
                        : null,
                allPhysiotherapists,
                foundDeptId
        );
    }
    
    private String getPatientDepartmentId(PatientResponseDto patientResponseDto) {
        String foundDeptId = "";
        for (DepartmentResponseDto department : departmentService.getAllDepartments()) {
            for (DRBoxDto box : department.boxes()) {
                for (DRBedDto bed : box.beds()) {
                    if (!bed.bedIsEmpty()) {
                        if (Objects.equals(bed.patient().id(), patientResponseDto.id())) {
                            foundDeptId = department.id();
                            break;
                        }
                    }
                }
            }
        }
        return foundDeptId;
    }
}
