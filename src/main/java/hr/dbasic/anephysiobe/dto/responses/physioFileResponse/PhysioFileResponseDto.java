package hr.dbasic.anephysiobe.dto.responses.physioFileResponse;

import hr.dbasic.anephysiobe.dto.responses.patientResponse.PatientResponseDto;
import hr.dbasic.anephysiobe.models.patients.Patient;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Assessment;
import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.FunctionalDiagnosis;
import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.PatientFunctionalDiagnosis;
import hr.dbasic.anephysiobe.models.physiofile.goals.Goal;
import hr.dbasic.anephysiobe.models.physiofile.goals.PatientGoal;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.PhysioTest;
import hr.dbasic.anephysiobe.models.physiofile.plans.PatientPlan;
import hr.dbasic.anephysiobe.models.physiofile.plans.Plan;
import hr.dbasic.anephysiobe.models.physiofile.procedures.PatientProcedure;
import hr.dbasic.anephysiobe.models.physiofile.procedures.Procedure;
import lombok.Builder;

import java.util.List;

@Builder
public record PhysioFileResponseDto(
        String id,
        String fileOpenedBy,
        PatientResponseDto patient,
        List<FunctionalDiagnosis> fullFunctionalDiagnosisList,
        List<PatientFunctionalDiagnosis> patientFunctionalDiagnoses,
        Assessment assessment,
        List<Goal> fullGoalsList,
        List<PatientGoal> patientGoal,
        List<Plan> fullPlansList,
        List<PatientPlan> patientPlan,
        String notes,
        List<Procedure> fullProcedureList,
        List<PatientProcedure> patientProcedures,
        PhysioTest physioTest,
        String conclussion,
        String fileClosedBy,
        List<PFRUserDto> allPhysiotherapists
) {
}
