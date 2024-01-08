package hr.dbasic.anephysiobe.models.physiofile.assessment;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("assessments")
public class Assessment {
    
    @Id
    private String id;
    
    private List<PatientRass> patientRass;
    
    private String notes;
}
