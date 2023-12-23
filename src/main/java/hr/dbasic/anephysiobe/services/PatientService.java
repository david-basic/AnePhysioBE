package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.responses.patientResponse.PatientResponseDto;

import java.util.List;

public interface PatientService {
    List<PatientResponseDto> getAllPatients();
    PatientResponseDto getPatientById(String id);
}
