package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;

public interface PhysioFileService {
    PhysioFileResponseDto getPhysioFileByPatientId(String id);
}
