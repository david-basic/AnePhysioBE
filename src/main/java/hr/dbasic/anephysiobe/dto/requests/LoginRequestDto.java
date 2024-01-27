package hr.dbasic.anephysiobe.dto.requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record LoginRequestDto(
        @NotNull(message = "Username must be input!")
        @Size(min = 4, max = 20, message = "Username must have 4 characters at least and 20 at most!")
        String username,
        @NotNull(message = "Password must be input!")
        @Size(min = 8, message = "Password must have 8 characters at least!")
        String password
) {

}
