package hr.dbasic.anephysiobe.controllers;

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
import hr.dbasic.anephysiobe.dto.responses.ApiResponse;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.physiotestResponse.PhysioTestResponseDto;
import hr.dbasic.anephysiobe.mappings.AppMappings;
import hr.dbasic.anephysiobe.services.PhysioTestService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(PhysioTestsController.PhysioTestMappings.physioTestRequestMapping)
@RequiredArgsConstructor
public class PhysioTestsController {
    private final PhysioTestService physioTestService;
    
    @GetMapping(PhysioTestMappings.getAllPhysioTestsGetMapping)
    public ResponseEntity<ApiResponse<List<PhysioTestResponseDto>>> getAllPhysioTests() {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Physio tests fetched successfully",
                        physioTestService.getAllPhysioTests()
                
                )
        );
    }
    
    @GetMapping(PhysioTestMappings.getPhysioTestByIdGetMapping)
    public ResponseEntity<ApiResponse<PhysioTestResponseDto>> getPhysioTestById(@PathVariable String id) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Physio test fetched successfully",
                        physioTestService.getPhysioTestById(id)
                )
        );
    }
    
    @GetMapping(PhysioTestMappings.createPhysioTestInPhysioFileWithIdGetMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> createPhysioTestByPhysioFileId(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.created(
                        physioTestService.createPhysioTestInPhysioFileWithId(id),
                        "Physio test successfully created"
                )
        );
    }
    
    @PostMapping(PhysioTestMappings.createVasPostMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> createVasInPhysioTestWithId(@Valid @RequestBody CreateVasRequestDto createVasRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.created(
                        physioTestService.createVas(createVasRequestDto),
                        "VAS successfully added"
                )
        );
    }
    
    @PutMapping(PhysioTestMappings.updateVasByIdPutMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> updateVasById(@PathVariable String id, @Valid @RequestBody UpdateVasRequestDto updateVasRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "VAS successfully updated",
                        physioTestService.updateVasById(id, updateVasRequestDto)
                )
        );
    }
    
    @DeleteMapping(PhysioTestMappings.deleteVasDeleteMapping)
    public ResponseEntity<ApiResponse<?>> deleteVasById(@Valid @RequestBody DeleteVasRequestDto deleteVasRequestDto) {
        physioTestService.deleteVasByIdInPhysioTestById(deleteVasRequestDto);
        
        return ResponseEntity.ok(
                ApiResponse.ok("VAS successfully deleted!")
        );
    }
    
    
    @PostMapping(PhysioTestMappings.createMmtPostMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> createMmtInPhysioTestWithId(@Valid @RequestBody CreateMmtRequestDto createMmtRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.created(
                        physioTestService.createMmt(createMmtRequestDto),
                        "MMT successfully added"
                )
        );
    }
    
    @PutMapping(PhysioTestMappings.updateMmtByIdPutMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> updateMmtById(@PathVariable String id, @Valid @RequestBody UpdateMmtRequestDto updateMmtRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "MMT successfully updated",
                        physioTestService.updateMmtById(id, updateMmtRequestDto)
                )
        );
    }
    
    @DeleteMapping(PhysioTestMappings.deleteMmtDeleteMapping)
    public ResponseEntity<ApiResponse<?>> deleteMmtById(@Valid @RequestBody DeleteMmtRequestDto deleteMmtRequestDto) {
        physioTestService.deleteMmtByIdInPhysioTestById(deleteMmtRequestDto);
        
        return ResponseEntity.ok(
                ApiResponse.ok("MMT successfully deleted!")
        );
    }
    
    @PostMapping(PhysioTestMappings.createGcsPostMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> createGcsInPhysioFileWithId(@Valid @RequestBody CreateGcsRequestDto createGcsRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.created(
                        physioTestService.createGcs(createGcsRequestDto),
                        "GCS successfully added"
                )
        );
    }
    
    @PutMapping(PhysioTestMappings.updateGcsByIdPutMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> updateGcsById(@PathVariable String id, @Valid @RequestBody UpdateGcsRequestDto updateGcsRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "GCS successfully updated",
                        physioTestService.updateGcsById(id, updateGcsRequestDto)
                )
        );
    }
    
    @DeleteMapping(PhysioTestMappings.deleteGcsDeleteMapping)
    public ResponseEntity<ApiResponse<?>> deleteGcsById(@Valid @RequestBody DeleteGcsRequestDto deleteGcsRequestDto) {
        physioTestService.deleteGcsByIdInPhysioTestById(deleteGcsRequestDto);
        
        return ResponseEntity.ok(
                ApiResponse.ok("GCS successfully deleted!")
        );
    }
    
    @PostMapping(PhysioTestMappings.createCpaxPostMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> createCpaxInPhysioFileWithId(@Valid @RequestBody CreateCpaxRequestDto createCpaxRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.created(
                        physioTestService.createCpax(createCpaxRequestDto),
                        "CPAx successfully added"
                )
        );
    }
    
    @PutMapping(PhysioTestMappings.updateCpaxByIdPutMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> updateCpaxById(@PathVariable String id, @Valid @RequestBody UpdateCpaxRequestDto updateCpaxRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "CPAx successfully updated",
                        physioTestService.updateCpaxById(id, updateCpaxRequestDto)
                )
        );
    }
    
    @DeleteMapping(PhysioTestMappings.deleteCpaxDeleteMapping)
    public ResponseEntity<ApiResponse<?>> deleteCpaxById(@Valid @RequestBody DeleteCpaxRequestDto deleteCpaxRequestDto) {
        physioTestService.deleteCpaxByIdInPhysioTestById(deleteCpaxRequestDto);
        
        return ResponseEntity.ok(
                ApiResponse.ok("CPAx successfully deleted")
        );
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class PhysioTestMappings {
        public static final String physioTestRequestMapping = AppMappings.apiPhysioTestsRequestMapping + "/physiotests";
        public static final String getAllPhysioTestsGetMapping = "";
        public static final String getPhysioTestByIdGetMapping = "/{id}";
        public static final String createPhysioTestInPhysioFileWithIdGetMapping = "/new-physiotest/{id}";
        public static final String createVasPostMapping = "/new-vas";
        public static final String updateVasByIdPutMapping = "/update-vas/{id}";
        public static final String deleteVasDeleteMapping = "/delete-vas";
        public static final String createMmtPostMapping = "/new-mmt";
        public static final String updateMmtByIdPutMapping = "/update-mmt/{id}";
        public static final String deleteMmtDeleteMapping = "/delete-mmt";
        public static final String createGcsPostMapping = "/new-gcs";
        public static final String updateGcsByIdPutMapping = "/update-gcs/{id}";
        public static final String deleteGcsDeleteMapping = "/delete-gcs";
        public static final String createCpaxPostMapping = "/new-cpax";
        public static final String updateCpaxByIdPutMapping = "/update-cpax/{id}";
        public static final String deleteCpaxDeleteMapping = "/delete-cpax";
    }
}
