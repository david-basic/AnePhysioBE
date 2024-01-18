package hr.dbasic.anephysiobe.dto.responses.physioFileResponse.assessmentResponse;

import hr.dbasic.anephysiobe.models.physiofile.assessment.PatientRass;
import lombok.Builder;

import java.util.List;

@Builder
public record AssessmentResponseDto(
        String id,
        List<PatientRass> patientRass,
        String notes
) {
}
