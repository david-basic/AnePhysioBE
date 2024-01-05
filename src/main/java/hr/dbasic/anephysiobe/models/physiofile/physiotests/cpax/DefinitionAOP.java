package hr.dbasic.anephysiobe.models.physiofile.physiotests.cpax;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
public class DefinitionAOP {
    
    @NotNull(message = "AOP has to have a name defined!")
    private String aspectName;
    
    @NotNull(message = "AOP definition level has to be defined!")
    @Size(max = 5, message = "AOP definition level is a number in the [0,5] interval!")
    private Integer level;
    
    @NotNull(message = "AOP definition has to have a level description defined!")
    private String levelDescription;
}
