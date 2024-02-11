package hr.dbasic.anephysiobe.dto.requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record RegisterRequestDto(
        @NotNull(message = "Ime mora biti definirano!")
        @Size(min = 2, max = 70, message = "Ime mora imati najmanje 2, najviše 70 znakova!")
        String firstName,
        @NotNull(message = "Prezime mora biti definirano!")
        @Size(min = 2, max = 70, message = "Prezime mora imati najmanje 2, najviše 70 znakova!")
        String lastName,
        @NotNull(message = "Titula mora biti definirana!")
        @Size(min = 4, message = "Titula mora imati najmanje 4 znaka!")
        String title,
        @NotNull(message = "Spol mora biti definiran!")
        String sex,
        @NotNull(message = "Korisničko ime mora biti definirano!")
        @Size(min = 4, max = 20, message = "Korisničko ime mora imati najmanje 4, najviše 20 znakova!")
        String username,
        @NotNull(message = "Zaporka mora biti definirana!")
        @Size(min = 8, message = "Zaporka mora imati najmanje 8 znakova!")
        @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,255}$", message = "Zaporka se mora sastojati od najmanje 1 broja, 1 malog, 1 velikog slova i jednog posebnog znaka te ne smije sadržavati razmake!")
        String password
) {

}
