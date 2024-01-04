package hr.dbasic.anephysiobe.models.physiofile;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
public class AspectOfPhysicality {
    
    @NotNull(message = "Respiratory function AOP has to be defined!")
    private DefinitionAOP respiratoryFunctionAOP;
    
    @NotNull(message = "Cough AOP has to be defined!")
    private DefinitionAOP coughAOP;
    
    @NotNull(message = "Moving within the bed AOP has to be defined!")
    private DefinitionAOP movingWithinBedAOP;
    
    @NotNull(message = "Supine to sitting on the edge of the bed AOP has to be defined!")
    private DefinitionAOP supineToSittingOnTheEdgeOfTheBedAOP;
    
    @NotNull(message = "Dynamic sitting AOP has to be defined!")
    private DefinitionAOP dynamicSittingAOP;
    
    @NotNull(message = "Standing balance AOP has to be defined!")
    private DefinitionAOP standingBalanceAOP;
    
    @NotNull(message = "Sit to stand AOP has to be defined!")
    private DefinitionAOP sitToStandAOP;
    
    @NotNull(message = "Transferring from bed to chair AOP has to be defined!")
    private DefinitionAOP transferringFromBedToChairAOP;
    
    @NotNull(message = "Stepping AOP has to be defined!")
    private DefinitionAOP steppingAOP;
    
    @NotNull(message = "Grip strength AOP has to be defined!")
    private DefinitionAOP gripStrengthAOP;
}
