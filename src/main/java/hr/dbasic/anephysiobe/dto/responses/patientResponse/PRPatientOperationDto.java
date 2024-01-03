package hr.dbasic.anephysiobe.dto.responses.patientResponse;

import lombok.Builder;

@Builder
public record PRPatientOperationDto(
        String id,
        String procedureName,
        String procedureDate
) {
}
