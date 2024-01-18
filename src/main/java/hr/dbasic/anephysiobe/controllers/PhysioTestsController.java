package hr.dbasic.anephysiobe.controllers;

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
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class PhysioTestMappings {
        public static final String physioTestRequestMapping = AppMappings.apiPhysioTestsRequestMapping + "/physiotests";
        public static final String getAllPhysioTestsGetMapping = "";
        public static final String getPhysioTestByIdGetMapping = "/{id}";
        public static final String createPhysioTestInPhysioFileWithIdGetMapping = "/new-physiotest/{id}";
        public static final String createVasPostMapping = "/new-vas";
        public static final String updateVasByIdPutMapping = "/update-vas/{id}";
        public static final String deleteVasDeleteMapping = "/delete-vas";
    }
}
