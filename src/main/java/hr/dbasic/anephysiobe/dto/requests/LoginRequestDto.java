package hr.dbasic.anephysiobe.dto.requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record LoginRequestDto(
        @NotNull(message = "Korisničko ime mora biti definirano!")
        @Size(min = 4, max = 20, message = "Korisničko ime mora imati najmanje 4 znaka a najviše 20!")
        String username,
        @NotNull(message = "Zaporka mora biti definirana!")
        @Size(min = 8, message = "Zaporka mora imati najmanje 8 znakova!")
        String password
) {

}
