package hr.dbasic.anephysiobe.dto.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record RefreshTokenRequestDto(
        @NotNull(message = "Token za osvježavanje mora biti definiran!")
        String refreshToken
) {
}
