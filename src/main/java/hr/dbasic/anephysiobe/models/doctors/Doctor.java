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
@Document("doctors")
public class Doctor {
    
    @Id
    private String id;
    
    @NotNull(message = "Doctor has to have a first name!")
    private String firstName;
    
    @NotNull(message = "Doctor has to have a last name!")
    private String lastName;
    
    private String title;
    
    @NotNull(message = "Doctor has to have a role, e.g. spec. anesteziologije, reanim. i intenzivne med.")
    private String role;
    
    @Builder.Default
    private Boolean isDepartmentLead = false; // voditelj odjela, false po defaultu ako se ne definira drugačije
    
    @Override
    public String toString() {
        return title.isBlank() ?
                firstName + " " + lastName + ", dr. med." :
                title + ", " + firstName + " " + lastName + ", dr. med.";
    }
}
