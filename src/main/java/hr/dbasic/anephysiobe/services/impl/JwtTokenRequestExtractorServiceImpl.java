package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.exceptions.JwtTokenNotPresentException;
import hr.dbasic.anephysiobe.mappings.JwtMappings;
import hr.dbasic.anephysiobe.services.JwtTokenRequestExtractorService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class JwtTokenRequestExtractorServiceImpl implements JwtTokenRequestExtractorService {
    private final HttpServletRequest request;
    
    @Override
    public String getToken() {
        String auth = request.getHeader(HttpHeaders.AUTHORIZATION);
        if (Objects.isNull(auth) || !auth.startsWith(JwtMappings.headerAuthBearerPrefix)) {
            throw new JwtTokenNotPresentException();
        }
        
        return auth.substring(JwtMappings.headerAuthBearerPrefix.length());
    }
}
