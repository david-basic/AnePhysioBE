package hr.dbasic.anephysiobe.models.departments;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
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
    
    @NotNull(message = "Doktor mora imati definirano ime!")
    private String firstName;
    
    @NotNull(message = "Doktor mora imati definirano prezime!")
    private String lastName;
    
    @Builder.Default
    private String title = "";
    
    @NotNull(message = "Doktor mora imati definiranu ulogu, npr. spec. anesteziologije, reanim. i intenzivne med.")
    private String role;
    
    @DBRef
    private Department department;
    
    @Builder.Default
    private Boolean isDepartmentLead = false;
    
    @Override
    public String toString() {
        return title.isBlank() ?
                firstName + " " + lastName + ", dr. med." :
                title + ", " + firstName + " " + lastName + ", dr. med.";
    }
}
