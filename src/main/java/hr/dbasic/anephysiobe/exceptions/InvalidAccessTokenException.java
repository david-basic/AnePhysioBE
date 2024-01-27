package hr.dbasic.anephysiobe.exceptions;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

public class InvalidAccessTokenException extends ForbiddenException {
    
    public InvalidAccessTokenException() {
        super(Constants.exceptionMessageFormat);
    }
    
    public InvalidAccessTokenException(final Throwable cause) {
        super(Constants.exceptionMessageFormat, cause);
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Constants {
        
        public static final String exceptionMessageFormat = "Access token is invalid!";
        
    }
    
}
