package hr.dbasic.anephysiobe.models.physiofile.procedures;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
public class PatientProcedureData extends Procedure{
    
    @NotNull(message = "Procedure has to have a date!")
    private LocalDateTime date;
    
    @Builder
    public PatientProcedureData(String description, LocalDateTime date) {
        super.setDescription(description);
        this.date = date;
    }
    
}
