package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.requests.CreatePatientRassRequestDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.assessment.Assessment;
import hr.dbasic.anephysiobe.models.physiofile.assessment.PatientRass;
import hr.dbasic.anephysiobe.repositories.AssessmentRepositoryMongo;
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
public class CreatePatientRassRequestToPatientRassConverter implements Converter<CreatePatientRassRequestDto, PatientRass> {
    private final AssessmentRepositoryMongo assessmentRepositoryMongo;
    private final RandomNumberService randomNumberService;
    
    @Override
    public PatientRass convert(@NonNull CreatePatientRassRequestDto source) {
        Assessment foundAssessment = assessmentRepositoryMongo.findById(source.assessmentId()).orElseThrow(EntityNotFoundException.supplier("Assessment"));
        
        String newPrId;
        
        if (foundAssessment.getPatientRass().isEmpty()) {
            newPrId = randomNumberService.generateRandomBigInteger(false, 12).toString();
        } else {
            newPrId = new BigInteger(foundAssessment.getPatientRass().getLast().getId()).add(BigInteger.ONE).toString();
        }
        
        return PatientRass.patientRassBuilder()
                .id(newPrId)
                .score(source.score())
                .term(source.term())
                .scoreDescription(source.scoreDescription())
                .rassDateTime(LocalDateTime.parse(source.rassDateTime(), DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .additionalDescription(source.additionalDescription())
                .build();
    }
}
