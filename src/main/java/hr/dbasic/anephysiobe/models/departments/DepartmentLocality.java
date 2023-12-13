package hr.dbasic.anephysiobe.models.departments;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@Getter
@Setter
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("localities")
public class DepartmentLocality {
    @Id
    private String id;
    
    @NotNull(message = "Locality must have a name!")
    private String name;
    
    @ToString.Include
    @NotNull(message = "County must have a display name!")
    private String displayName;
}
