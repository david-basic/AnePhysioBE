package hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.gcs;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record DeleteGcsRequestDto(
        @NotNull(message = "GCS id has to be provided!")
        String gcsId,
        @NotNull(message = "Physio test id has to be provided!")
        String physioTestId
) {
}
