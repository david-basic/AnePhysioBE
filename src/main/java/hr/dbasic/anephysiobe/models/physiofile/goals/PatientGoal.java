package hr.dbasic.anephysiobe.models.physiofile.goals;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
public class PatientGoal extends Goal {
    
    private Boolean selected;
    
    @Builder(builderMethodName = "patientGoalBuilder")
    public static PatientGoal createPatientGoal(String id, String type, String description, Boolean selected) {
        PatientGoal patientGoal = new PatientGoal();
        patientGoal.setId(id);
        patientGoal.setType(type);
        patientGoal.setDescription(description);
        Boolean defaultSelected = (selected != null) ? selected : false;
        patientGoal.setSelected(defaultSelected);
        return patientGoal;
    }
    
}
