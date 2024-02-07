package hr.dbasic.anephysiobe.dto.requests.physiofile.assessment;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record PointDto(
        @NotNull(message = "X coordinate must not be null")
        Integer x,
        @NotNull(message = "Y coordinate must not be null")
        Integer y
) {
}
