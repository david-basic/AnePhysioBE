package hr.dbasic.anephysiobe.dto.responses;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ApiErrorResponse(
        LocalDateTime timestamp,
        Integer status,
        String error,
        String message,
        String path
) {
    
    public static ApiErrorResponse of(HttpStatus status, String message, String path) {
        return of(status.value(), status.getReasonPhrase(), message, path);
    }
    
    public static ApiErrorResponse of(Integer status, String error, String message, String path) {
        return new ApiErrorResponse(LocalDateTime.now(), status, error, message, path);
    }
    
}
