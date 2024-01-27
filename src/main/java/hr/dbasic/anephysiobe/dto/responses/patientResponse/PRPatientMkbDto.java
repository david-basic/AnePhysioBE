package hr.dbasic.anephysiobe.dto.responses.patientResponse;

import hr.dbasic.anephysiobe.models.patients.Mkb;
import lombok.Builder;

@Builder
public record PRPatientMkbDto(
        String id,
        Mkb mkbCode,
        String patientId,
        String displayName
) {
}
