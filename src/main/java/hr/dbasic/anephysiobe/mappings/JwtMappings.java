package hr.dbasic.anephysiobe.mappings;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JwtMappings {
    public static final String headerAuthBearerPrefix = "Bearer ";
    
    public static final String tokenType = "Bearer";
}
