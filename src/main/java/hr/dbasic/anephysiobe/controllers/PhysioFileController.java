package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.dto.requests.physiofile.CloseFileRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.UpdatePhysioFileRequestDto;
import hr.dbasic.anephysiobe.dto.responses.ApiResponse;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.mappings.AppMappings;
import hr.dbasic.anephysiobe.services.PhysioFileService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(PhysioFileController.PhysioFileMappings.physioFileRequestMapping)
@RequiredArgsConstructor
public class PhysioFileController {
    
    private final PhysioFileService physioFileService;
    
    @GetMapping(PhysioFileMappings.getAllPhysioFilesGetMapping)
    public ResponseEntity<ApiResponse<List<PhysioFileResponseDto>>> getAllPhysioFiles() {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Physio files fetched successfully",
                        physioFileService.getAllPhysioFiles()
                )
        );
    }
    
    @GetMapping(PhysioFileMappings.getPhysioFileByPatientIdGetMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> getPhysioFileByPatientId(@PathVariable String id) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Physio file fetched successfully",
                        physioFileService.getPhysioFileByPatientId(id)
                )
        );
    }
    
    @PutMapping(PhysioFileMappings.updatePhysioFileByIdPutMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> updatePhysioFileById(@PathVariable String id, @Valid @RequestBody UpdatePhysioFileRequestDto updatePhysioFileRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Physio file saved successfully",
                        physioFileService.updatePhysioFileById(id, updatePhysioFileRequestDto)
                )
        );
    }
    
    @PutMapping(PhysioFileMappings.closePhysioFileByIdPutMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> closePhysioFileById(@PathVariable String id, @Valid @RequestBody CloseFileRequestDto closeFileRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Physio file closed successfully",
                        physioFileService.closePhysioFileById(id, closeFileRequestDto)
                )
        );
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class PhysioFileMappings {
        public static final String physioFileRequestMapping = AppMappings.apiPhysioFileRequestMapping + "/physiofiles";
        public static final String getAllPhysioFilesGetMapping = "";
        public static final String getPhysioFileById = "/{id}";
        public static final String getPhysioFileByPatientIdGetMapping = "/patient/{id}";
        public static final String createPhysioFilePostMapping = "/create-file";
        public static final String updatePhysioFileByIdPutMapping = "/update-physiofile/{id}";
        public static final String closePhysioFileByIdPutMapping = "/close-physiofile/{id}";
    }
}
