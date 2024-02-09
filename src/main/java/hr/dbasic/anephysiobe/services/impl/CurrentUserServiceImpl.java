package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.dto.JwtDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.users.User;
import hr.dbasic.anephysiobe.repositories.UserRepositoryMongo;
import hr.dbasic.anephysiobe.services.CurrentUserService;
import hr.dbasic.anephysiobe.services.JwtTokenRequestExtractorService;
import hr.dbasic.anephysiobe.services.JwtTokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrentUserServiceImpl implements CurrentUserService {
    private final UserRepositoryMongo userRepositoryMongo;
    private final JwtTokenService jwtTokenService;
    private final JwtTokenRequestExtractorService jwtTokenRequestExtractorService;
    
    @Override
    public User getCurrentUser() {
        return userRepositoryMongo.findById(jwtTokenService.getClaim(jwtTokenRequestExtractorService.getToken(), JwtDto.ClaimResolvers.userIdResolver))
                .orElseThrow(EntityNotFoundException::new);
    }
}
