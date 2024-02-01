package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.CreateOrUpdatePointsOfPainRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.CreatePatientRassRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.DeletePatientRassRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.UpdatePatientRassRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.assessmentResponse.AssessmentResponseDto;

import java.util.List;

public interface AssessmentService {
    List<AssessmentResponseDto> getAllAssessments();
    PhysioFileResponseDto createPatientRass(CreatePatientRassRequestDto createPatientRassRequestDto);
    PhysioFileResponseDto updatePatientRassById(String id, UpdatePatientRassRequestDto updatePatientRassRequestDto);
    void deletePatientRassByIdInAssessmentById(DeletePatientRassRequestDto deletePatientRassRequestDto);
    PhysioFileResponseDto createAssessmentOnPhysioFileWithId(String id);
    PhysioFileResponseDto updatePointsOfPainByAssessmentId(String id, CreateOrUpdatePointsOfPainRequestDto updatePatientRassRequestDto);
}
