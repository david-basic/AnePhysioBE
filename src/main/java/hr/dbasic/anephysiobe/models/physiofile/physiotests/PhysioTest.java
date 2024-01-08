package hr.dbasic.anephysiobe.models.physiofile.physiotests;


import hr.dbasic.anephysiobe.models.physiofile.physiotests.cpax.Cpax;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.Gcs;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.mmt.PatientMmt;
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
@Document("physioTests")
public class PhysioTest {
    
    @Id
    private String id;

    private List<Cpax> cpax;

    private List<Gcs> gcs;

    private List<PatientMmt> mmt;
    
    private List<Vas> vas;
    
}
