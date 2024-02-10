package hr.dbasic.anephysiobe.models.physiofile.assessment;

import jakarta.validation.constraints.NotNull;
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
    
    @NotNull(message = "Ocjena mora biti definirana!")
    private String score;
    
    @NotNull(message = "Naziv ocjene mora biti definiran!")
    private String term;
    
    @NotNull(message = "Opis mora biti definiran!")
    private String scoreDescription;
}
