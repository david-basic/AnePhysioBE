package hr.dbasic.anephysiobe.models.physiofile.physiotests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
public class Vas {
    
    private String id;
    
    @NotNull(message = "Vas scale has to have a pain level added!")
    @Size(min = 0, max = 10, message = "Pain level has to be a number number in [0,10] interval!")
    private Integer painLevel;
    
    @NotNull(message = "Vas scale has to have a note added!")
    private String note;
    
    @NotNull(message = "Vas has to have date and time defined!")
    private LocalDateTime vasDateTime;
}
