package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.converters.PhysioFileToPhysioFileResponseDtoConverter;
import hr.dbasic.anephysiobe.dto.requests.physiofile.UpdatePhysioFileRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Assessment;
import hr.dbasic.anephysiobe.repositories.PatientFunctionalDiagnosesRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.PhysioFileRepositoryMongo;
import hr.dbasic.anephysiobe.services.AssessmentService;
import hr.dbasic.anephysiobe.services.PhysioFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhysioFileServiceImpl implements PhysioFileService {
    private final PhysioFileRepositoryMongo physioFileRepositoryMongo;
    private final PhysioFileToPhysioFileResponseDtoConverter physioFileToPhysioFileResponseDtoConverter;
    private final AssessmentService assessmentService;
    private final PatientFunctionalDiagnosesRepositoryMongo patientFunctionalDiagnosesRepositoryMongo;
    
    @Override
    public PhysioFileResponseDto getPhysioFileByPatientId(String id) {
        PhysioFile foundFile = physioFileRepositoryMongo.findPhysioFileByPatientId(id).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(foundFile);
    }
    
    @Override
    public List<PhysioFileResponseDto> getAllPhysioFiles() {
        return physioFileRepositoryMongo.findAll().stream().map(
                physioFileToPhysioFileResponseDtoConverter::convert
        ).toList();
    }
    
    @Override
    public PhysioFileResponseDto updatePhysioFileById(String physioFileId, UpdatePhysioFileRequestDto updatePhysioFileRequestDto) {
        PhysioFile foundFile = physioFileRepositoryMongo.findById(physioFileId).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        
        Assessment foundAssessment = assessmentService.getAssessmentById(foundFile.getAssessment().getId());
        foundAssessment.setNotes(updatePhysioFileRequestDto.assessmentNotes());
        assessmentService.saveAssessment(foundAssessment);
        
        patientFunctionalDiagnosesRepositoryMongo.saveAll(updatePhysioFileRequestDto.patientFunctionalDiagnoses());
        
        
        foundFile.setPatientGoals(updatePhysioFileRequestDto.patientGoals());
        foundFile.setPatientPlans(updatePhysioFileRequestDto.patientPlans());
        foundFile.setNotes(updatePhysioFileRequestDto.notes());
        foundFile.setConclussion(updatePhysioFileRequestDto.conclussion());
        
        physioFileRepositoryMongo.save(foundFile);
        return physioFileToPhysioFileResponseDtoConverter.convert(foundFile);
    }
}
