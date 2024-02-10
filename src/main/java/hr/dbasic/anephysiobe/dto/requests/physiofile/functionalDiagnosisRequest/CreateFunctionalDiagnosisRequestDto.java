package hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CreateFunctionalDiagnosisRequestDto(
        @NotNull(message = "Id fizioterapijskog kartona mora biti definiran!")
        String physioFileId,
        @NotNull(message = "Opis funkcionalne dijagnoze mora biti definiran!")
        String description
) {
}
