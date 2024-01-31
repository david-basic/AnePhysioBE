package hr.dbasic.anephysiobe.dto.requests.physiofile.procedure;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record UpdateProcedureRequestDto(
        @NotNull(message = "Physio file id has to be provided")
        String physioFileId,
        @NotNull(message = "Description has to be provided")
        String description
) {
}
