package hr.dbasic.anephysiobe.models.departments;

import hr.dbasic.anephysiobe.models.departments.Bed;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@Getter
@Setter
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("boxes")
public class Box {
    
    @Id
    private String id;
    
    @NotNull(message = "Box has to have a name!")
    private String name;
    
    @DBRef
    @NotNull(message = "Box has to have at least one bed!")
    private List<Bed> bedList;
    
}
