package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.responses.patientResponse.*;
import hr.dbasic.anephysiobe.models.patients.Patient;
import hr.dbasic.anephysiobe.services.MkbService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class PatientToPatientResponseDtoConverter implements Converter<Patient, PatientResponseDto> {
    private final MkbService mkbService;
    
    @Override
    public PatientResponseDto convert(@NonNull Patient source) {
        return new PatientResponseDto(
                source.getId(),
                source.getIdentificationNumber(),
                source.getFirstName(),
                source.getLastName(),
                DateTimeFormatter.ISO_LOCAL_DATE.format(source.getDob()),
                source.getSex(),
                PRPatientMkbDto.builder()
                        .id(source.getLeadingMkb().getId())
                        .mkbCode(mkbService.findMkbByCode(source.getLeadingMkb().getMkbCode().getCode()))
                        .patientId(source.getLeadingMkb().getPatient().getId())
                        .displayName(source.getLeadingMkb().toString())
                        .build(),
                source.getPatientMkbs().stream().map(patientMkb -> PRPatientMkbDto.builder()
                        .id(patientMkb.getId())
                        .mkbCode(mkbService.findMkbByCode(patientMkb.getMkbCode().getCode()))
                        .patientId(patientMkb.getPatient().getId())
                        .displayName(patientMkb.toString())
                        .build()).toList(),
                Objects.isNull(source.getOperations()) ? null : source.getOperations().stream().map(op -> PRPatientOperationDto.builder()
                        .id(op.getId())
                        .procedureName(op.getProcedureName())
                        .procedureDate(DateTimeFormatter.ISO_LOCAL_DATE.format(op.getProcedureDate()))
                        .build()
                ).toList(),
                DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(source.getAdmissionDateTime()),
                PRPatientAddressDto.builder()
                        .id(source.getId())
                        .fullAddress(source.getPatientAddress().toString())
                        .build(),
                PRDoctorDto.builder()
                        .id(source.getLeadingDoctor().getId())
                        .role(source.getLeadingDoctor().getRole())
                        .fullNameAndTitles(source.getLeadingDoctor().toString())
                        .build(),
                source.getPatientAge()
        );
    }
}
