package hr.dbasic.anephysiobe.models.users;

import hr.dbasic.anephysiobe.models.patients.Sex;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("users")
public class User implements UserDetails {
    
    @Id
    @EqualsAndHashCode.Include
    private String id;
    
    @CreatedDate
    private LocalDate createDate;
    
    @LastModifiedDate
    private LocalDate updateDate;
    
    private LocalDate deleteDate;
    
    @ToString.Include
    @NotNull(message = "Ime mora biti definirano!")
    @Size(min = 2, max = 70, message = "Ime mora imati najmanje 2, najviše 70 znakova!")
    private String firstName;
    
    @ToString.Include
    @NotNull(message = "Prezime mora biti definirano!")
    @Size(min = 2, max = 70, message = "Prezime mora imati najmanje 2, najviše 70 znakova!")
    private String lastName;
    
    @NotNull(message = "Titula mora biti definirana!")
    @Size(min = 4, message = "Titula mora imati najmanje 4 znaka!")
    private String title;
    
    @NotNull(message = "Spol mora biti definiran!")
    @DBRef
    private Sex sex;
    
    @NotNull(message = "Korisničko ime mora biti definirano!")
    @Size(min = 4, max = 20, message = "Korisničko ime mora imati najmanje 4, najviše 20 znakova!")
    @EqualsAndHashCode.Include
    private String username;
    
    @NotNull(message = "Zaporka mora biti definirana!")
    @Size(min = 8, message = "Zaporka mora imati najmanje 8 znakova!")
    private String password;
    
    @Builder.Default
    private Boolean enabled = true;
    
    @Builder.Default
    private Boolean locked = false;
    
    @NotNull(message = "Korisnik mora imati definirano rolu!")
    @DBRef
    private UserRole role;
    
    @DBRef
    private RefreshToken refreshToken;
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Set.of(new SimpleGrantedAuthority(role.getName()));
    }
    
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    
    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }
    
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    
    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
