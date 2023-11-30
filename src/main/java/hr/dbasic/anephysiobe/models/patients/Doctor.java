package hr.dbasic.anephysiobe.models.patients;

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
@Document("doctors")
public class Doctor {
    
    @Id
    private String id;
    
    private String firstName;
    
    private String lastName;
    
    private String title;
    
    private String rank; // specijalizant / specijalist
    
    private Boolean isDepartmentLead = false; // voditelj odjela, false po defaultu ako se ne definira drugacije
    
}
