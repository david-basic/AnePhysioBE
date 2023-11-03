package hr.dbasic.anephysiobe.dto.response;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ApiResponse<T>(LocalDateTime timestamp, Integer status, Boolean success, String message, T data) {
    public static <T> ApiResponse<T> of(Integer status, Boolean success, String message, T data) {
        return new ApiResponse<>(LocalDateTime.now(), status, success, message, data);
    }
    
    public static <T> ApiResponse<T> ok(String message, T data) {
        return of(HttpStatus.OK.value(), true, message, data);
    }
}
