package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.converters.PatientToPatientResponseDtoConverter;
import hr.dbasic.anephysiobe.dto.responses.patientResponse.PatientResponseDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.patients.Patient;
import hr.dbasic.anephysiobe.repositories.PatientRepositoryMongo;
import hr.dbasic.anephysiobe.services.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepositoryMongo patientRepositoryMongo;
    private final PatientToPatientResponseDtoConverter patientToPatientResponseDtoConverter;
    
    @Override
    public List<PatientResponseDto> getAllPatients() {
        return patientRepositoryMongo.findAll().stream().map(
                patientToPatientResponseDtoConverter::convert
        ).toList();
    }
    
    @Override
    public PatientResponseDto getPatientById(String id) {
        Patient foundPatient = patientRepositoryMongo.findById(id).orElseThrow(EntityNotFoundException.supplier("Patient"));
        return patientToPatientResponseDtoConverter.convert(foundPatient);
    }
}
