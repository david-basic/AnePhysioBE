package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.responses.patientResponse.PatientResponseDto;
import hr.dbasic.anephysiobe.models.patients.Patient;

import java.util.List;

public interface PatientService {
    List<PatientResponseDto> getAllPatients();
    PatientResponseDto getPatientResponseDtoById(String id);
    Patient getPatientById(String id);
}
