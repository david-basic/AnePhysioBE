package hr.dbasic.anephysiobe.converters;

import hr.dbasic.anephysiobe.dto.requests.physiofile.procedure.CreatePatientProcedureRequestDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import hr.dbasic.anephysiobe.models.physiofile.procedures.PatientProcedure;
import hr.dbasic.anephysiobe.models.users.User;
import hr.dbasic.anephysiobe.repositories.PhysioFileRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.UserRepositoryMongo;
import hr.dbasic.anephysiobe.services.RandomNumberService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CreatePatientProcedureRequestDtoToPatientProcedureConverter implements Converter<CreatePatientProcedureRequestDto, PatientProcedure> {
    private final PhysioFileRepositoryMongo physioFileRepositoryMongo;
    private final UserRepositoryMongo userRepositoryMongo;
    private final RandomNumberService randomNumberService;
    
    @Override
    public PatientProcedure convert(@NonNull CreatePatientProcedureRequestDto source) {
        PhysioFile physioFile = physioFileRepositoryMongo.findById(source.physioFileId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        
        String newPatientProcedureId;
        
        if (physioFile.getPatientProcedures().isEmpty()) {
            newPatientProcedureId = randomNumberService.generateRandomBigInteger(false, 12).toString();
        } else {
            newPatientProcedureId = new BigInteger(physioFile.getPatientProcedures().getLast().getId()).add(BigInteger.ONE).toString();
        }
        
        List<User> workingTherapists = source.workingTherapistsIds().stream().map(id -> userRepositoryMongo.findById(id).orElseThrow(EntityNotFoundException.supplier("User"))).toList();
        
        return PatientProcedure.patientProcedureBuilder()
                .id(newPatientProcedureId)
                .description(source.description())
                .date(LocalDateTime.parse(source.dateTime(), DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .workingTherapists(workingTherapists)
                .build();
    }
}
