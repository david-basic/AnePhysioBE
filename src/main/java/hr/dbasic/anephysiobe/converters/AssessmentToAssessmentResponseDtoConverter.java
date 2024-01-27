package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.assessmentResponse.AssessmentResponseDto;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Assessment;
import lombok.NonNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AssessmentToAssessmentResponseDtoConverter implements Converter<Assessment, AssessmentResponseDto> {
    @Override
    public AssessmentResponseDto convert(@NonNull Assessment source) {
        return new AssessmentResponseDto(
                source.getId(),
                source.getPatientRass(),
                source.getNotes()
        );
    }
}
