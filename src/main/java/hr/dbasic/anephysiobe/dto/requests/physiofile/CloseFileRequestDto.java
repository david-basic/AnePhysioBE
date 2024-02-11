package hr.dbasic.anephysiobe.dto.requests.physiofile;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CloseFileRequestDto(
        @NotNull(message = "Id fizioterapeuta koji zatvara fizioterapijski karton mora biti definiran!")
        String therapistId
) {
}
