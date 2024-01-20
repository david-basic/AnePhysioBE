package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.functionalDiagnosisResponse.FunctionalDiagnosisResponseDto;
import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.FunctionalDiagnosis;
import lombok.NonNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FunctionalDiagnosisToFunctionalDiagnosisResponseDtoConverter implements Converter<FunctionalDiagnosis, FunctionalDiagnosisResponseDto> {
    @Override
    public FunctionalDiagnosisResponseDto convert(@NonNull FunctionalDiagnosis source) {
        return new FunctionalDiagnosisResponseDto(
                source.getId(),
                source.getDescription()
        );
    }
}
