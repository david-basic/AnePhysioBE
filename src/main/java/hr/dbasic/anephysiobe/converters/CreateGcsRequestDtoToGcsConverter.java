package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.gcs.CreateGcsRequestDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.PhysioTest;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.Gcs;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.GcsResponse;
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
public class CreateGcsRequestDtoToGcsConverter implements Converter<CreateGcsRequestDto, Gcs> {
    private final PhysioTestRepositoryMongo physioTestRepositoryMongo;
    private final RandomNumberService randomNumberService;
    
    @Override
    public Gcs convert(@NonNull CreateGcsRequestDto source) {
        PhysioTest physioTest = physioTestRepositoryMongo.findById(source.physioTestId()).orElseThrow(EntityNotFoundException.supplier("Physio test"));
        
        String newGcsId;
        
        if (physioTest.getGcs().isEmpty()) {
            newGcsId = randomNumberService.generateRandomBigInteger(false, 12).toString();
        } else {
            newGcsId = new BigInteger(physioTest.getGcs().getLast().getId()).add(BigInteger.ONE).toString();
        }
        
        return Gcs.builder()
                .id(newGcsId)
                .eyeOpeningResponse(
                        GcsResponse.builder()
                                .scale(source.eyeOpeningResponse().getScale())
                                .score(source.eyeOpeningResponse().getScore())
                                .build()
                )
                .verbalResponse(
                        GcsResponse.builder()
                                .scale(source.verbalResponse().getScale())
                                .score(source.verbalResponse().getScore())
                                .build()
                )
                .motorResponse(
                        GcsResponse.builder()
                                .scale(source.motorResponse().getScale())
                                .score(source.motorResponse().getScore())
                                .build()
                )
                .gcsDateTime(LocalDateTime.parse(source.gcsDateTime(), DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .build();
    }
}
