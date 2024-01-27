package hr.dbasic.anephysiobe.dto.responses.departmentResponse;

import hr.dbasic.anephysiobe.models.departments.DepartmentLocality;
import lombok.Builder;

import java.util.List;

@Builder
public record DepartmentResponseDto(
        String id,
        String name,
        String shorthand,
        List<DRBoxDto> boxes,
        DepartmentLocality locality
) {
}
