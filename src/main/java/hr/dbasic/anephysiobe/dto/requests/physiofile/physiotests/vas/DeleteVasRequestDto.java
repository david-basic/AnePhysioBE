package hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.vas;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record DeleteVasRequestDto(
        @NotNull(message = "VAS id has to be provided!")
        String vasId,
        @NotNull(message = "Physio test id has to be provided!")
        String physioTestId
) {
}
