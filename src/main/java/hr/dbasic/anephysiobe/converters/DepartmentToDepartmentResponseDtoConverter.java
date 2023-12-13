package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.BedDto;
import hr.dbasic.anephysiobe.dto.BoxDto;
import hr.dbasic.anephysiobe.dto.PatientDto;
import hr.dbasic.anephysiobe.dto.responses.DepartmentResponseDto;
import hr.dbasic.anephysiobe.models.Box;
import hr.dbasic.anephysiobe.models.departments.Department;
import lombok.NonNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class DepartmentToDepartmentResponseDtoConverter implements Converter<Department, DepartmentResponseDto> {
    @Override
    public DepartmentResponseDto convert(@NonNull Department source) {
        return new DepartmentResponseDto(
                source.getId(),
                source.getName(),
                source.getShorthand(),
                source.getBoxes().stream().map(box -> BoxDto.builder()
                        .id(box.getId())
                        .name(box.getName())
                        .beds(box.getBedList().stream().map(bed -> BedDto.builder()
                                .id(bed.getId())
                                .patient(Objects.isNull(bed.getPatient()) ?
                                                 null : PatientDto.builder()
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
