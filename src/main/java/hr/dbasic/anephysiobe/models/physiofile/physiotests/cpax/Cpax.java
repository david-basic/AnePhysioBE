package hr.dbasic.anephysiobe.models.physiofile.physiotests.cpax;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
public class Cpax {
    
    @NotNull(message = "Aspect of physicality has to be defined!")
    private AspectOfPhysicality aspectOfPhysicality;
    
    @NotNull(message = "Cpax has to have a date and time defined!")
    private LocalDateTime testDateTime;
    
    public Integer getTotalCpaxResult() {
        return aspectOfPhysicality.getRespiratoryFunctionAOP().getLevel() +
                aspectOfPhysicality.getCoughAOP().getLevel() +
                aspectOfPhysicality.getMovingWithinBedAOP().getLevel() +
                aspectOfPhysicality.getSupineToSittingOnTheEdgeOfTheBedAOP().getLevel() +
                aspectOfPhysicality.getDynamicSittingAOP().getLevel() +
                aspectOfPhysicality.getStandingBalanceAOP().getLevel() +
                aspectOfPhysicality.getSitToStandAOP().getLevel() +
                aspectOfPhysicality.getTransferringFromBedToChairAOP().getLevel() +
                aspectOfPhysicality.getSteppingAOP().getLevel() +
                aspectOfPhysicality.getGripStrengthAOP().getLevel();
    }
    
}
