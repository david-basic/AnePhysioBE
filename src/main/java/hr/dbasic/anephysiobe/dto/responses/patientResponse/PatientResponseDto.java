package hr.dbasic.anephysiobe.dto.responses.patientResponse;

import hr.dbasic.anephysiobe.models.patients.Mkb;
import hr.dbasic.anephysiobe.models.patients.PatientAddress;
import hr.dbasic.anephysiobe.models.patients.PatientOperation;
import hr.dbasic.anephysiobe.models.patients.Sex;
import lombok.Builder;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Builder
public record PatientResponseDto(
        String id,
        BigInteger identificationNumber,
        String firstName,
        String lastName,
        LocalDate dob,
        Sex sex,
        Mkb leadingMkb,
        List<Mkb> patientMkbs,
        List<PatientOperation> operations,
        LocalDateTime admissionDateTime,
        PRPatientAddressDto patientAddress,
        PRDoctorDto leadingDoctor,
        Integer patientAge
) {
}
