package hr.dbasic.anephysiobe.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class ForbiddenException extends RuntimeException {
    
    public ForbiddenException(final String message) {
        super(message);
    }
    
    public ForbiddenException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public ForbiddenException(final Throwable cause) {
        super(cause);
    }
    
}
