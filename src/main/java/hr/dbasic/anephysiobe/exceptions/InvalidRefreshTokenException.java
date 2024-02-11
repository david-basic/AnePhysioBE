package hr.dbasic.anephysiobe.exceptions;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

public class InvalidRefreshTokenException extends NotFoundException {
    
    public InvalidRefreshTokenException() {
        super(Constants.exceptionMessageFormat);
    }
    
    public InvalidRefreshTokenException(Throwable cause) {
        super(Constants.exceptionMessageFormat, cause);
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Constants {
        
        public static final String exceptionMessageFormat = "Token za osvježavanje nije važeći!";
        
    }
    
}
