package hr.dbasic.anephysiobe.models.physiofile.assessment;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
public class Rass {
    @NotNull(message = "Score has to be added!")
    @Size(min = -5, max = 4, message = "Score is a number in the [-5,4] interval!")
    private Integer score;
    
    @NotNull(message = "Term has to be added!")
    private String term;
    
    @NotNull(message = "Description has to be added!")
    private String scoreDescription;
    
    private String additionalDescription;
}
