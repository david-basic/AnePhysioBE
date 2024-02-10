package hr.dbasic.anephysiobe.dto.requests.physiofile;

import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.PatientFunctionalDiagnosis;
import hr.dbasic.anephysiobe.models.physiofile.goals.PatientGoal;
import hr.dbasic.anephysiobe.models.physiofile.plans.PatientPlan;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.List;

@Builder
public record UpdatePhysioFileRequestDto(
        @NotNull(message = "Funkcionalne dijagnoze moraju biti definirane!")
        List<PatientFunctionalDiagnosis> patientFunctionalDiagnoses,
        @NotNull(message = "Početna procjena mora biti definirana!")
        String assessmentNotes,
        @NotNull(message = "Ciljevi moraju biti definirani!")
        List<PatientGoal> patientGoals,
        @NotNull(message = "Planovi moraju biti definirani!")
        List<PatientPlan> patientPlans,
        @NotNull(message = "Zabilješke moraju biti definirane!")
        String notes,
        @NotNull(message = "Završna procjena i zaključak moraju biti definirani!")
        String conclussion
) {
}
