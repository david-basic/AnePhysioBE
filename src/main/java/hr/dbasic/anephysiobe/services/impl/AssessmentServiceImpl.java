package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.dto.requests.DeletePatientRassRequestDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Assessment;
import hr.dbasic.anephysiobe.repositories.AssessmentRepositoryMongo;
import hr.dbasic.anephysiobe.services.AssessmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AssessmentServiceImpl implements AssessmentService {
    private final AssessmentRepositoryMongo assessmentRepositoryMongo;
    @Override
    public void deletePatientRassByIdInAssessmentById(DeletePatientRassRequestDto deletePatientRassRequestDto) {
        Assessment foundAssessment = assessmentRepositoryMongo.findById(deletePatientRassRequestDto.assessmentId()).orElseThrow(EntityNotFoundException.supplier("Assessment"));
        
        foundAssessment.getPatientRass().removeIf(pr -> Objects.equals(pr.getId(), deletePatientRassRequestDto.patientRassId()));
        
        assessmentRepositoryMongo.save(foundAssessment);
    }
}
