package hr.dbasic.anephysiobe.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@Validated
@ConfigurationProperties(prefix = "hr.dbasic.anephysiobe.security.rsa")
public record RsaKeyProperties(
        RSAPublicKey publicRsaKey,
        RSAPrivateKey privateRsaKey) {
}
