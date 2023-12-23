package hr.dbasic.anephysiobe.dto.responses.patientResponse;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record PRPatientOperationDto(
        String id,
        String procedureName,
        LocalDate procedureDate
) {
}
