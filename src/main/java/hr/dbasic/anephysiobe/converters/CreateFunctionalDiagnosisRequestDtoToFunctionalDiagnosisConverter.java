package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.functionalDiagnosisResponse.CreateFunctionalDiagnosisRequestDto;
import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.FunctionalDiagnosis;
import lombok.NonNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CreateFunctionalDiagnosisRequestDtoToFunctionalDiagnosisConverter implements Converter<CreateFunctionalDiagnosisRequestDto, FunctionalDiagnosis> {
    @Override
    public FunctionalDiagnosis convert(@NonNull CreateFunctionalDiagnosisRequestDto source) {
        return FunctionalDiagnosis.builder().description(source.description()).build();
    }
}
