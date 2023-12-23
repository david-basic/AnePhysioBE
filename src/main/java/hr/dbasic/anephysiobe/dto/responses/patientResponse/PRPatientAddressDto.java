package hr.dbasic.anephysiobe.dto.responses.patientResponse;

import lombok.Builder;

@Builder
public record PRPatientAddressDto(
        String id,
        String fullAddress
) {
}
