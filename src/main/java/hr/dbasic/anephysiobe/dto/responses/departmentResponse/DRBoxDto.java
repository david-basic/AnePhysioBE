package hr.dbasic.anephysiobe.dto.responses.departmentResponse;

import lombok.Builder;

import java.util.List;

@Builder
public record DRBoxDto(
        String id,
        String name,
        List<DRBedDto> beds
) {
}
