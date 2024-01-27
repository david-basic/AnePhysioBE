package hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CreateFunctionalDiagnosisRequestDto(
        @NotNull(message = "Physio file id has to be provided")
        String physioFileId,
        @NotNull(message = "Functional diagnosis description has to be provided")
        String description
) {
}
