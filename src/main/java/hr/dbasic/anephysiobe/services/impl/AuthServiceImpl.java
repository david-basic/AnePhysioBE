package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.converters.RegisterRequestDtoToUserConverter;
import hr.dbasic.anephysiobe.converters.UserToAuthResponseDtoConverter;
import hr.dbasic.anephysiobe.dto.requests.LoginRequestDto;
import hr.dbasic.anephysiobe.dto.requests.RefreshTokenRequestDto;
import hr.dbasic.anephysiobe.dto.requests.RegisterRequestDto;
import hr.dbasic.anephysiobe.dto.responses.AuthResponseDto;
import hr.dbasic.anephysiobe.models.users.RefreshToken;
import hr.dbasic.anephysiobe.models.users.User;
import hr.dbasic.anephysiobe.repositories.RefreshTokenRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.UserRepositoryMongo;
import hr.dbasic.anephysiobe.services.AuthService;
import hr.dbasic.anephysiobe.services.RefreshTokenService;
import hr.dbasic.anephysiobe.validators.RegisterDtoValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final RegisterDtoValidator registerDtoValidator;
    private final RegisterRequestDtoToUserConverter registerRequestDtoToUserConverter;
    private final UserRepositoryMongo userRepositoryMongo;
    private final AuthenticationManager authenticationManager;
    private final RefreshTokenService refreshTokenService;
    private final UserToAuthResponseDtoConverter userToAuthResponseDtoConverter;
    private final RefreshTokenRepositoryMongo refreshTokenRepositoryMongo;
    
    @Transactional
    @Override
    public void register(RegisterRequestDto registerRequestDto) {
        registerDtoValidator.validate(registerRequestDto);
        RefreshToken refreshToken = refreshTokenService.createRefreshToken();
        User user = Objects.requireNonNull(registerRequestDtoToUserConverter.convert(registerRequestDto));
        user.setRefreshToken(refreshToken);
        userRepositoryMongo.save(user);
        refreshToken.setUser(user);
        refreshTokenRepositoryMongo.save(refreshToken);
    }
    
    @Transactional
    @Override
    public AuthResponseDto login(LoginRequestDto loginRequestDto) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequestDto.username(), loginRequestDto.password())
            );
            User user = userRepositoryMongo.findByUsername(authentication.getName())
                    .orElseThrow(() -> new UsernameNotFoundException(authentication.getName()));
            user.setRefreshToken(refreshTokenService.refreshRefreshToken(user.getRefreshToken().getId()));
            return userToAuthResponseDtoConverter.convert(user);
        } catch (AuthenticationException e) {
            userRepositoryMongo.findByUsername(loginRequestDto.username())
                    .ifPresentOrElse(
                            user -> {
                                if (!user.isEnabled()) {
                                    throw new DisabledException("Korisniku nije omogućen pristup!");
                                }
                                if (!user.isAccountNonLocked()) {
                                    throw new LockedException("Korisnik je zaključan!");
                                }
                                throw new BadCredentialsException("Kredencijali nisu valjani!");
                            },
                            () -> {
                                throw new BadCredentialsException("Korisnik %s ne postoji!".formatted(loginRequestDto.username()));
                            }
                    );
            throw new IllegalStateException();
        }
    }
    
    @Transactional
    @Override
    public AuthResponseDto refreshToken(RefreshTokenRequestDto requestDto) {
        RefreshToken refreshToken = refreshTokenService.verifyRefreshToken(requestDto.refreshToken());
        return userToAuthResponseDtoConverter.convert(refreshToken.getUser());
    }
}
