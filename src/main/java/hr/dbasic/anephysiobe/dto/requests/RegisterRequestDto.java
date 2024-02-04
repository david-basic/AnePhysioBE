package hr.dbasic.anephysiobe.dto.requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record RegisterRequestDto(
        @NotNull(message = "First name must be input!")
        @Size(min = 2, max = 70, message = "First name must have at least 2 characters and 70 at most!")
        String firstName,
        @NotNull(message = "Last name must be input!")
        @Size(min = 2, max = 70, message = "Last name must have at least 2 characters and 70 at most!")
        String lastName,
        @NotNull(message = "Title has to be defined!")
        @Size(min = 4, message = "Title has to have at least 4 characters!")
        String title,
        @NotNull(message = "Sex has to be defined!")
        String sex,
        @NotNull(message = "Username must be input!")
        @Size(min = 4, max = 20, message = "Username must have 4 characters at least and 20 at most!")
        String username,
        @NotNull(message = "Password must be input!")
        @Size(min = 8, message = "Password must have 8 characters at least!")
        @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,255}$", message = "Password must contain at least 1 number, 1 lowercase, 1 uppercase and 1 special character and it must not contain spaces!")
        String password
) {

}
