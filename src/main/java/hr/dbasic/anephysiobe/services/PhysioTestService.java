package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.vas.CreateVasRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.vas.DeleteVasRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.vas.UpdateVasRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.physiotestResponse.PhysioTestResponseDto;

import java.util.List;

public interface PhysioTestService {
    List<PhysioTestResponseDto> getAllPhysioTests();
    PhysioTestResponseDto getPhysioTestById(String id);
    PhysioFileResponseDto createPhysioTestInPhysioFileWithId(String id);
    PhysioFileResponseDto createVas(CreateVasRequestDto createVasRequestDto);
    PhysioFileResponseDto updateVasById(String id, UpdateVasRequestDto updateVasRequestDto);
    void deleteVasByIdInPhysioTestById(DeleteVasRequestDto deleteVasRequestDto);
}
