package hr.dbasic.anephysiobe.models.physiofile;

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
@Document("goals")
public class Goal {
    @Id
    private String id;
    
    private List<String> name; //TODO mozda imati list tipova (intubirani/ekstubirani)
                                // pa onda da svaki tip u listi ima listu ciljeva za taj tip cilja
    
}
