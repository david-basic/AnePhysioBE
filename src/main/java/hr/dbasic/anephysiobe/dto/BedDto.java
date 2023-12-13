package hr.dbasic.anephysiobe.dto;

import lombok.Builder;

@Builder
public record BedDto(
        String id,
        PatientDto patient,
        Boolean bedIsEmpty
) {
}
