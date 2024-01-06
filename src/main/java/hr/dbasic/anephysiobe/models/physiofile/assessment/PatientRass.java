package hr.dbasic.anephysiobe.models.physiofile.assessment;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
public class PatientRass extends Rass {
    
    private String additionalDescription;
    
    @Builder
    public PatientRass(String score, String term, String scoreDescription, String additionalDescription) {
        super.setScore(score);
        super.setTerm(term);
        super.setScoreDescription(scoreDescription);
        this.additionalDescription = additionalDescription;
    }
}
