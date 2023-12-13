package hr.dbasic.anephysiobe.models;

import hr.dbasic.anephysiobe.models.patients.Patient;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@Getter
@Setter
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("beds")
public class Bed {
    
    @Id
    private String id;
    
    @DBRef
    private Patient patient;
    
    public Boolean bedIsEmpty() {
        return Objects.isNull(patient);
    }
}
