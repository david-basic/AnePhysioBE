package hr.dbasic.anephysiobe.models.physiofile.procedures;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
public class PatientProcedureData {
    @NotNull(message = "Procedure has to have a date!")
    private LocalDateTime date;
    
    @NotNull(message = "Procedure description has to be added!")
    private String description;
    
}
