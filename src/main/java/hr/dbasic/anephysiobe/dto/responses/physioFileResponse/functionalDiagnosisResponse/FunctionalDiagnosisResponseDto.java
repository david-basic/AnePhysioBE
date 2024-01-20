package hr.dbasic.anephysiobe.dto.responses.physioFileResponse.functionalDiagnosisResponse;

import lombok.Builder;

@Builder
public record FunctionalDiagnosisResponseDto(
        String id,
        String description
) {
}
