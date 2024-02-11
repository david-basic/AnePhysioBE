package hr.dbasic.anephysiobe.dto.requests.physiofile.procedure;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record UpdateProcedureRequestDto(
        @NotNull(message = "Id fizioterapijskog kartona mora biti definiran!")
        String physioFileId,
        @NotNull(message = "Opis procedure mora biti definiran!")
        String description
) {
}
