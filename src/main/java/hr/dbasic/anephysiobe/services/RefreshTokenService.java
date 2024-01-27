package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.models.users.RefreshToken;

public interface RefreshTokenService {
    RefreshToken createRefreshToken();
    
    RefreshToken refreshRefreshToken(String id);
    
    RefreshToken verifyRefreshToken(String id);
    
    RefreshToken getRefreshTokenById(String id);
}
