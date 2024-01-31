package hr.dbasic.anephysiobe.dto.requests.physiofile.procedure;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record DeleteProcedureRequestDto(
        @NotNull(message = "Physio file id has to be provided!")
        String physioFileId,
        @NotNull(message = "Procedure id has to be provided!")
        String procedureId
) {
}
