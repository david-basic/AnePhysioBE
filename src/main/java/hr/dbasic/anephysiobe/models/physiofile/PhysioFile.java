package hr.dbasic.anephysiobe.models.physiofile;

import hr.dbasic.anephysiobe.models.patients.Patient;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("physioFiles")
public class PhysioFile implements Serializable {
    
    @Id
    private String id;
    
    @NotNull(message = "Person who opened the file has to be defined on the file!")
    private String fileOpenedBy;
    
    @NotNull(message = "Patient has to exist on the file!")
    @DBRef
    private Patient patient;
    
    private List<PatientFunctionalDiagnosis> patientFunctionalDiagnoses;
    
    @DBRef
    private Assessment assessment;
    
    @DBRef
    private Goal goal;
    
    @DBRef
    private Plan plan;
    
    private String notes;
    
    private List<PatientProcedureData> patientProcedureData;
    
    @DBRef
    private PhysioTest physioTest;
    
    private String conclussion;
    
    private String fileClosedBy;
    
    
}
