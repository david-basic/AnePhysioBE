package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.dto.responses.ApiResponse;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.mappings.AppMappings;
import hr.dbasic.anephysiobe.services.PhysioFileService;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class PhysioFileMappings {
        public static final String physioFileRequestMapping = AppMappings.apiPhysioFileRequestMapping + "/physiofiles";
        public static final String getAllPhysioFilesGetMapping = "";
        public static final String getPhysioFileById = "/{id}";
        public static final String getPhysioFileByPatientIdGetMapping = "/patient/{id}";
        public static final String createPhysioFilePostMapping = "/create-file";
        public static final String updatePhysioFileByIdPutMapping = "/update-file/{id}";
    }
}
