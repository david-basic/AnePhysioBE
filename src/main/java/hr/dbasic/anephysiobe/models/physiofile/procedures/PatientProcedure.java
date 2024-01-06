package hr.dbasic.anephysiobe.models.physiofile.procedures;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
public class PatientProcedure extends Procedure{
    
    @NotNull(message = "Procedure has to have a date!")
    private LocalDateTime date;
    
    @NotNull(message = "Procedure has to have working therapists defined!")
    private String workingTherapists;
    
    @Builder(builderMethodName = "patientProcedureBuilder")
    public static PatientProcedure createPatientProcedure(String description, LocalDateTime date, String workingTherapists) {
        PatientProcedure patientProcedure = new PatientProcedure();
        patientProcedure.setDescription(description);
        patientProcedure.setDate(date);
        patientProcedure.setWorkingTherapists(workingTherapists);
        return patientProcedure;
    }
    
}
