package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.responses.DepartmentResponseDto;
import hr.dbasic.anephysiobe.models.departments.Department;
import lombok.NonNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DepartmentToDepartmentResponseDtoConverter implements Converter<Department, DepartmentResponseDto> {
    @Override
    public DepartmentResponseDto convert(@NonNull Department source) {
        return new DepartmentResponseDto(
                source.getId(),
                source.getName(),
                source.getBoxes()
        );
    }
}
