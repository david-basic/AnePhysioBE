package hr.dbasic.anephysiobe.dto.requests.physiofile.assessment;

import lombok.Builder;

import java.util.List;

@Builder
public record CreateOrUpdatePointsOfPainRequestDto(
        String physioFileId,
        List<PointDto> pointsOfPain
) {
}
