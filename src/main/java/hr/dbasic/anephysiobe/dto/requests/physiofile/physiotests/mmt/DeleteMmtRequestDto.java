package hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.mmt;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record DeleteMmtRequestDto(
        @NotNull(message = "MMT id has to be provided!")
        String patientMmtId,
        @NotNull(message = "Physio test id has to be provided!")
        String physioTestId
) {
}
