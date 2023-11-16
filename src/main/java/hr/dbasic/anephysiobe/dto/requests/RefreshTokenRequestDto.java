package hr.dbasic.anephysiobe.dto.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record RefreshTokenRequestDto(
        @NotNull(message = "Refresh token has to exist!")
        String refreshToken
) {
}
