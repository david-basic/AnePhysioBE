package hr.dbasic.anephysiobe.models.doctors;

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
@Document("doctors")
public class Doctor {
    
    @Id
    private String id;
    
    @NotNull(message = "Doctor has to have a first name!")
    private String firstName;
    
    @NotNull(message = "Doctor has to have a last name!")
    private String lastName;
    
    @NotNull(message = "Doctor has to have a title!")
    private String title;
    
    @NotNull(message = "Doctor has to have a rank!")
    private String rank; // specijalizant / specijalist
    
    @Builder.Default
    private Boolean isDepartmentLead = false; // voditelj odjela, false po defaultu ako se ne definira drugačije
    
}
