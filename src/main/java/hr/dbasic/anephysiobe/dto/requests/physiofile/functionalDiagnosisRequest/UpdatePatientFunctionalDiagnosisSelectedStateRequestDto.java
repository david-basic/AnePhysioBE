package hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record UpdatePatientFunctionalDiagnosisSelectedStateRequestDto(
        @NotNull(message = "Physio file id has to be provided")
        String physioFileId,
        @NotNull(message = "Patient functional diagnosis selected state has to be provided")
        Boolean selected
) {
}
