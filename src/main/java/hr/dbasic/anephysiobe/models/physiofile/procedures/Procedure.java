package hr.dbasic.anephysiobe.models.physiofile.procedures;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("procedures")
public class Procedure {
    @Id
    private String id;
    
    @NotNull(message = "Procedure has to have a description!")
    @ToString.Include
    private String description;
}
