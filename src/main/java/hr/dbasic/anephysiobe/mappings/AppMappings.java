package hr.dbasic.anephysiobe.mappings;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AppMappings {
    public static final String apiMapping = "/api/v1";
    public static final String apiTestRequestMapping = apiMapping + "/test-request";
}
