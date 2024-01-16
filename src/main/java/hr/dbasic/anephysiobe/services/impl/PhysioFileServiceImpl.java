package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.converters.CreatePatientRassRequestToPatientRassConverter;
import hr.dbasic.anephysiobe.converters.PhysioFileToPhysioFileResponseDtoConverter;
import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.CreatePatientRassRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Assessment;
import hr.dbasic.anephysiobe.models.physiofile.assessment.PatientRass;
import hr.dbasic.anephysiobe.repositories.AssessmentRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.PhysioFileRepositoryMongo;
import hr.dbasic.anephysiobe.services.PhysioFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhysioFileServiceImpl implements PhysioFileService {
    private final PhysioFileRepositoryMongo physioFileRepositoryMongo;
    private final AssessmentRepositoryMongo assessmentRepositoryMongo;
    private final PhysioFileToPhysioFileResponseDtoConverter physioFileToPhysioFileResponseDtoConverter;
    private final CreatePatientRassRequestToPatientRassConverter createPatientRassRequestToPatientRassConverter;
    
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
    public PhysioFileResponseDto createPatientRass(CreatePatientRassRequestDto createPatientRassRequestDto) {
        PatientRass newPR = createPatientRassRequestToPatientRassConverter.convert(createPatientRassRequestDto);
        Assessment foundAssessment = assessmentRepositoryMongo.findById(createPatientRassRequestDto.assessmentId()).orElseThrow(EntityNotFoundException.supplier("Assessment"));
        
        foundAssessment.getPatientRass().add(newPR);
        assessmentRepositoryMongo.save(foundAssessment);
        
        PhysioFile foundFile = physioFileRepositoryMongo.findPhysioFileByAssessmentId(createPatientRassRequestDto.assessmentId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(foundFile);
    }
}
