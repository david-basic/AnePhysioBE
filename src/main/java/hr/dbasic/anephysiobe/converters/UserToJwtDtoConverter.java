package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.JwtDto;
import hr.dbasic.anephysiobe.models.users.User;
import lombok.NonNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserToJwtDtoConverter implements Converter<User, JwtDto> {
    @Override
    public JwtDto convert(@NonNull User source) {
        return new JwtDto(
                source.getId()
        );
    }
}
