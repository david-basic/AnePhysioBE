package hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
public class Gcs {
    
    private String id;
    
    @NotNull(message = "Eye opening response has to be defined!")
    private GcsResponse eyeOpeningResponse;
    
    @NotNull(message = "Verbal response has to be defined!")
    private GcsResponse verbalResponse;
    
    @NotNull(message = "Motor response has to be defined!")
    private GcsResponse motorResponse;
    
    @NotNull(message = "Gcs has to have a date and time defined!")
    private LocalDateTime gcsDateTime;
    
    public Integer calculateFinalScore() {
        return eyeOpeningResponse.getScore() + verbalResponse.getScore() + motorResponse.getScore();
    }
    
}
