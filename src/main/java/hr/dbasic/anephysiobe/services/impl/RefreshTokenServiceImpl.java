package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.configuration.properties.JwtProperties;
import hr.dbasic.anephysiobe.exceptions.InvalidRefreshTokenException;
import hr.dbasic.anephysiobe.exceptions.RefreshTokenExpiredException;
import hr.dbasic.anephysiobe.models.RefreshToken;
import hr.dbasic.anephysiobe.repositories.RefreshTokenRepositoryMongo;
import hr.dbasic.anephysiobe.services.RefreshTokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class RefreshTokenServiceImpl implements RefreshTokenService {
    
    private final JwtProperties jwtProperties;
    
    private final RefreshTokenRepositoryMongo refreshTokenRepositoryMongo;
    
    private void initializeRefreshToken(RefreshToken refreshToken) {
        LocalDateTime now = LocalDateTime.now();
        refreshToken.setExpireDateTime(now.plusSeconds(jwtProperties.refreshValidityDurationInMs().getSeconds()));
    }
    
    @Transactional
    @Override
    public RefreshToken createRefreshToken() {
        RefreshToken refreshToken = RefreshToken.builder().build();
        initializeRefreshToken(refreshToken);
        return refreshTokenRepositoryMongo.save(refreshToken);
    }
    
    @Transactional
    @Override
    public RefreshToken refreshRefreshToken(String id) {
        RefreshToken refreshToken = getRefreshTokenById(id);
        initializeRefreshToken(refreshToken);
        return refreshTokenRepositoryMongo.save(refreshToken);
    }
    
    @Override
    public RefreshToken verifyRefreshToken(String id) {
        RefreshToken refreshToken = getRefreshTokenById(id);
        if (refreshToken.isExpired())
            throw new RefreshTokenExpiredException();
        return refreshToken;
    }
    
    @Override
    public RefreshToken getRefreshTokenById(String id) {
        return refreshTokenRepositoryMongo.findRefreshTokenById(id)
                .orElseThrow(InvalidRefreshTokenException::new);
    }
}
