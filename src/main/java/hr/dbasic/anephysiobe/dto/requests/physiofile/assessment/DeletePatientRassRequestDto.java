package hr.dbasic.anephysiobe.dto.requests.physiofile.assessment;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record DeletePatientRassRequestDto(
        @NotNull(message = "Patient RASS id has to be provided!")
        String patientRassId,
        @NotNull(message = "Assessment id has to be provided!")
        String assessmentId
) {
}
