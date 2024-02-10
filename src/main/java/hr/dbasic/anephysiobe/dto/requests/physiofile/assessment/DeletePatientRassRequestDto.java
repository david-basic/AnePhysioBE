package hr.dbasic.anephysiobe.dto.requests.physiofile.assessment;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record DeletePatientRassRequestDto(
        @NotNull(message = "RASS id mora biti definiran!")
        String patientRassId,
        @NotNull(message = "Id procjene mora biti definiran!")
        String assessmentId
) {
}
