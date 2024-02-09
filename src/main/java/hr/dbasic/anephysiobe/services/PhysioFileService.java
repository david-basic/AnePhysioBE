package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.requests.physiofile.CloseFileRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.UpdatePhysioFileRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;

import java.util.List;

public interface PhysioFileService {
    PhysioFileResponseDto getActivePhysioFileByPatientIdOrCreateNewOne(String id);
    List<PhysioFileResponseDto> getAllPhysioFiles();
    PhysioFileResponseDto updatePhysioFileById(String id, UpdatePhysioFileRequestDto updatePhysioFileRequestDto);
    PhysioFileResponseDto closePhysioFileById(String id, CloseFileRequestDto closeFileRequestDto);
    List<PhysioFileResponseDto> getAllPhysioFilesOfPatientWithId(String id);
    PhysioFileResponseDto getPhysioFileById(String id);
}
