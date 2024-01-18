package hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.vas;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CreateVasRequestDto(
        @NotNull(message = "Parent physio test id has to be provided!")
        String physioTestId,
        @NotNull(message = "Pain level has to be provided!")
        Integer painLevel,
        @NotNull(message = "Accompanying note has to be provided!")
        String note,
        @NotNull(message = "Date and time have to be provided!")
        String vasDateTime
) {
}
