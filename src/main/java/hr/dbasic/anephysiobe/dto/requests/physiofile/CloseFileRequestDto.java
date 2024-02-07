package hr.dbasic.anephysiobe.dto.requests.physiofile;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CloseFileRequestDto(
        @NotNull(message = "Therapist id has to be defined!")
        String therapistId
) {
}
