package hr.dbasic.anephysiobe.models.physiofile.procedures;

import hr.dbasic.anephysiobe.models.users.User;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
public class PatientProcedure extends Procedure{
    
    @NotNull(message = "Procedure has to have a date!")
    private LocalDateTime date;
    
    @DBRef
    @NotNull(message = "Procedure has to have working therapists defined!")
    private List<User> workingTherapists;
    
    @Builder(builderMethodName = "patientProcedureBuilder")
    public static PatientProcedure createPatientProcedure(String id, String description, LocalDateTime date, List<User> workingTherapists) {
        PatientProcedure patientProcedure = new PatientProcedure();
        patientProcedure.setId(id);
        patientProcedure.setDescription(description);
        patientProcedure.setDate(date);
        patientProcedure.setWorkingTherapists(workingTherapists);
        return patientProcedure;
    }
    
}
