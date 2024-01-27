package hr.dbasic.anephysiobe.dto.responses.departmentResponse;

import lombok.Builder;

@Builder
public record DRBedDto(
        String id,
        DRPatientDto patient,
        Boolean bedIsEmpty
) {
}
