package hr.dbasic.anephysiobe.dto.responses.patientResponse;

import java.time.LocalDate;

public record PRPatientOperationDto(
        String id,
        String procedureName,
        LocalDate procedureDate
) {
}
