package hr.dbasic.anephysiobe.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.validation.annotation.Validated;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Validated
@ConfigurationProperties(prefix = "hr.dbasic.anephysiobe.security.jwt")
public record JwtProperties(
        @DurationUnit(ChronoUnit.MILLIS)
        Duration validityDurationInMs,
        @DurationUnit(ChronoUnit.MILLIS)
        Duration refreshValidityDurationInMs
) {
}
