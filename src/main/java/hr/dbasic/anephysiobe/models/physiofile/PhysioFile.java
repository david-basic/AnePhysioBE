package hr.dbasic.anephysiobe.models.physiofile;

import hr.dbasic.anephysiobe.models.patients.Patient;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Assessment;
import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.PatientFunctionalDiagnosis;
import hr.dbasic.anephysiobe.models.physiofile.goals.PatientGoal;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.PhysioTest;
import hr.dbasic.anephysiobe.models.physiofile.plans.PatientPlan;
import hr.dbasic.anephysiobe.models.physiofile.procedures.PatientProcedure;
import hr.dbasic.anephysiobe.models.users.User;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;
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
    
    @DBRef
    @NotNull(message = "Fizioterapeut koji je otvorio karton mora biti definiran!")
    private User fileOpenedBy;
    
    @NotNull(message = "Pacijent mora biti definiran na kartonu!")
    @DBRef
    private Patient patient;
    
    @DBRef
    private List<PatientFunctionalDiagnosis> patientFunctionalDiagnoses;
    
    @DBRef
    private Assessment assessment;
    
    private List<PatientGoal> patientGoals;
    
    private List<PatientPlan> patientPlans;
    
    private String notes;
    
    private List<PatientProcedure> patientProcedures;
    
    @DBRef
    private PhysioTest physioTest;
    
    private String conclussion;
    
    @DBRef
    private User fileClosedBy;
    
    private LocalDateTime fileClosedAt;
}
