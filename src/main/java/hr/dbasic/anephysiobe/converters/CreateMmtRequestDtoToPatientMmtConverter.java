package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.mmt.CreateMmtRequestDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.PhysioTest;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.mmt.PatientMmt;
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
public class CreateMmtRequestDtoToPatientMmtConverter implements Converter<CreateMmtRequestDto, PatientMmt> {
    private final PhysioTestRepositoryMongo physioTestRepositoryMongo;
    private final RandomNumberService randomNumberService;
    
    @Override
    public PatientMmt convert(@NonNull CreateMmtRequestDto source) {
        PhysioTest physioTest = physioTestRepositoryMongo.findById(source.physioTestId()).orElseThrow(EntityNotFoundException.supplier("Physio test"));
        
        String newMmtId;
        
        if (physioTest.getMmt().isEmpty()) {
            newMmtId = randomNumberService.generateRandomBigInteger(false, 12).toString();
        } else {
            newMmtId = new BigInteger(physioTest.getMmt().getLast().getId()).add(BigInteger.ONE).toString();
        }
        
        return PatientMmt.patientMmtBuilder()
                .id(newMmtId)
                .grade(source.grade())
                .description(source.description())
                .mmtDateTime(LocalDateTime.parse(source.mmtDateTime(), DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .note(source.note())
                .build();
    }
}
