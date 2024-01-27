package hr.dbasic.anephysiobe.models.physiofile.physiotests.cpax;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true, callSuper = true)
@Document("AOPs")
public class AOP extends DefinitionAOP {
    @Id
    private String id;
    
    @Builder(builderMethodName = "aopBuilder")
    public static AOP createAop(String aspectName, Integer level, String levelDescription) {
        AOP aop = new AOP();
        aop.setAspectName(aspectName);
        aop.setLevel(level);
        aop.setLevelDescription(levelDescription);
        return aop;
    }
}
