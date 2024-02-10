package hr.dbasic.anephysiobe.exceptions;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

public class RefreshTokenExpiredException extends ForbiddenException {
    
    public RefreshTokenExpiredException() {
        super(Constants.exceptionMessageFormat);
    }
    
    public RefreshTokenExpiredException(final Throwable cause) {
        super(Constants.exceptionMessageFormat, cause);
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Constants {
        
        public static final String exceptionMessageFormat = "Token za osvježavanje je istekao! Prijavite se ponovno!";
        
    }
    
}
