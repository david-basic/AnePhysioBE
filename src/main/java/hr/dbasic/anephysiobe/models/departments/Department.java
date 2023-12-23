package hr.dbasic.anephysiobe.models.departments;

import hr.dbasic.anephysiobe.models.Box;
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
    
    @NotNull(message = "Department has to have a name!")
    @Size(min = 3, message = "Department name has to be at least 3 characters long!")
    private String name;
    
    @NotNull(message = "Department has to have a shorthand")
    private String shorthand;
    
    @DBRef
    @NotNull(message = "Department has to have at least one box!")
    private List<Box> boxes;
    
    @DBRef
    @NotNull(message = "Department has to have a locality attached!")
    private DepartmentLocality locality;
}
