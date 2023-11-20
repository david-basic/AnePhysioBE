package hr.dbasic.anephysiobe.filters;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.HandlerExceptionResolver;

@Component
@RequiredArgsConstructor
public class ExceptionCatchFilter extends OncePerRequestFilter {
    
    private final HandlerExceptionResolver handlerExceptionResolver;
    
    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain filterChain) {
        try {
            filterChain.doFilter(request, response);
        } catch (Exception e) {
            handlerExceptionResolver.resolveException(request, response, null, e);
        }
    }
}
