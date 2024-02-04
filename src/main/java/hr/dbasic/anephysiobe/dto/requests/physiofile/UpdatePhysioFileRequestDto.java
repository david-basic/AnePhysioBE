package hr.dbasic.anephysiobe.dto.requests.physiofile;

import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.PatientFunctionalDiagnosis;
import hr.dbasic.anephysiobe.models.physiofile.goals.PatientGoal;
import hr.dbasic.anephysiobe.models.physiofile.plans.PatientPlan;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.List;

@Builder
public record UpdatePhysioFileRequestDto(
        @NotNull(message = "Patient functional diagnoses have to be provided")
        List<PatientFunctionalDiagnosis> patientFunctionalDiagnoses,
        @NotNull(message = "Assessment notes have to be provided")
        String assessmentNotes,
        @NotNull(message = "Patient goals have to be provided")
        List<PatientGoal> patientGoals,
        @NotNull(message = "Patient plans have to be provided")
        List<PatientPlan> patientPlans,
        @NotNull(message = "Notes have to be provided")
        String notes,
        @NotNull(message = "Conclussion has to be provided")
        String conclussion
) {
}
