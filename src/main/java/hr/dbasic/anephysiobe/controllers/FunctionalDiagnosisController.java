package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.dto.responses.ApiResponse;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.functionalDiagnosisResponse.CreateFunctionalDiagnosisRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.functionalDiagnosisResponse.DeleteFunctionalDiagnosisRequestDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.functionalDiagnosisResponse.FunctionalDiagnosisResponseDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.functionalDiagnosisResponse.UpdateFunctionalDiagnosisRequestDto;
import hr.dbasic.anephysiobe.mappings.AppMappings;
import hr.dbasic.anephysiobe.services.FunctionalDiagnosisService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(FunctionalDiagnosisController.FunctionalDiagnosisMappings.functionalDiagnosisRequestMapping)
@RequiredArgsConstructor
public class FunctionalDiagnosisController {
    private final FunctionalDiagnosisService functionalDiagnosisService;
    
    @GetMapping(FunctionalDiagnosisMappings.getAllFunctionalDiagnosisGetMapping)
    public ResponseEntity<ApiResponse<List<FunctionalDiagnosisResponseDto>>> getAllFunctionalDiagnoses() {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Functional diagnoses fetched successfully!",
                        functionalDiagnosisService.findAllFunctionalDiagnoses()
                )
        );
    }
    
    @PostMapping(FunctionalDiagnosisMappings.createFunctionalDiagnosisGetMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> createFunctionalDiagnosisOnPhysioFileWithId(@Valid @RequestBody CreateFunctionalDiagnosisRequestDto createFunctionalDiagnosisRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.created(
                        functionalDiagnosisService.createFunctionalDiagnosis(createFunctionalDiagnosisRequestDto),
                        "Functional diagnosis successfully created!"
                )
        );
    }
    
    @PutMapping(FunctionalDiagnosisMappings.updateFunctionalDiagnosisByIdPutMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> updateFdById(@PathVariable String id, @Valid @RequestBody UpdateFunctionalDiagnosisRequestDto updateFunctionalDiagnosisRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Functional diagnosis successfully updated!",
                        functionalDiagnosisService.updateFunctionalDiagnosisById(id, updateFunctionalDiagnosisRequestDto)
                )
        );
    }
    
    @DeleteMapping(FunctionalDiagnosisMappings.deleteFunctionalDiagnosisDeleteMapping)
    public ResponseEntity<ApiResponse<?>> deleteFdById(@Valid @RequestBody DeleteFunctionalDiagnosisRequestDto deleteFunctionalDiagnosisRequestDto) {
        functionalDiagnosisService.deleteFunctionalDiagnosisById(deleteFunctionalDiagnosisRequestDto);
        
        return ResponseEntity.ok(
                ApiResponse.ok("Functional diagnosis successfully deleted!")
        );
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class FunctionalDiagnosisMappings {
        public static final String functionalDiagnosisRequestMapping = AppMappings.apiFunctionalDiagnosisRequestMapping + "/diagnoses";
        public static final String getAllFunctionalDiagnosisGetMapping = "";
        public static final String createFunctionalDiagnosisGetMapping = "/new-fd";
        public static final String updateFunctionalDiagnosisByIdPutMapping = "/update-fd/{id}";
        public static final String deleteFunctionalDiagnosisDeleteMapping = "/delete-fd";
    }
}
