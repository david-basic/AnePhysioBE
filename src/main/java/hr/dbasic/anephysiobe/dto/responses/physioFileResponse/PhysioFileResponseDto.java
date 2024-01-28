package hr.dbasic.anephysiobe.dto.responses.physioFileResponse;

import hr.dbasic.anephysiobe.dto.responses.patientResponse.PatientResponseDto;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Assessment;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Rass;
import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.PatientFunctionalDiagnosis;
import hr.dbasic.anephysiobe.models.physiofile.goals.Goal;
import hr.dbasic.anephysiobe.models.physiofile.goals.PatientGoal;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.PhysioTest;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.cpax.AOP;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.EyeOpeningResponse;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.MotorResponse;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.VerbalResponse;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.mmt.Mmt;
import hr.dbasic.anephysiobe.models.physiofile.plans.PatientPlan;
import hr.dbasic.anephysiobe.models.physiofile.plans.Plan;
import hr.dbasic.anephysiobe.models.physiofile.procedures.PatientProcedure;
import hr.dbasic.anephysiobe.models.physiofile.procedures.Procedure;
import lombok.Builder;

import java.util.List;

@Builder
public record PhysioFileResponseDto(
        String id,
        PFRUserDto fileOpenedBy,
        PatientResponseDto patient,
        List<PatientFunctionalDiagnosis> patientFunctionalDiagnoses,
        Assessment assessment,
        List<Rass> fullRassList,
        List<Goal> fullGoalsList,
        List<PatientGoal> patientGoals,
        List<Plan> fullPlansList,
        List<PatientPlan> patientPlans,
        String notes,
        List<Procedure> fullProcedureList,
        List<PatientProcedure> patientProcedures,
        PhysioTest physioTest,
        List<AOP> allAspectsOfPhysicality,
        List<EyeOpeningResponse> allEyeOpeningResponses,
        List<MotorResponse> allMotorResponses,
        List<VerbalResponse> allVerbalResponses,
        List<Mmt> mmtList,
        String conclussion,
        PFRUserDto fileClosedBy,
        List<PFRUserDto> allPhysiotherapists
) {
}
