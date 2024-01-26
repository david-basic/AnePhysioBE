package hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.gcs;

import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.EyeOpeningResponse;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.MotorResponse;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.VerbalResponse;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record UpdateGcsRequestDto(
        @NotNull(message = "Physio test id has to be provided")
        String physioTestId,
        @NotNull(message = "Eye response has to be provided")
        EyeOpeningResponse eyeOpeningResponse,
        @NotNull(message = "Verbal response has to be provided")
        VerbalResponse verbalResponse,
        @NotNull(message = "Motor response has to be provided")
        MotorResponse motorResponse,
        @NotNull(message = "Date and time have to be provided")
        String gcsDateTime
) {
}
