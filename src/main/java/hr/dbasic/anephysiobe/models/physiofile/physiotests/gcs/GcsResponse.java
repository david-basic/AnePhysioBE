package hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
public class GcsResponse {
    @NotNull(message = "Scale has to be defined!")
    private String scale;
    
    @NotNull(message = "Score has to be defined!")
    private Integer score;
}
