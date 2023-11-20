package hr.dbasic.anephysiobe.exceptions.advice;

import hr.dbasic.anephysiobe.dto.responses.ApiErrorResponse;
import hr.dbasic.anephysiobe.exceptions.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RestControllerAdvice
public class AppAdvice {
    @ExceptionHandler({BadCredentialsException.class, DisabledException.class, LockedException.class,})
    public ResponseEntity<ApiErrorResponse> handleAuthenticationException(HttpServletRequest request, AuthenticationException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(
                        ApiErrorResponse.of(
                                HttpStatus.BAD_REQUEST,
                                e.getMessage(),
                                request.getRequestURL().toString()
                        )
                );
    }
    
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ApiErrorResponse> handleMethodArgumentTypeMismatchException(HttpServletRequest request) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(
                        ApiErrorResponse.of(
                                HttpStatus.BAD_REQUEST,
                                "Sent parameter is not of correct type!",
                                request.getRequestURL().toString()
                        )
                );
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiErrorResponse> handleMethodArgumentNotValidException(HttpServletRequest request, MethodArgumentNotValidException e) {
        String errors = e.getBindingResult().getAllErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.joining("\n"));
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(
                        ApiErrorResponse.of(
                                HttpStatus.BAD_REQUEST,
                                errors,
                                request.getRequestURL().toString()
                        )
                );
    }
    
    @ExceptionHandler({IllegalArgumentException.class, NoSuchElementException.class, HttpMessageNotReadableException.class, BadRequestException.class})
    public ResponseEntity<ApiErrorResponse> handleBadRequestException(HttpServletRequest request, RuntimeException e) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(
                        ApiErrorResponse.of(
                                HttpStatus.BAD_REQUEST,
                                e.getMessage(),
                                request.getRequestURL().toString()
                        )
                );
    }
    
    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<ApiErrorResponse> handleConflictException(HttpServletRequest request, ConflictException e) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(
                        ApiErrorResponse.of(
                                HttpStatus.CONFLICT,
                                e.getMessage(),
                                request.getRequestURL().toString()
                        )
                );
    }
    
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleNotFoundException(HttpServletRequest request, NotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(
                        ApiErrorResponse.of(
                                HttpStatus.NOT_FOUND,
                                e.getMessage(),
                                request.getRequestURL().toString()
                        )
                );
    }
    
    @ExceptionHandler(ForbiddenException.class)
    public ResponseEntity<ApiErrorResponse> handleForbiddenException(HttpServletRequest request, ForbiddenException e) {
        return ResponseEntity
                .status(HttpStatus.FORBIDDEN)
                .body(
                        ApiErrorResponse.of(
                                HttpStatus.FORBIDDEN,
                                e.getMessage(),
                                request.getRequestURL().toString()
                        )
                );
    }
    
    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ApiErrorResponse> handleUnauthorizedException(HttpServletRequest request, UnauthorizedException e) {
        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(
                        ApiErrorResponse.of(
                                HttpStatus.UNAUTHORIZED,
                                e.getMessage(),
                                request.getRequestURL().toString()
                        )
                );
    }
    
    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<ApiErrorResponse> handleInternalServerErrorException(HttpServletRequest request, InternalServerErrorException e) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(
                        ApiErrorResponse.of(
                                HttpStatus.INTERNAL_SERVER_ERROR,
                                e.getMessage(),
                                request.getRequestURL().toString()
                        )
                );
    }
    
    @ExceptionHandler({IllegalStateException.class, Exception.class})
    public ResponseEntity<ApiErrorResponse> handleException(HttpServletRequest request) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(
                        ApiErrorResponse.of(
                                HttpStatus.INTERNAL_SERVER_ERROR,
                                "Internal server error! Contact your admin!",
                                request.getRequestURL().toString()
                        )
                );
    }
}
