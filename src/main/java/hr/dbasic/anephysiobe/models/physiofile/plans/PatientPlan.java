package hr.dbasic.anephysiobe.models.physiofile.plans;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
public class PatientPlan extends Plan{
    
    @Builder(builderMethodName = "patientPlanBuilder")
    public static PatientPlan createPatientPlan(String type, String description) {
        PatientPlan patientPlan = new PatientPlan();
        patientPlan.setType(type);
        patientPlan.setDescription(description);
        return patientPlan;
    }
    
}
