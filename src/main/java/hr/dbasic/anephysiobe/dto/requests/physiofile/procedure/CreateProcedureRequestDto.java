package hr.dbasic.anephysiobe.dto.requests.physiofile.procedure;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CreateProcedureRequestDto(
        @NotNull(message = "Id fizioterapijskog kartona mora biti definiran!")
        String physioFileId,
        @NotNull(message = "Opis funkcionalne dijagnoze mora biti definiran!")
        String description
) {
}
