package hr.dbasic.anephysiobe.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ConflictException extends RuntimeException {
    
    public ConflictException(final String message) {
        super(message);
    }
    
    public ConflictException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public ConflictException(final Throwable cause) {
        super(cause);
    }
    
}
