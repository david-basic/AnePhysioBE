package hr.dbasic.anephysiobe.models.users;

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

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
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
    private Date createDate;

    @LastModifiedDate
    private Date updateDate;

    private Date deleteDate;

    @ToString.Include
    @NotNull(message = "First name must exist!")
    @Size(min = 2, max = 70, message = "First name must have at least 2 characters and 70 at most!")
    private String firstName;

    @ToString.Include
    @NotNull(message = "Last name must exist!")
    @Size(min = 2, max = 70, message = "Last name must have at least 2 characters and 70 at most!")
    private String lastName;

    @NotNull(message = "Username must exist!")
    @Size(min = 4, max = 20, message = "Username must have 4 characters at least and 20 at most!")
    @EqualsAndHashCode.Include
    private String username;

    @NotNull(message = "Password must exist!")
    @Size(min = 8, message = "Password must have 8 characters at least!")
    private String password;

    @Builder.Default
    private Boolean enabled = true;

    @Builder.Default
    private Boolean locked = false;

    @NotNull(message = "User has to have at least 1 role!")
    @DBRef
    private UserRole role;

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
