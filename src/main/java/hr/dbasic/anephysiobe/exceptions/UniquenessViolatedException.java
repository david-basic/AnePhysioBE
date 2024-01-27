package hr.dbasic.anephysiobe.exceptions;

public class UniquenessViolatedException extends BadRequestException {
    public UniquenessViolatedException(final String message) {
        super(message);
    }
    
    public UniquenessViolatedException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public UniquenessViolatedException(final Throwable cause) {
        super(cause);
    }
}
