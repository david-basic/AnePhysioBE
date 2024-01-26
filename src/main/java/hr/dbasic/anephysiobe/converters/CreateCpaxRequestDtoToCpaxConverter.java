package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.cpax.CreateCpaxRequestDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.PhysioTest;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.cpax.AspectOfPhysicality;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.cpax.Cpax;
import hr.dbasic.anephysiobe.repositories.PhysioTestRepositoryMongo;
import hr.dbasic.anephysiobe.services.RandomNumberService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@RequiredArgsConstructor
public class CreateCpaxRequestDtoToCpaxConverter implements Converter<CreateCpaxRequestDto, Cpax> {
    private final PhysioTestRepositoryMongo physioTestRepositoryMongo;
    private final RandomNumberService randomNumberService;
    
    @Override
    public Cpax convert(@NonNull CreateCpaxRequestDto source) {
        PhysioTest physioTest = physioTestRepositoryMongo.findById(source.physioTestId()).orElseThrow(EntityNotFoundException.supplier("Physio test"));
        
        String newCpaxId;
        
        if (physioTest.getCpax().isEmpty()) {
            newCpaxId = randomNumberService.generateRandomBigInteger(false, 12).toString();
        } else {
            newCpaxId = new BigInteger(physioTest.getCpax().getLast().getId()).add(BigInteger.ONE).toString();
        }
        
        AspectOfPhysicality aop = AspectOfPhysicality.builder()
                .respiratoryFunctionAOP(source.respiratoryAop())
                .coughAOP(source.coughAop())
                .dynamicSittingAOP(source.dynamicSittingAop())
                .gripStrengthAOP(source.gripStrengthAop())
                .movingWithinBedAOP(source.movingWithinBedAop())
                .sitToStandAOP(source.sitToStandAop())
                .standingBalanceAOP(source.standingBalanceAop())
                .steppingAOP(source.steppingAop())
                .transferringFromBedToChairAOP(source.transferringFromBedAop())
                .supineToSittingOnTheEdgeOfTheBedAOP(source.supineToSittingAop())
                .build();
        
        return Cpax.builder()
                .id(newCpaxId)
                .aspectOfPhysicality(aop)
                .testDateTime(LocalDateTime.parse(source.cpaxDateTime(), DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .build();
    }
}
