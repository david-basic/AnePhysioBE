package hr.dbasic.anephysiobe.models.physiofile.goals;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
public class PatientGoal extends Goal{
    
    @Builder
    public PatientGoal(String type, String description) {
        super.setType(type);
        super.setDescription(description);
    }
    
}
