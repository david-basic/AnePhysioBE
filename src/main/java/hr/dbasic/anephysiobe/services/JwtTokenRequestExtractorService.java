package hr.dbasic.anephysiobe.services;

@FunctionalInterface
public interface JwtTokenRequestExtractorService {
    String getToken();
}
