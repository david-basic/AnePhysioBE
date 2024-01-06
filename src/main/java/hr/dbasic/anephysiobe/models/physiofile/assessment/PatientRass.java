package hr.dbasic.anephysiobe.models.physiofile.assessment;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
public class PatientRass extends Rass {
    
    private String additionalDescription;
    
    @Builder(builderMethodName = "patientRassBuilder")
    public static PatientRass createPatientRass(String score, String term, String scoreDescription, String additionalDescription) {
        PatientRass patientRass = new PatientRass();
        patientRass.setScore(score);
        patientRass.setTerm(term);
        patientRass.setScoreDescription(scoreDescription);
        patientRass.setAdditionalDescription(additionalDescription);
        return patientRass;
    }
}
