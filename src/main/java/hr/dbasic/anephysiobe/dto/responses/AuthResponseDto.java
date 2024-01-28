package hr.dbasic.anephysiobe.dto.responses;

import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PFRUserDto;
import lombok.Builder;

@Builder
public record AuthResponseDto(
        String accessToken,
        String refreshToken,
        String tokenType,
        PFRUserDto user
) {

}
