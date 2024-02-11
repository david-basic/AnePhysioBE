package hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record UpdatePatientFunctionalDiagnosisSelectedStateRequestDto(
        @NotNull(message = "Id fizioterapijskog kartona mora biti definiran!")
        String physioFileId,
        @NotNull(message = "Status selekcije funkcionalne dijagnoze mora biti definiran!")
        Boolean selected
) {
}
