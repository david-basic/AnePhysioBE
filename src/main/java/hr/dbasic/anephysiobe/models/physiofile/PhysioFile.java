package hr.dbasic.anephysiobe.models.physiofile;

import hr.dbasic.anephysiobe.models.patients.Patient;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Assessment;
import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.PatientFunctionalDiagnosis;
import hr.dbasic.anephysiobe.models.physiofile.goals.PatientGoal;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.PhysioTest;
import hr.dbasic.anephysiobe.models.physiofile.plans.PatientPlan;
import hr.dbasic.anephysiobe.models.physiofile.procedures.PatientProcedure;
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
    
    private PatientGoal patientGoal;
    
    private PatientPlan patientPlan;
    
    private String notes;
    
    private List<PatientProcedure> patientProcedures;
    
    @DBRef
    private PhysioTest physioTest;
    
    private String conclussion;
    
    private String fileClosedBy;
    
}
