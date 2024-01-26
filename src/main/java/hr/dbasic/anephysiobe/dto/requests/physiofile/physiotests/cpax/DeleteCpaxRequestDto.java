package hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.cpax;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record DeleteCpaxRequestDto(
        @NotNull(message = "CPAx id has to be provided")
        String cpaxId,
        @NotNull(message = "Physio test id has to be provided")
        String physioTestId
) {
}
