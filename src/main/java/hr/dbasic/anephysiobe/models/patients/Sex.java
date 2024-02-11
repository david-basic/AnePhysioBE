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
    
    @NotNull(message = "Spol mora imati definirano ime!")
    private String name;
    
    @ToString.Include
    @NotNull(message = "Spol mora imati definirano ime za prikaz!")
    private String displayName;
}
