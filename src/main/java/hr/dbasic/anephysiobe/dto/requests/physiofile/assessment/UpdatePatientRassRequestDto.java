package hr.dbasic.anephysiobe.dto.requests.physiofile.assessment;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record UpdatePatientRassRequestDto(
        @NotNull(message = "Id procjene mora biti definiran!")
        String assessmentId,
        @NotNull(message = "Ocjena novog RASS testa mora biti definirana!")
        String score,
        @NotNull(message = "Naziv ocjene novog RASS testa mora biti definiran!")
        String term,
        @NotNull(message = "Opis novog RASS testa mora biti definiran!")
        String scoreDescription,
        @NotNull(message = "Datum novog RASS testa mora biti definiran!")
        String rassDateTime,
        String additionalDescription
) {
}
