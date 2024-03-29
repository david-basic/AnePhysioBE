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
                        "Fizioterapijski kartoni uspješno dohvaćeni!",
                        physioFileService.getAllPhysioFiles()
                )
        );
    }
    
    @GetMapping(PhysioFileMappings.getPhysioFileById)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> getPhysioFileById(@PathVariable String id) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Fizioterapijski karton uspješno dohvaćen!",
                        physioFileService.getPhysioFileById(id)
                )
        );
    }
    
    @GetMapping(PhysioFileMappings.getAllPhysioFilesByPatientIdGetMapping)
    public ResponseEntity<ApiResponse<List<PhysioFileResponseDto>>> getAllPhysioFilesOfPatientWithId(@PathVariable String id) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Fizioterapijski kartoni uspješno dohvaćeni!",
                        physioFileService.getAllPhysioFilesOfPatientWithId(id)
                )
        );
    }
    
    @GetMapping(PhysioFileMappings.getPhysioFileByPatientIdGetMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> getPhysioFileByPatientId(@PathVariable String id) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Fizioterapijski karton uspješno kreiran!",
                        physioFileService.getActivePhysioFileByPatientIdOrCreateNewOne(id)
                )
        );
    }
    
    @PutMapping(PhysioFileMappings.updatePhysioFileByIdPutMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> updatePhysioFileById(@PathVariable String id, @Valid @RequestBody UpdatePhysioFileRequestDto updatePhysioFileRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Fizioterapijski karton uspješno ažuriran!",
                        physioFileService.updatePhysioFileById(id, updatePhysioFileRequestDto)
                )
        );
    }
    
    @PutMapping(PhysioFileMappings.closePhysioFileByIdPutMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> closePhysioFileById(@PathVariable String id, @Valid @RequestBody CloseFileRequestDto closeFileRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Fizioterapijski karton uspješno zatvoren!",
                        physioFileService.closePhysioFileById(id, closeFileRequestDto)
                )
        );
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class PhysioFileMappings {
        public static final String physioFileRequestMapping = AppMappings.apiPhysioFileRequestMapping + "/physiofiles";
        public static final String getAllPhysioFilesGetMapping = "";
        public static final String getAllPhysioFilesByPatientIdGetMapping = "/all-of-patient/{id}";
        public static final String getPhysioFileById = "/file/{id}";
        public static final String getPhysioFileByPatientIdGetMapping = "/patient/{id}";
        public static final String updatePhysioFileByIdPutMapping = "/update-physiofile/{id}";
        public static final String closePhysioFileByIdPutMapping = "/close-physiofile/{id}";
    }
}
