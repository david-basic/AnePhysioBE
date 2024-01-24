package hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record DeleteFunctionalDiagnosisRequestDto(
        @NotNull(message = "Functional diagnosis id has to be provided!")
        String fdId,
        @NotNull(message = "Physio file id has to be provided!")
        String physioFileId
) {
}
