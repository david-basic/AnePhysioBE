package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.responses.AuthResponseDto;
import hr.dbasic.anephysiobe.models.users.User;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserToAuthResponseDtoConverter implements Converter<User, AuthResponseDto> {
    @Override
    public AuthResponseDto convert(@NonNull User source) {
        return new AuthResponseDto(source);
    }
}
