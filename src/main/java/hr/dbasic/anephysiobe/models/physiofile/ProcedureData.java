package hr.dbasic.anephysiobe.models.physiofile;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("procedureData")
public class ProcedureData {
    @Id
    private String id;
    
    @NotNull(message = "ProcedureData has to have a date!")
    private LocalDateTime date;
    
    @NotNull(message = "Procedure description has to be added!")
    private String description;
    
}
