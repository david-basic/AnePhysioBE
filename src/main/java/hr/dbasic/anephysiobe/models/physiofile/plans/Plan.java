package hr.dbasic.anephysiobe.models.physiofile.plans;

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
@ToString(onlyExplicitlyIncluded = true, doNotUseGetters = true)
@Document("plans")
public class Plan {
    
    @Id
    private String id;
    
    @NotNull(message = "Plan mora imati definiran tip!")
    private String type;
    
    @NotNull(message = "Plan mora imati definiran opis!")
    private String description;
}
