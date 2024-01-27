package hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses;

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
@Document("patientFunctionalDiagnoses")
public class PatientFunctionalDiagnosis {
    @Id
    private String id;
    
    @Builder.Default
    private Boolean selected = false;
    
    @NotNull(message = "Functional diagnosis has to be referenced!")
    @DBRef
    private FunctionalDiagnosis functionalDiagnosis;
    
    @Override
    public String toString() {
        return functionalDiagnosis.getDescription();
    }
}
