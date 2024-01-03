package hr.dbasic.anephysiobe.dto.responses.patientResponse;

import hr.dbasic.anephysiobe.models.patients.PatientMkb;
import hr.dbasic.anephysiobe.models.patients.Sex;
import lombok.Builder;

import java.math.BigInteger;
import java.util.List;

@Builder
public record PatientResponseDto(
        String id,
        BigInteger identificationNumber,
        String firstName,
        String lastName,
        String birthDate,
        Sex sex,
        PatientMkb leadingMkb,
        List<PatientMkb> patientMkbs,
        List<PRPatientOperationDto> operations,
        String admissionDateTime,
        PRPatientAddressDto patientAddress,
        PRDoctorDto leadingDoctor,
        Integer patientAge
) {
}
