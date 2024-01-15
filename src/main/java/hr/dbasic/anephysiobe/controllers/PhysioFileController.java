package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.dto.requests.CreatePatientRassRequestDto;
import hr.dbasic.anephysiobe.dto.requests.DeletePatientRassRequestDto;
import hr.dbasic.anephysiobe.dto.responses.ApiResponse;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.mappings.AppMappings;
import hr.dbasic.anephysiobe.services.AssessmentService;
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
    private final AssessmentService assessmentService;
    
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
    
    @PostMapping(PhysioFileMappings.createPatientRassPostMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> createPatientRass(@Valid @RequestBody CreatePatientRassRequestDto createPatientRassRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Patient RASS successfully added",
                        physioFileService.createPatientRass(createPatientRassRequestDto)
                )
        );
    }

//    @PutMapping(PhysioFileMappings.updatePatientRassByIdPutMapping)
//    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> updatePatientRassById(@PathVariable String id, @Valid @RequestBody UpdatePatientRassRequestDto updatePatientRassRequestDto) {
//        return ResponseEntity.ok(
//                ApiResponse.ok(
//                    "Patient RASS successfully updated",
//                    physioFileService.updatePatientRassById(id, updatePatientRassRequestDto)
//                )
//        );
//    }
    
    @DeleteMapping(PhysioFileMappings.deletePatientRassByIdDeleteMapping)
    public ResponseEntity<ApiResponse<?>> deletePatientRassById(@Valid @RequestBody DeletePatientRassRequestDto deletePatientRassRequestDto) {
        assessmentService.deletePatientRassByIdInAssessmentById(deletePatientRassRequestDto);
        
        return ResponseEntity.ok(
                ApiResponse.ok("Patient RASS successfully deleted!")
        );
    }
    
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class PhysioFileMappings {
        public static final String physioFileRequestMapping = AppMappings.apiPhysioFileRequestMapping + "/physiofiles";
        public static final String getAllPhysioFilesGetMapping = "";
        public static final String getPhysioFileById = "/{id}";
        public static final String getPhysioFileByPatientIdGetMapping = "/patient/{id}";
        public static final String createPatientRassPostMapping = "/new-patient-rass";
        public static final String updatePatientRassByIdPutMapping = "/update-patient-rass/{id}";
        public static final String deletePatientRassByIdDeleteMapping = "/delete-patient-rass/{id}";
        public static final String updatePhysioFileByIdPutMapping = "/update-file/{id}";
    }
}
