package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.dto.requests.LoginRequestDto;
import hr.dbasic.anephysiobe.dto.requests.RefreshTokenRequestDto;
import hr.dbasic.anephysiobe.dto.requests.RegisterRequestDto;
import hr.dbasic.anephysiobe.dto.responses.ApiResponse;
import hr.dbasic.anephysiobe.dto.responses.AuthResponseDto;
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
                        ApiResponse.created("Korisnik uspješno registriran!")
                );
    }
    
    @PostMapping(AuthMappings.loginPostMapping)
    public ResponseEntity<ApiResponse<AuthResponseDto>> loginUser(@Valid @RequestBody LoginRequestDto loginRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Uspješna prijava!",
                        authService.login(loginRequestDto)
                )
        );
    }
    
    @PostMapping(AuthMappings.refreshTokenPostMapping)
    public ResponseEntity<ApiResponse<AuthResponseDto>> refreshToken(@Valid @RequestBody RefreshTokenRequestDto refreshTokenRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Osvježavanje tokena uspješno", authService.refreshToken(refreshTokenRequestDto)
                )
        );
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class AuthMappings {
        public static final String authRequestMapping = AppMappings.apiAuthRequestMapping + "/auth";
        public static final String registerPostMapping = "/register";
        public static final String loginPostMapping = "/login";
        public static final String refreshTokenPostMapping = "/refresh-token";
    }
}
