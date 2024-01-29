package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.requests.physiofile.procedure.CreateProcedureRequestDto;
import hr.dbasic.anephysiobe.models.physiofile.procedures.Procedure;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateProcedureRequestDtoToProcedureConverter implements Converter<CreateProcedureRequestDto, Procedure> {
    @Override
    public Procedure convert(@NonNull CreateProcedureRequestDto source) {
        return Procedure.builder()
                .description(source.description())
                .build();
    }
}
