package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.responses.patientResponse.PRDoctorDto;
import hr.dbasic.anephysiobe.dto.responses.patientResponse.PRPatientAddressDto;
import hr.dbasic.anephysiobe.dto.responses.patientResponse.PRPatientOperationDto;
import hr.dbasic.anephysiobe.dto.responses.patientResponse.PatientResponseDto;
import hr.dbasic.anephysiobe.models.patients.Patient;
import lombok.NonNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PatientToPatientResponseDtoConverter implements Converter<Patient, PatientResponseDto> {
    @Override
    public PatientResponseDto convert(@NonNull Patient source) {
        return new PatientResponseDto(
                source.getId(),
                source.getIdentificationNumber(),
                source.getFirstName(),
                source.getLastName(),
                source.getDob(),
                source.getSex(),
                source.getLeadingMkb(),
                source.getPatientMkbs(),
                source.getOperations().stream().map(op -> PRPatientOperationDto.builder()
                        .id(op.getId())
                        .procedureName(op.getProcedureName())
                        .procedureDate(op.getProcedureDate())
                        .build()
                ).toList(),
                source.getAdmissionDateTime(),
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
