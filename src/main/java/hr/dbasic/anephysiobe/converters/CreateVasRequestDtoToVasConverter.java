package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.vas.CreateVasRequestDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.PhysioTest;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.Vas;
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
public class CreateVasRequestDtoToVasConverter implements Converter<CreateVasRequestDto, Vas> {
    private final PhysioTestRepositoryMongo physioTestRepositoryMongo;
    private final RandomNumberService randomNumberService;
    
    @Override
    public Vas convert(@NonNull CreateVasRequestDto source) {
        PhysioTest physioTest = physioTestRepositoryMongo.findById(source.physioTestId()).orElseThrow(EntityNotFoundException.supplier("Physio test"));
        
        String newVasId;
        
        if (physioTest.getVas().isEmpty()) {
            newVasId = randomNumberService.generateRandomBigInteger(false, 12).toString();
        } else {
            newVasId = new BigInteger(physioTest.getVas().getLast().getId()).add(BigInteger.ONE).toString();
        }
        
        return Vas.builder()
                .id(newVasId)
                .painLevel(source.painLevel())
                .note(source.note())
                .vasDateTime(LocalDateTime.parse(source.vasDateTime(), DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .build();
    }
}
