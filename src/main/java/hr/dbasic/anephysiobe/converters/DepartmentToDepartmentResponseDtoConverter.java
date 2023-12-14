package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.responses.departmentResponse.DRBedDto;
import hr.dbasic.anephysiobe.dto.responses.departmentResponse.DRBoxDto;
import hr.dbasic.anephysiobe.dto.responses.departmentResponse.DRPatientDto;
import hr.dbasic.anephysiobe.dto.responses.departmentResponse.DepartmentResponseDto;
import hr.dbasic.anephysiobe.models.departments.Department;
import lombok.NonNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DepartmentToDepartmentResponseDtoConverter implements Converter<Department, DepartmentResponseDto> {
    @Override
    public DepartmentResponseDto convert(@NonNull Department source) {
        return new DepartmentResponseDto(
                source.getId(),
                source.getName(),
                source.getShorthand(),
                source.getBoxes().stream().map(box -> DRBoxDto.builder()
                        .id(box.getId())
                        .name(box.getName())
                        .beds(box.getBedList().stream().map(bed -> DRBedDto.builder()
                                .id(bed.getId())
                                .patient(Objects.isNull(bed.getPatient()) ?
                                                 null : DRPatientDto.builder()
                                        .id(bed.getPatient().getId())
                                        .firstName(bed.getPatient().getFirstName())
                                        .lastName(bed.getPatient().getLastName())
                                        .build()
                                )
                                .bedIsEmpty(bed.bedIsEmpty())
                                .build()).toList())
                        .build()).toList(),
                source.getLocality()
        );
    }
}
