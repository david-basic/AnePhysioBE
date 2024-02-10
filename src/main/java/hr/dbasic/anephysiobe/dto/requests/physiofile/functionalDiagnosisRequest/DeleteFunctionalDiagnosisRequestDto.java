package hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record DeleteFunctionalDiagnosisRequestDto(
        @NotNull(message = "Id funkcionalne dijagnoze mora biti definiran!")
        String fdId,
        @NotNull(message = "Id fizioterapijskog kartona mora biti definiran!")
        String physioFileId
) {
}
