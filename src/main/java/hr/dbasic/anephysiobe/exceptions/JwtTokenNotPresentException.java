package hr.dbasic.anephysiobe.exceptions;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

public class JwtTokenNotPresentException extends UnauthorizedException {
    public JwtTokenNotPresentException() {
        super(Constants.exceptionMessageFormat);
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Constants {
        public static final String exceptionMessageFormat = "JWT token nije definiran!";
    }
}
