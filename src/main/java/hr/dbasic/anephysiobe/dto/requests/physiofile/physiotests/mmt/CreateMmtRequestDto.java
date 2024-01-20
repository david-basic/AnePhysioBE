package hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.mmt;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CreateMmtRequestDto(
        @NotNull(message = "Physio test id has to be provided!")
        String physioTestId,
        @NotNull(message = "Grade has to be provided!")
        Integer grade,
        @NotNull(message = "Description has to be provided!")
        String description,
        @NotNull(message = "Date and time have to be provided!")
        String mmtDateTime,
        @NotNull(message = "Note has to be provided!")
        String note
) {
}
