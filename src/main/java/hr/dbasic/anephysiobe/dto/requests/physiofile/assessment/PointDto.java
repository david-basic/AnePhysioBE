package hr.dbasic.anephysiobe.dto.requests.physiofile.assessment;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record PointDto(
        @NotNull(message = "X koordinata mora postojati!")
        Integer x,
        @NotNull(message = "Y Koordinata mora postojati!")
        Integer y
) {
}
