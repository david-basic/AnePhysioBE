package hr.dbasic.anephysiobe.models.physiofile;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
public class Mmt {
    
    @NotNull(message = "Mmt has to have a grade defined!")
    private Integer grade;
    
    @NotNull(message = "Mmt has to have a description of the grade defined!")
    private String description;
}
