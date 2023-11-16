package hr.dbasic.anephysiobe.dto.responses;

import hr.dbasic.anephysiobe.models.users.User;
import lombok.Builder;

import java.util.UUID;

@Builder
public record AuthResponseDto(
        String accessToken,
        String refreshToken,
        String tokenType
) {

}
