package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.responses.AuthResponseDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PFRUserDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.mappings.JwtMappings;
import hr.dbasic.anephysiobe.models.users.User;
import hr.dbasic.anephysiobe.repositories.UserRepositoryMongo;
import hr.dbasic.anephysiobe.services.JwtTokenService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserToAuthResponseDtoConverter implements Converter<User, AuthResponseDto> {
    private final JwtTokenService jwtTokenService;
    private final UserRepositoryMongo userRepositoryMongo;
    
    @Override
    public AuthResponseDto convert(@NonNull User source) {
        
        User user = userRepositoryMongo.findById(source.getId()).orElseThrow(EntityNotFoundException.supplier("User"));
        PFRUserDto loggedInUser = PFRUserDto.builder().id(user.getId()).firstName(user.getFirstName()).lastName(user.getLastName()).build();
        
        return new AuthResponseDto(
                jwtTokenService.generate(source),
                source.getRefreshToken().getId(),
                JwtMappings.tokenType,
                loggedInUser
        );
    }
}
