package hr.dbasic.anephysiobe.dto.responses;

import hr.dbasic.anephysiobe.dto.BoxDto;
import hr.dbasic.anephysiobe.models.departments.DepartmentLocality;
import lombok.Builder;

import java.util.List;

@Builder
public record DepartmentResponseDto(
        String id,
        String name,
        String shorthand,
        List<BoxDto> boxes,
        DepartmentLocality locality
) {
}
