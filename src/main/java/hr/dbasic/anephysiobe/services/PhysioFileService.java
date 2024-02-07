package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.requests.physiofile.CloseFileRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.UpdatePhysioFileRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;

import java.util.List;

public interface PhysioFileService {
    PhysioFileResponseDto getPhysioFileByPatientId(String id);
    List<PhysioFileResponseDto> getAllPhysioFiles();
    PhysioFileResponseDto updatePhysioFileById(String id, UpdatePhysioFileRequestDto updatePhysioFileRequestDto);
    PhysioFileResponseDto closePhysioFileById(String id, CloseFileRequestDto closeFileRequestDto);
}
