package hr.dbasic.anephysiobe.models.physiofile.goals;

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
@Document("goals")
public class Goal {
    
    @Id
    private String id;
    
    @NotNull(message = "Goal has to have a type defined!")
    private String type;
    
    @NotNull(message = "Goal has to have a description defined!")
    private String description;
}
