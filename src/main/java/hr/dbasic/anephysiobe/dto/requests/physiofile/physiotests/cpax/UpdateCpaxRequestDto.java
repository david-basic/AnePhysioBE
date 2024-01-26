package hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.cpax;

import hr.dbasic.anephysiobe.models.physiofile.physiotests.cpax.DefinitionAOP;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record UpdateCpaxRequestDto(
        @NotNull(message = "Physio test id has to be provided")
        String physioTestId,
        @NotNull(message = "Respiratory AOP has to be provided")
        DefinitionAOP respiratoryAop,
        @NotNull(message = "Cough AOP has to be provided")
        DefinitionAOP coughAop,
        @NotNull(message = "Dynamic sitting AOP has to be provided")
        DefinitionAOP dynamicSittingAop,
        @NotNull(message = "Grip strength AOP has to be provided")
        DefinitionAOP gripStrengthAop,
        @NotNull(message = "Moving within bed AOP has to be provided")
        DefinitionAOP movingWithinBedAop,
        @NotNull(message = "Sit to stand AOP has to be provided")
        DefinitionAOP sitToStandAop,
        @NotNull(message = "Standing balance AOP has to be provided")
        DefinitionAOP standingBalanceAop,
        @NotNull(message = "Stepping AOP has to be provided")
        DefinitionAOP steppingAop,
        @NotNull(message = "Transferring from bed AOP has to be provided")
        DefinitionAOP transferringFromBedAop,
        @NotNull(message = "Supine to sitting AOP has to be provided")
        DefinitionAOP supineToSittingAop,
        @NotNull(message = "Cpax date time has to be provided")
        String cpaxDateTime
) {
}
