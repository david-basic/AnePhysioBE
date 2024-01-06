package hr.dbasic.anephysiobe.models.physiofile.plans;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
public class PatientPlan extends Plan{
    
    @Builder
    public PatientPlan(String type, String description) {
        super.setType(type);
        super.setDescription(description);
    }
    
}
