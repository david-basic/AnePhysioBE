package hr.dbasic.anephysiobe.models.patients;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("operations")
public class PatientOperation {
    
    @Id
    private String id;
    
    @NotNull(message = "Operacija mora imati definiran naziv!")
    private String procedureName;
    
    @NotNull(message = "Datum i vrijeme operacije moraju biti definirani!")
    private LocalDateTime procedureDate;
    
    @DBRef
    private Patient patient;
    
}
