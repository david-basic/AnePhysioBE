package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.PointDto;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Point;
import hr.dbasic.anephysiobe.services.RandomNumberService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PointDtoToPointConverter implements Converter<PointDto, Point> {
    private final RandomNumberService randomNumberService;
    
    @Override
    public Point convert(@NonNull PointDto source) {
        return Point.builder()
                .id(randomNumberService.generateRandomBigInteger(false, 9).toString())
                .x(source.x())
                .y(source.y())
                .build();
    }
}
