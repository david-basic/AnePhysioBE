package hr.dbasic.anephysiobe.models.physiofile;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
public class Gcs {
    @NotNull(message = "Eye opening response has to be defined!")
    private GcsResponse eyeOpeningResponse;
    
    @NotNull(message = "Verbal response has to be defined!")
    private GcsResponse verbalResponse;
    
    @NotNull(message = "Motor response has to be defined!")
    private GcsResponse motorResponse;
    
    public Integer calculateFinalScore() {
        return eyeOpeningResponse.getScore() + verbalResponse.getScore() + motorResponse.getScore();
    }
    
}
