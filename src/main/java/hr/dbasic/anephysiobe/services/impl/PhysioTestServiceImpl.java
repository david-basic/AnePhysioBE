package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.converters.CreateVasRequestDtoToVasConverter;
import hr.dbasic.anephysiobe.converters.PhysioFileToPhysioFileResponseDtoConverter;
import hr.dbasic.anephysiobe.converters.PhysioTestToPhysioTestResponseDtoConverter;
import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.vas.CreateVasRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.vas.DeleteVasRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.vas.UpdateVasRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.physiotestResponse.PhysioTestResponseDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.PhysioTest;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.Vas;
import hr.dbasic.anephysiobe.repositories.PhysioFileRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.PhysioTestRepositoryMongo;
import hr.dbasic.anephysiobe.services.PhysioTestService;
import hr.dbasic.anephysiobe.validators.CreatePhysioTestOnPhysioFileValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class PhysioTestServiceImpl implements PhysioTestService {
    private final PhysioTestRepositoryMongo physioTestRepositoryMongo;
    private final PhysioFileRepositoryMongo physioFileRepositoryMongo;
    private final PhysioTestToPhysioTestResponseDtoConverter physioTestToPhysioTestResponseDtoConverter;
    private final CreatePhysioTestOnPhysioFileValidator createPhysioTestOnPhysioFileValidator;
    private final PhysioFileToPhysioFileResponseDtoConverter physioFileToPhysioFileResponseDtoConverter;
    private final CreateVasRequestDtoToVasConverter createVasRequestDtoToVasConverter;
    
    @Override
    public List<PhysioTestResponseDto> getAllPhysioTests() {
        return physioTestRepositoryMongo.findAll().stream().map(physioTestToPhysioTestResponseDtoConverter::convert).toList();
    }
    
    @Override
    public PhysioTestResponseDto getPhysioTestById(String id) {
        PhysioTest foundTest = physioTestRepositoryMongo.findById(id).orElseThrow(EntityNotFoundException.supplier("Physio test"));
        return physioTestToPhysioTestResponseDtoConverter.convert(foundTest);
    }
    
    @Override
    public PhysioFileResponseDto createPhysioTestInPhysioFileWithId(String id) {
        PhysioFile physioFile = physioFileRepositoryMongo.findById(id).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        createPhysioTestOnPhysioFileValidator.validate(physioFile);
        
        PhysioTest newPhysioTest = PhysioTest.builder().cpax(new ArrayList<>()).gcs(new ArrayList<>()).mmt(new ArrayList<>()).vas(new ArrayList<>()).build();
        physioTestRepositoryMongo.save(newPhysioTest);
        physioFile.setPhysioTest(newPhysioTest);
        physioFileRepositoryMongo.save(physioFile);
        
        return physioFileToPhysioFileResponseDtoConverter.convert(physioFile);
    }
    
    @Override
    public PhysioFileResponseDto createVas(CreateVasRequestDto createVasRequestDto) {
        Vas newVas = createVasRequestDtoToVasConverter.convert(createVasRequestDto);
        PhysioTest foundTest = physioTestRepositoryMongo.findById(createVasRequestDto.physioTestId()).orElseThrow(EntityNotFoundException.supplier("Physio test"));
        
        foundTest.getVas().add(newVas);
        physioTestRepositoryMongo.save(foundTest);
        
        PhysioFile physioFile = physioFileRepositoryMongo.findPhysioFileByPhysioTestId(createVasRequestDto.physioTestId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(physioFile);
    }
    
    @Override
    public PhysioFileResponseDto updateVasById(String vasId, UpdateVasRequestDto updateVasRequestDto) {
        PhysioTest foundTest = physioTestRepositoryMongo.findById(updateVasRequestDto.physioTestId()).orElseThrow(EntityNotFoundException.supplier("Physio test"));
        
        List<Vas> newVasListState = new ArrayList<>();
        
        for (Vas vas : foundTest.getVas()) {
            if (Objects.equals(vas.getId(), vasId)) {
                vas.setPainLevel(updateVasRequestDto.painLevel());
                vas.setNote(updateVasRequestDto.note());
                vas.setVasDateTime(LocalDateTime.parse(updateVasRequestDto.vasDateTime(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            }
            newVasListState.add(vas);
        }
        
        foundTest.setVas(newVasListState);
        physioTestRepositoryMongo.save(foundTest);
        
        PhysioFile physioFile = physioFileRepositoryMongo.findPhysioFileByPhysioTestId(updateVasRequestDto.physioTestId()).orElseThrow(EntityNotFoundException.supplier("Physio file"));
        return physioFileToPhysioFileResponseDtoConverter.convert(physioFile);
    }
    
    @Override
    public void deleteVasByIdInPhysioTestById(DeleteVasRequestDto deleteVasRequestDto) {
        PhysioTest foundTest = physioTestRepositoryMongo.findById(deleteVasRequestDto.physioTestId()).orElseThrow(EntityNotFoundException.supplier("Physio test"));
        foundTest.getVas().removeIf(vas -> Objects.equals(vas.getId(), deleteVasRequestDto.vasId()));
        physioTestRepositoryMongo.save(foundTest);
    }
}
