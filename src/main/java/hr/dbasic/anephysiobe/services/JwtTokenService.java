package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.models.users.User;

import java.time.Instant;
import java.util.Map;
import java.util.function.Function;

public interface JwtTokenService {
    String getSubject(String token);
    
    Instant getExpiresAt(String token);
    
    String getUsername(String token);
    
    <T> T getClaim(String token, Function<Map<String, Object>, T> claimResolver);
    
    <T> T getClaim(String token, String claim);
    
    boolean isValid(String token, User user);
    
    boolean isExpired(String token);
    
    String generate(User user);
    
    String generate(Map<String, Object> claims);
}
