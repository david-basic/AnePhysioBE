package hr.dbasic.anephysiobe.models.physiofile.assessment;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("rassScores")
public class Rass {
    @Id
    private String id;
    
    @NotNull(message = "Score has to be added!")
    private String score;
    
    @NotNull(message = "Term has to be added!")
    private String term;
    
    @NotNull(message = "Description has to be added!")
    private String scoreDescription;
}
