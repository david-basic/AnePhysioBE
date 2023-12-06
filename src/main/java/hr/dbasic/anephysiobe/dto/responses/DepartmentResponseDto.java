package hr.dbasic.anephysiobe.dto.responses;

import hr.dbasic.anephysiobe.models.Box;
import lombok.Builder;

import java.util.List;

@Builder
public record DepartmentResponseDto(
        String id,
        String name,
        List<Box> boxes
) {
}
