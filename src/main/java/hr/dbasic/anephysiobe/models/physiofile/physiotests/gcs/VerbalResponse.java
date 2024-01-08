package hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
@Document("verbalResponses")
public class VerbalResponse extends GcsResponse {
    @Id
    private String id;
    
    @Builder(builderMethodName = "verbalResponseBuilder")
    public static VerbalResponse createVerbalResponse(Integer score, String scale) {
        VerbalResponse verbalResponse = new VerbalResponse();
        verbalResponse.setScore(score);
        verbalResponse.setScale(scale);
        return verbalResponse;
    }
}
