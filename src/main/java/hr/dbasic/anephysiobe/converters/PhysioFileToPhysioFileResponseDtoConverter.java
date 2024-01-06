package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.responses.patientResponse.PatientResponseDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PFRUserDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.FunctionalDiagnosis;
import hr.dbasic.anephysiobe.models.physiofile.goals.Goal;
import hr.dbasic.anephysiobe.models.physiofile.plans.Plan;
import hr.dbasic.anephysiobe.models.physiofile.procedures.Procedure;
import hr.dbasic.anephysiobe.models.users.User;
import hr.dbasic.anephysiobe.repositories.GoalRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.PlanRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.ProcedureRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.UserRepositoryMongo;
import hr.dbasic.anephysiobe.services.FunctionalDiagnosisService;
import hr.dbasic.anephysiobe.services.PatientService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PhysioFileToPhysioFileResponseDtoConverter implements Converter<PhysioFile, PhysioFileResponseDto> {
    private final PatientService patientService;
    private final FunctionalDiagnosisService functionalDiagnosisService;
    private final GoalRepositoryMongo goalRepositoryMongo;
    private final PlanRepositoryMongo planRepositoryMongo;
    private final ProcedureRepositoryMongo procedureRepositoryMongo;
    private final UserRepositoryMongo userRepositoryMongo;
    
    @Override
    public PhysioFileResponseDto convert(@NonNull PhysioFile source) {
        PatientResponseDto patientResponseDto = patientService.getPatientById(source.getPatient().getId());
        List<FunctionalDiagnosis> fullFunctionalDiagnosisList = functionalDiagnosisService.findAllFunctionalDiagnoses();
        List<Goal> fullGoalsList = goalRepositoryMongo.findAll();
        List<Plan> fullPlansList = planRepositoryMongo.findAll();
        List<Procedure> fullProcedureList = procedureRepositoryMongo.findAll();
        List<User> allUsers = userRepositoryMongo.findAll();
        List<PFRUserDto> allPhysiotherapists = new ArrayList<>();
        allUsers.forEach(user -> allPhysiotherapists.add(PFRUserDto.builder().firstName(user.getFirstName()).lastName(user.getLastName()).build()));
        
        return new PhysioFileResponseDto(
                source.getId(),
                source.getFileOpenedBy(),
                patientResponseDto,
                fullFunctionalDiagnosisList,
                source.getPatientFunctionalDiagnoses(),
                source.getAssessment(),
                fullGoalsList,
                source.getPatientGoal(),
                fullPlansList,
                source.getPatientPlan(),
                source.getNotes(),
                fullProcedureList,
                source.getPatientProcedures(),
                source.getPhysioTest(),
                source.getConclussion(),
                source.getFileClosedBy(),
                allPhysiotherapists
        );
    }
}
