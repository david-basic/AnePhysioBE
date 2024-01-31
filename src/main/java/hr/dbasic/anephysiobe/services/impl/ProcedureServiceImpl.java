package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.converters.CreatePatientProcedureRequestDtoToPatientProcedureConverter;
import hr.dbasic.anephysiobe.converters.CreateProcedureRequestDtoToProcedureConverter;
import hr.dbasic.anephysiobe.converters.PhysioFileToPhysioFileResponseDtoConverter;
import hr.dbasic.anephysiobe.dto.requests.physiofile.procedure.*;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import hr.dbasic.anephysiobe.models.physiofile.procedures.PatientProcedure;
import hr.dbasic.anephysiobe.models.physiofile.procedures.Procedure;
import hr.dbasic.anephysiobe.repositories.PhysioFileRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.ProcedureRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.UserRepositoryMongo;
import hr.dbasic.anephysiobe.services.ProcedureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ProcedureServiceImpl implements ProcedureService {
    private final PhysioFileToPhysioFileResponseDtoConverter physioFileToPhysioFileResponseDtoConverter;
    private final PhysioFileRepositoryMongo physioFileRepositoryMongo;
    private final CreatePatientProcedureRequestDtoToPatientProcedureConverter createPatientProcedureRequestDtoToPatientProcedureConverter;
    private final CreateProcedureRequestDtoToProcedureConverter createProcedureRequestDtoToProcedureConverter;
    private final UserRepositoryMongo userRepositoryMongo;
    private final ProcedureRepositoryMongo procedureRepositoryMongo;
    
    @Override
    public PhysioFileResponseDto createPatientProcedure(CreatePatientProcedureRequestDto createPatientProcedureRequestDto) {
        PatientProcedure newPatientProc = createPatientProcedureRequestDtoToPatientProcedureConverter.convert(createPatientProcedureRequestDto);
        PhysioFile foundFile = physioFileRepositoryMongo.findById(createPatientProcedureRequestDto.physioFileId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        
        foundFile.getPatientProcedures().add(newPatientProc);
        physioFileRepositoryMongo.save(foundFile);
        
        return physioFileToPhysioFileResponseDtoConverter.convert(foundFile);
    }
    
    @Override
    public PhysioFileResponseDto updatePatientProcedureById(String patientProcedureId, UpdatePatientProcedureRequestDto updatePatientProcedureRequestDto) {
        PhysioFile physioFile = physioFileRepositoryMongo.findById(updatePatientProcedureRequestDto.physioFileId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        List<PatientProcedure> newPatientProcedureListState = new ArrayList<>();
        for (PatientProcedure pp : physioFile.getPatientProcedures()) {
            if (Objects.equals(pp.getId(), patientProcedureId)) {
                pp.setDescription(updatePatientProcedureRequestDto.description());
                pp.setDate(LocalDateTime.parse(updatePatientProcedureRequestDto.dateTime(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
                pp.setWorkingTherapists(updatePatientProcedureRequestDto.workingTherapistsIds().stream().map(id -> userRepositoryMongo.findById(id).orElseThrow(EntityNotFoundException.supplier("User"))).toList());
            }
            newPatientProcedureListState.add(pp);
        }
        
        physioFile.setPatientProcedures(newPatientProcedureListState);
        physioFileRepositoryMongo.save(physioFile);
        
        return physioFileToPhysioFileResponseDtoConverter.convert(physioFile);
    }
    
    @Override
    public void deletePatientProcedureByIdInPhysioFileById(DeletePatientProcedureRequestDto deletePatientProcedureRequestDto) {
        PhysioFile physioFile = physioFileRepositoryMongo.findById(deletePatientProcedureRequestDto.physioFileId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        physioFile.getPatientProcedures().removeIf(pp -> Objects.equals(pp.getId(), deletePatientProcedureRequestDto.patientProcedureId()));
        physioFileRepositoryMongo.save(physioFile);
    }
    
    @Override
    public PhysioFileResponseDto createProcedure(CreateProcedureRequestDto createProcedureRequestDto) {
        Procedure newProcedure = createProcedureRequestDtoToProcedureConverter.convert(createProcedureRequestDto);
        procedureRepositoryMongo.save(Objects.requireNonNull(newProcedure));
        
        PhysioFile physioFile = physioFileRepositoryMongo.findById(createProcedureRequestDto.physioFileId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(physioFile);
    }
    
    @Override
    public PhysioFileResponseDto updateProcedureById(String procedureId, UpdateProcedureRequestDto updateProcedureRequestDto) {
        Procedure foundProcedure = procedureRepositoryMongo.findById(procedureId).orElseThrow(EntityNotFoundException.supplier("Procedure"));
        foundProcedure.setDescription(updateProcedureRequestDto.description());
        procedureRepositoryMongo.save(foundProcedure);
        
        PhysioFile physioFile = physioFileRepositoryMongo.findById(updateProcedureRequestDto.physioFileId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(physioFile);
    }
    
    @Override
    public PhysioFileResponseDto deleteProcedureById(DeleteProcedureRequestDto deleteProcedureRequestDto) {
        procedureRepositoryMongo.deleteById(deleteProcedureRequestDto.procedureId());
        
        PhysioFile physioFile = physioFileRepositoryMongo.findById(deleteProcedureRequestDto.physioFileId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(physioFile);
    }
}
