package hr.dbasic.anephysiobe.dto.requests.physiofile.procedure;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.List;

@Builder
public record UpdatePatientProcedureRequestDto(
        @NotNull(message = "Id fizioterapijskog kartona mora biti definiran!")
        String physioFileId,
        @NotNull(message = "Opis procedure mora biti definiran!")
        String description,
        @NotNull(message = "Datum procedure mora biti definiran!")
        String dateTime,
        @NotNull(message = "Id of therapists on the procedure has to be provided")
        List<String> workingTherapistsIds
) {
}
