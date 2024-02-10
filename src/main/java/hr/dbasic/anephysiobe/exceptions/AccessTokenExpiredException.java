package hr.dbasic.anephysiobe.exceptions;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

public class AccessTokenExpiredException extends ForbiddenException {
    
    public AccessTokenExpiredException() {
        super(Constants.exceptionMessageFormat);
    }
    
    @SuppressWarnings("unused")
    public AccessTokenExpiredException(final Throwable cause) {
        super(Constants.exceptionMessageFormat, cause);
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Constants {
        
        public static final String exceptionMessageFormat = "Pristupnom token je istekao rok! Iskoristite token za osvježavanje da bi ga osvježili!";
        
    }
    
}
