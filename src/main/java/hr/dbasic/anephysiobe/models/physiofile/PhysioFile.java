package hr.dbasic.anephysiobe.models.physiofile;

import hr.dbasic.anephysiobe.models.patients.Patient;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("physioFiles")
public class PhysioFile {
    
    @Id
    private String id;
    
    @NotNull
    private String fileOpenedBy;
    
    @NotNull(message = "Patient has to exist on the file!")
    @DBRef
    private Patient patient;
    
    @DBRef
    private List<FunctionalDiagnosis> functionalDiagnosis;
    
    @DBRef
    private Assessment assessment;
    
    @DBRef
    private Goal goal;
    
    @DBRef
    private Plan plan;
    
    private String notes;
    
    @DBRef
    private List<ProcedureData> procedureData;
    
    @DBRef
    private PhysioTest physioTest;
    
    private String conclussion;
    
    private String fileClosedBy;
    
    
}
