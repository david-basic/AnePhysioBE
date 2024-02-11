package hr.dbasic.anephysiobe.validators;

import hr.dbasic.anephysiobe.dto.requests.RegisterRequestDto;
import hr.dbasic.anephysiobe.exceptions.UserExistsException;
import hr.dbasic.anephysiobe.repositories.UserRepositoryMongo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RegisterDtoValidator implements Validator<RegisterRequestDto> {

    private final UserRepositoryMongo userRepositoryMongo;

    @Override
    public void validate(RegisterRequestDto target) {
        if (userRepositoryMongo.existsByUsername(target.username())) {
            throw new UserExistsException("Korisničko ime je zauzeto!");
        }
    }
}
