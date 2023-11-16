package hr.dbasic.anephysiobe.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.function.Function;

@Builder
public record JwtDto(String userId) {
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class ClaimResolvers {
        public static final Function<Map<String, Object>, String> userIdResolver = claims -> (String) claims.get("userId");
    }
}
