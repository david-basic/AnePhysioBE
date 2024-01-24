package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.converters.CreateFunctionalDiagnosisRequestDtoToFunctionalDiagnosisConverter;
import hr.dbasic.anephysiobe.converters.FunctionalDiagnosisToFunctionalDiagnosisResponseDtoConverter;
import hr.dbasic.anephysiobe.converters.PhysioFileToPhysioFileResponseDtoConverter;
import hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest.UpdatePatientFunctionalDiagnosisSelectedStateRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest.CreateFunctionalDiagnosisRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest.DeleteFunctionalDiagnosisRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.functionalDiagnosisResponse.FunctionalDiagnosisResponseDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest.UpdateFunctionalDiagnosisRequestDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.FunctionalDiagnosis;
import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.PatientFunctionalDiagnosis;
import hr.dbasic.anephysiobe.repositories.FunctionalDiagnosisRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.PatientFunctionalDiagnosesRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.PhysioFileRepositoryMongo;
import hr.dbasic.anephysiobe.services.FunctionalDiagnosisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class FunctionalDiagnosisServiceImpl implements FunctionalDiagnosisService {
    private final PatientFunctionalDiagnosesRepositoryMongo patientFunctionalDiagnosesRepositoryMongo;
    private final FunctionalDiagnosisRepositoryMongo functionalDiagnosisRepositoryMongo;
    private final PhysioFileRepositoryMongo physioFileRepositoryMongo;
    private final CreateFunctionalDiagnosisRequestDtoToFunctionalDiagnosisConverter createFunctionalDiagnosisRequestDtoToFunctionalDiagnosisConverter;
    private final PhysioFileToPhysioFileResponseDtoConverter physioFileToPhysioFileResponseDtoConverter;
    private final FunctionalDiagnosisToFunctionalDiagnosisResponseDtoConverter functionalDiagnosisToFunctionalDiagnosisResponseDtoConverter;
    
    @Override
    public List<FunctionalDiagnosisResponseDto> findAllFunctionalDiagnoses() {
        return functionalDiagnosisRepositoryMongo.findAll().stream().map(functionalDiagnosisToFunctionalDiagnosisResponseDtoConverter::convert).toList();
    }
    
    @Override
    public PhysioFileResponseDto createFunctionalDiagnosis(CreateFunctionalDiagnosisRequestDto createFunctionalDiagnosisRequestDto) {
        FunctionalDiagnosis newFd = createFunctionalDiagnosisRequestDtoToFunctionalDiagnosisConverter.convert(createFunctionalDiagnosisRequestDto);
        
        functionalDiagnosisRepositoryMongo.save(Objects.requireNonNull(newFd));
        
        PatientFunctionalDiagnosis newPFD = PatientFunctionalDiagnosis.builder().functionalDiagnosis(newFd).build();
        patientFunctionalDiagnosesRepositoryMongo.save(newPFD);
        for (PhysioFile physioFile : physioFileRepositoryMongo.findAll()) {
            physioFile.getPatientFunctionalDiagnoses().add(newPFD);
            physioFileRepositoryMongo.save(physioFile);
        }
        
        PhysioFile foundPhysioFile = physioFileRepositoryMongo.findById(createFunctionalDiagnosisRequestDto.physioFileId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(foundPhysioFile);
    }
    
    @Override
    public PhysioFileResponseDto updateFunctionalDiagnosisById(String fdId, UpdateFunctionalDiagnosisRequestDto updateFunctionalDiagnosisRequestDto) {
        FunctionalDiagnosis foundFuncDiag = functionalDiagnosisRepositoryMongo.findById(fdId).orElseThrow(EntityNotFoundException.supplier("Functional diagnosis"));
        
        foundFuncDiag.setDescription(updateFunctionalDiagnosisRequestDto.description());
        functionalDiagnosisRepositoryMongo.save(foundFuncDiag);
        
        PhysioFile foundPhysioFile = physioFileRepositoryMongo.findById(updateFunctionalDiagnosisRequestDto.physioFileId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(foundPhysioFile);
    }
    
    @Override
    public PhysioFileResponseDto deleteFunctionalDiagnosisById(DeleteFunctionalDiagnosisRequestDto deleteFunctionalDiagnosisRequestDto) {
        PatientFunctionalDiagnosis foundPatientFuncDiag = patientFunctionalDiagnosesRepositoryMongo.findByFunctionalDiagnosisId(deleteFunctionalDiagnosisRequestDto.fdId()).orElseThrow(EntityNotFoundException.supplier("Patient functional diagnosis"));
        for (PhysioFile physioFile : physioFileRepositoryMongo.findAll()) {
            physioFile.getPatientFunctionalDiagnoses().removeIf(pfd -> Objects.equals(pfd.getId(), foundPatientFuncDiag.getId()));
            physioFileRepositoryMongo.save(physioFile);
        }
        
        patientFunctionalDiagnosesRepositoryMongo.deleteById(foundPatientFuncDiag.getId());
        
        functionalDiagnosisRepositoryMongo.deleteById(deleteFunctionalDiagnosisRequestDto.fdId());
        
        PhysioFile foundPhysioFile = physioFileRepositoryMongo.findById(deleteFunctionalDiagnosisRequestDto.physioFileId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(foundPhysioFile);
    }
    
    @Override
    public PhysioFileResponseDto updatePatientFunctionalDiagnosisSelectedStateById(String id, UpdatePatientFunctionalDiagnosisSelectedStateRequestDto updatePatientFunctionalDiagnosisSelectedStateRequestDto) {
        PatientFunctionalDiagnosis foundPFD = patientFunctionalDiagnosesRepositoryMongo.findById(id).orElseThrow(EntityNotFoundException.supplier("Patient functional diagnosis"));
        foundPFD.setSelected(updatePatientFunctionalDiagnosisSelectedStateRequestDto.selected());
        patientFunctionalDiagnosesRepositoryMongo.save(foundPFD);
        
        PhysioFile foundFile = physioFileRepositoryMongo.findById(updatePatientFunctionalDiagnosisSelectedStateRequestDto.physioFileId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(foundFile);
    }
}
