package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.requests.RegisterRequestDto;
import hr.dbasic.anephysiobe.models.users.RoleEnum;
import hr.dbasic.anephysiobe.models.users.User;
import hr.dbasic.anephysiobe.services.UserRoleService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class RegisterRequestDtoToUserConverter implements Converter<RegisterRequestDto, User> {

    private final PasswordEncoder passwordEncoder;
    private final UserRoleService userRoleService;

    @Override
    public User convert(@NonNull RegisterRequestDto source) {
        return User.builder()
                .createDate(LocalDate.now())
                .firstName(source.firstName())
                .lastName(source.lastName())
                .username(source.username())
                .password(passwordEncoder.encode(source.password()))
                .enabled(true)
                .role(userRoleService.getUserRole(RoleEnum.ROLE_ADMIN))
                .build();
    }
}
