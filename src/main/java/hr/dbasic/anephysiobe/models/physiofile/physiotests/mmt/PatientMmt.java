package hr.dbasic.anephysiobe.models.physiofile.physiotests.mmt;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
public class PatientMmt extends Mmt {
    
    @NotNull(message = "MMT has to have a date and time defined!")
    private LocalDateTime mmtDateTime;
    
    @Builder(builderMethodName = "patientMmtBuilder")
    public static PatientMmt createPatientMmt(String id, Integer grade, String description, LocalDateTime mmtDateTime) {
        PatientMmt patientMmt = new PatientMmt();
        patientMmt.setId(id);
        patientMmt.setGrade(grade);
        patientMmt.setDescription(description);
        patientMmt.setMmtDateTime(mmtDateTime);
        return patientMmt;
    }
    
}
