package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest.UpdatePatientFunctionalDiagnosisSelectedStateRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest.CreateFunctionalDiagnosisRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest.DeleteFunctionalDiagnosisRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.functionalDiagnosisResponse.FunctionalDiagnosisResponseDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.functionalDiagnosisRequest.UpdateFunctionalDiagnosisRequestDto;

import java.util.List;

public interface FunctionalDiagnosisService {
    List<FunctionalDiagnosisResponseDto> findAllFunctionalDiagnoses();
    
    PhysioFileResponseDto createFunctionalDiagnosis(CreateFunctionalDiagnosisRequestDto createFunctionalDiagnosisRequestDto);
    
    PhysioFileResponseDto updateFunctionalDiagnosisById(String id, UpdateFunctionalDiagnosisRequestDto updateFunctionalDiagnosisRequestDto);
    
    PhysioFileResponseDto deleteFunctionalDiagnosisById(DeleteFunctionalDiagnosisRequestDto deleteFunctionalDiagnosisRequestDto);
    PhysioFileResponseDto updatePatientFunctionalDiagnosisSelectedStateById(String id, UpdatePatientFunctionalDiagnosisSelectedStateRequestDto updatePatientFunctionalDiagnosisSelectedStateRequestDto);
}
