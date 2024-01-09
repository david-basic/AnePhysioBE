package hr.dbasic.anephysiobe.models.physiofile.assessment;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
public class PatientRass extends Rass {
    
    private String additionalDescription;
    
    @NotNull(message = "Rass has to have date and time defined!")
    private LocalDateTime rassDateTime;
    
    @Builder(builderMethodName = "patientRassBuilder")
    public static PatientRass createPatientRass(String id, String score, String term, String scoreDescription, String additionalDescription, LocalDateTime rassDateTime) {
        PatientRass patientRass = new PatientRass();
        patientRass.setId(id);
        patientRass.setScore(score);
        patientRass.setTerm(term);
        patientRass.setScoreDescription(scoreDescription);
        String defaultAdditionalDescription = (additionalDescription != null) ? additionalDescription : "";
        patientRass.setAdditionalDescription(defaultAdditionalDescription);
        patientRass.setRassDateTime(rassDateTime);
        return patientRass;
    }
}
