package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.DeletePatientRassRequestDto;

public interface AssessmentService {
    void deletePatientRassByIdInAssessmentById(DeletePatientRassRequestDto deletePatientRassRequestDto);
}
