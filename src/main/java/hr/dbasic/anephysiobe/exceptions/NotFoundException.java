package hr.dbasic.anephysiobe.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
    
    public NotFoundException(final String message) {
        super(message);
    }
    
    public NotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public NotFoundException(final Throwable cause) {
        super(cause);
    }
    
}
