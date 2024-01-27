package hr.dbasic.anephysiobe.models.users;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@Getter
@Setter
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("roles")
public class UserRole implements Serializable {
    @Id
    private String id;

    @ToString.Include
    @NotNull(message = "Role name must exist!")
    private String name;

    @NotNull(message = "Role must have a display name!")
    private String displayName;

    private Set<User> users;

}
