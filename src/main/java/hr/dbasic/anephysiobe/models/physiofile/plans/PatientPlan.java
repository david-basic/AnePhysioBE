package hr.dbasic.anephysiobe.models.physiofile.plans;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
public class PatientPlan extends Plan{
    
    private Boolean selected;
    
    @Builder(builderMethodName = "patientPlanBuilder")
    public static PatientPlan createPatientPlan(String type, String description, Boolean selected) {
        PatientPlan patientPlan = new PatientPlan();
        patientPlan.setType(type);
        patientPlan.setDescription(description);
        Boolean defaultSelected = (selected != null) ? selected : false;
        patientPlan.setSelected(defaultSelected);
        return patientPlan;
    }
    
}
