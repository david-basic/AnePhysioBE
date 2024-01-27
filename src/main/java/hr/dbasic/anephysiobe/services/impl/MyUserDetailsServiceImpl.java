package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.repositories.UserRepositoryMongo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailsServiceImpl implements UserDetailsService {
    
    private final UserRepositoryMongo userRepositoryMongo;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepositoryMongo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username %s is not registered!".formatted(username)));
    }
}
