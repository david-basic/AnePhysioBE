package hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses;

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
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("functionalDiagnoses")
public class FunctionalDiagnosis {
    @Id
    private String id;
    
    @NotNull(message = "Functional diagnosis has to have a name!")
    @ToString.Include
    private String name;
}
