package hr.dbasic.anephysiobe.models.departments;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
@Document("departments")
public class Department {
    
    @Id
    private String id;
    
    @NotNull(message = "Odjel mora imati definirano ime!")
    @Size(min = 3, message = "Ime odjela mora biti najmanje 3 znaka dugačko!")
    private String name;
    
    @NotNull(message = "Odjelu mora biti definirana kratica!")
    private String shorthand;
    
    @DBRef
    @NotNull(message = "Odjel mora imati barem jedan box definiran!")
    private List<Box> boxes;
    
    @DBRef
    @NotNull(message = "Odjel mora imati definiran lokalitet!")
    private DepartmentLocality locality;
}
