package hr.dbasic.anephysiobe.dto.responses;

import lombok.Builder;

@Builder
public record AuthResponseDto(
        String accessToken,
        String refreshToken,
        String tokenType
) {

}
