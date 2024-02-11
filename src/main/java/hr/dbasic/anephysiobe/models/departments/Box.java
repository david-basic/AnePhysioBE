package hr.dbasic.anephysiobe.models.departments;

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
    
    @NotNull(message = "Box mora imati definirano ime!")
    private String name;
    
    @DBRef
    @NotNull(message = "Box mora imati najmanje 1 krevet!")
    private List<Bed> bedList;
    
}
