package hr.dbasic.anephysiobe.models.patients;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@Getter
@Setter
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("patientMkbs")
public class PatientMkb implements Serializable {
    @Id
    private String id;
    
    @NotNull(message = "MKB has to be added!")
    @DBRef
    private Mkb mkbCode;
    
    @DBRef
    private Patient patient;
    
    @Builder.Default
    private String displayName = mkbCode.getCode() +  " " + mkbCode.getDisplayName();
    
    @Override
    public String toString() {
        return displayName;
    }
}