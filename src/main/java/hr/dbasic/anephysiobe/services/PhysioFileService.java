package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;

import java.util.List;

public interface PhysioFileService {
    PhysioFileResponseDto getPhysioFileByPatientId(String id);
    List<PhysioFileResponseDto> getAllPhysioFiles();
}
