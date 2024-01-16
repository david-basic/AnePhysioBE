package hr.dbasic.anephysiobe.dto.requests.physiofile.assessment;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record CreatePatientRassRequestDto(
        @NotNull(message = "Assessment id has to be provided!")
        String assessmentId,
        @NotNull(message = "Score of the new RASS has to be provided!")
        String score,
        @NotNull(message = "Term of the new RASS has to be provided!")
        String term,
        @NotNull(message = "Description of the new RASS has to be provided!")
        String scoreDescription,
        @NotNull(message = "Date and time of the new RASS have to be provided!")
        String rassDateTime,
        String additionalDescription
) {
}
