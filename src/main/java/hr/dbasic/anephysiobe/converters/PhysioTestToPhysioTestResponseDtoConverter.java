package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.physiotestResponse.PhysioTestResponseDto;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.PhysioTest;
import lombok.NonNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PhysioTestToPhysioTestResponseDtoConverter implements Converter<PhysioTest, PhysioTestResponseDto> {
    @Override
    public PhysioTestResponseDto convert(@NonNull PhysioTest source) {
        return new PhysioTestResponseDto(
                source.getId(),
                source.getCpax(),
                source.getGcs(),
                source.getMmt(),
                source.getVas()
        );
    }
}
