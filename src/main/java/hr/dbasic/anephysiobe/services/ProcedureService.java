package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.requests.physiofile.procedure.*;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;

public interface ProcedureService {
    PhysioFileResponseDto createPatientProcedure(CreatePatientProcedureRequestDto createPatientProcedureRequestDto);
    PhysioFileResponseDto updatePatientProcedureById(String id, UpdatePatientProcedureRequestDto updatePatientProcedureRequestDto);
    void deletePatientProcedureByIdInPhysioFileById(DeletePatientProcedureRequestDto deletePatientProcedureRequestDto);
    PhysioFileResponseDto createProcedure(CreateProcedureRequestDto createProcedureRequestDto);
    PhysioFileResponseDto updateProcedureById(String id, UpdateProcedureRequestDto updateProcedureRequestDto);
    PhysioFileResponseDto deleteProcedureById(DeleteProcedureRequestDto deleteProcedureRequestDto);
}
