package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.requests.LoginRequestDto;
import hr.dbasic.anephysiobe.dto.requests.RefreshTokenRequestDto;
import hr.dbasic.anephysiobe.dto.requests.RegisterRequestDto;
import hr.dbasic.anephysiobe.dto.responses.AuthResponseDto;

public interface AuthService {
    void register(RegisterRequestDto registerRequestDto);
    AuthResponseDto login(LoginRequestDto LoginRequestDto);
    AuthResponseDto refreshToken(RefreshTokenRequestDto requestDto);
}
