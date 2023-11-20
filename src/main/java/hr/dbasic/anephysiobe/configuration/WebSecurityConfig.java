package hr.dbasic.anephysiobe.configuration;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.ImmutableJWKSet;
import hr.dbasic.anephysiobe.configuration.properties.JwtProperties;
import hr.dbasic.anephysiobe.configuration.properties.RsaKeyProperties;
import hr.dbasic.anephysiobe.controllers.AuthController;
import hr.dbasic.anephysiobe.filters.ExceptionCatchFilter;
import hr.dbasic.anephysiobe.filters.JwtAuthFilter;
import hr.dbasic.anephysiobe.repositories.UserRepositoryMongo;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@EnableConfigurationProperties({RsaKeyProperties.class, JwtProperties.class})
public class WebSecurityConfig {
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, CorsConfiguration corsConfiguration, AuthenticationManager authenticationManager, AuthenticationProvider authenticationProvider, JwtAuthFilter jwtAuthFilter, ExceptionCatchFilter exceptionCatchFilter) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(Customizer.withDefaults())
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers(AuthController.AuthMappings.authRequestMapping + "/**").permitAll()
                        .anyRequest().authenticated()
                )
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authenticationProvider(authenticationProvider)
                .addFilterBefore(exceptionCatchFilter, LogoutFilter.class)
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }
    
    @Bean
    public UserDetailsService userDetailsService(UserRepositoryMongo userRepositoryMongo) {
        return username -> userRepositoryMongo.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Username %s is not registered!".formatted(username)));
    }
    
    @Bean
    JwtEncoder jwtEncoder(RsaKeyProperties rsaKeyProperties) {
        RSAKey key = new RSAKey.Builder(rsaKeyProperties.publicKey()).privateKey(rsaKeyProperties.privateKey()).build();
        return new NimbusJwtEncoder(new ImmutableJWKSet<>(new JWKSet(key)));
    }
    
    @Bean
    public JwtDecoder jwtDecoder(RsaKeyProperties rsaKeyProperties) {
        return NimbusJwtDecoder.withPublicKey(rsaKeyProperties.publicKey()).build();
    }
    
    @Bean
    public AuthenticationProvider authenticationProvider(UserDetailsService userDetailsService, PasswordEncoder passwordEncoder) {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder);
        return daoAuthenticationProvider;
    }
    
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
    
    @Bean
    public CorsConfiguration corsConfiguration() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowedOriginPatterns(List.of("*"));
        corsConfiguration.setAllowedHeaders(List.of("*"));
        corsConfiguration.setAllowedMethods(List.of("*"));
        corsConfiguration.setAllowCredentials(true);
        
        return corsConfiguration;
    }
    
    @Bean
    public CorsConfigurationSource corsConfigurationSource(CorsConfiguration corsConfiguration) {
        UrlBasedCorsConfigurationSource corsConfigurationSource = new UrlBasedCorsConfigurationSource();
        corsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return corsConfigurationSource;
    }
    
}
