package hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
@Document("motorResponses")
public class MotorResponse extends GcsResponse {
    @Id
    private String id;
    
    @Builder(builderMethodName = "motorResponseBuilder")
    public static MotorResponse createMotorResponse(Integer score, String scale) {
        MotorResponse motorResponse = new MotorResponse();
        motorResponse.setScore(score);
        motorResponse.setScale(scale);
        return motorResponse;
    }
}
