package hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
@Document("eyeOpeningResponses")
public class EyeOpeningResponse extends GcsResponse {
    @Id
    private String id;
    
    @Builder(builderMethodName = "eyeOpeningResponseBuilder")
    public static EyeOpeningResponse createEyeOpeningResponse(Integer score, String scale) {
        EyeOpeningResponse eyeOpeningResponse = new EyeOpeningResponse();
        eyeOpeningResponse.setScore(score);
        eyeOpeningResponse.setScale(scale);
        return eyeOpeningResponse;
    }
}
