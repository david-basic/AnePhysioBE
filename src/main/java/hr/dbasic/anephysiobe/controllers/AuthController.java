package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.dto.requests.LoginRequestDto;
import hr.dbasic.anephysiobe.dto.requests.RegisterRequestDto;
import hr.dbasic.anephysiobe.dto.responses.ApiResponse;
import hr.dbasic.anephysiobe.mappings.AppMappings;
import hr.dbasic.anephysiobe.services.AuthService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AuthController.AuthMappings.authRequestMapping)
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping(AuthMappings.registerPostMapping)
    public ResponseEntity<ApiResponse<?>> registerUser(@Valid @RequestBody RegisterRequestDto registerRequestDto) {
        authService.register(registerRequestDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(
                        ApiResponse.created("User registered successfully!")
                );
    }

    @PostMapping(AuthMappings.loginPostMapping)
    public ResponseEntity<ApiResponse<?>> loginUser(@Valid @RequestBody LoginRequestDto loginRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "User logged in successfully!", authService.login(loginRequestDto)
                )
        );
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class AuthMappings {
        public static final String authRequestMapping = AppMappings.apiAuthRequestMapping + "/auth";
        public static final String registerPostMapping = "/register";
        public static final String loginPostMapping = "/login";
    }
}
