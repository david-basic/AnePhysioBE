package hr.dbasic.anephysiobe.models.physiofile.goals;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
public class PatientGoal extends Goal{
    
    @Builder(builderMethodName = "patientGoalBuilder")
    public static PatientGoal createPatientGoal(String type, String description) {
        PatientGoal patientGoal = new PatientGoal();
        patientGoal.setType(type);
        patientGoal.setDescription(description);
        return patientGoal;
    }
    
}
