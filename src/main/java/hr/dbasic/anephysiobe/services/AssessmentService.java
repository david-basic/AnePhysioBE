package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.requests.DeletePatientRassRequestDto;

public interface AssessmentService {
    void deletePatientRassByIdInAssessmentById(DeletePatientRassRequestDto deletePatientRassRequestDto);
}
