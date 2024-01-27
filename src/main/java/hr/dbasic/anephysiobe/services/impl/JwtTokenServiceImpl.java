package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.configuration.properties.JwtProperties;
import hr.dbasic.anephysiobe.converters.UserToJwtDtoConverter;
import hr.dbasic.anephysiobe.exceptions.AccessTokenExpiredException;
import hr.dbasic.anephysiobe.exceptions.InvalidAccessTokenException;
import hr.dbasic.anephysiobe.models.users.User;
import hr.dbasic.anephysiobe.services.JwtTokenService;
import hr.dbasic.anephysiobe.utils.ReflectionUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.jwt.*;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class JwtTokenServiceImpl implements JwtTokenService {
    private final UserToJwtDtoConverter userToJwtDtoConverter;
    private final JwtProperties jwtProperties;
    private final JwtEncoder jwtEncoder;
    private final JwtDecoder jwtDecoder;
    
    private Jwt decode(String token) {
        try {
            return jwtDecoder.decode(token);
        } catch (JwtValidationException ignored) {
            throw new AccessTokenExpiredException();
        } catch (JwtException ignored) {
            throw new InvalidAccessTokenException();
        }
    }
    
    @Override
    public String getSubject(String token) {
        return decode(token).getSubject();
    }
    
    @Override
    public Instant getExpiresAt(String token) {
        return decode(token).getExpiresAt();
    }
    
    @Override
    public String getUsername(String token) {
        return getSubject(token);
    }
    
    @Override
    public <T> T getClaim(String token, Function<Map<String, Object>, T> claimResolver) {
        return claimResolver.apply(decode(token).getClaims());
    }
    
    @Override
    public <T> T getClaim(String token, String claim) {
        return decode(token).getClaim(claim);
    }
    
    @Override
    public boolean isValid(String token, User user) {
        return !isExpired(token);
    }
    
    @Override
    public boolean isExpired(String token) {
        return getExpiresAt(token).isBefore(Instant.now());
    }
    
    @Override
    public String generate(User user) {
        return generate(
                ReflectionUtils.objectToMap(
                        Objects.requireNonNull(userToJwtDtoConverter.convert(user))
                )
        );
    }
    
    @Override
    public String generate(Map<String, Object> claims) {
        Instant now = Instant.now();
        JwtClaimsSet jwtClaimsSet = JwtClaimsSet.builder()
                .issuer("self")
                .issuedAt(now)
                .expiresAt(now.plus(jwtProperties.validityDurationInMs().toMillis(), ChronoUnit.MILLIS))
                .subject("anephysiobe")
                .claims(stringObjectMap -> stringObjectMap.putAll(claims))
                .build();
        return jwtEncoder.encode(JwtEncoderParameters.from(jwtClaimsSet)).getTokenValue();
    }
}
