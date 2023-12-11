package hr.dbasic.anephysiobe.models.patients;

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
@Document("sexes")
public class Sex {
    @Id
    private String id;
    
    @NotNull(message = "Sex must have a name!")
    private String name;
    
    @ToString.Include
    @NotNull(message = "Sex must have a display name!")
    private String displayName;
}
