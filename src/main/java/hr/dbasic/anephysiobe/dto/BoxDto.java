package hr.dbasic.anephysiobe.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record BoxDto(
        String id,
        String name,
        List<BedDto> beds
) {
}
