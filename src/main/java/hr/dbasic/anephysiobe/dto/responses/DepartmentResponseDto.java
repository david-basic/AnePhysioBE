package hr.dbasic.anephysiobe.dto.responses;

import hr.dbasic.anephysiobe.models.Box;
import hr.dbasic.anephysiobe.models.departments.DepartmentLocality;
import lombok.Builder;

import java.util.List;

@Builder
public record DepartmentResponseDto(
        String id,
        String name,
        String shorthand,
        List<Box> boxes,
        DepartmentLocality locality
) {
}
