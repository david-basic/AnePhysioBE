package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.cpax.CreateCpaxRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.cpax.DeleteCpaxRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.cpax.UpdateCpaxRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.gcs.CreateGcsRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.gcs.DeleteGcsRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.gcs.UpdateGcsRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.mmt.CreateMmtRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.mmt.DeleteMmtRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.physiotests.mmt.UpdateMmtRequestDto;
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
    PhysioFileResponseDto createMmt(CreateMmtRequestDto createMmtRequestDto);
    PhysioFileResponseDto updateMmtById(String id, UpdateMmtRequestDto updateMmtRequestDto);
    void deleteMmtByIdInPhysioTestById(DeleteMmtRequestDto deleteMmtRequestDto);
    PhysioFileResponseDto createGcs(CreateGcsRequestDto createGcsRequestDto);
    PhysioFileResponseDto updateGcsById(String id, UpdateGcsRequestDto updateGcsRequestDto);
    void deleteGcsByIdInPhysioTestById(DeleteGcsRequestDto deleteGcsRequestDto);
    PhysioFileResponseDto createCpax(CreateCpaxRequestDto createCpaxRequestDto);
    PhysioFileResponseDto updateCpaxById(String id, UpdateCpaxRequestDto updateCpaxRequestDto);
    void deleteCpaxByIdInPhysioTestById(DeleteCpaxRequestDto deleteCpaxRequestDto);
}
