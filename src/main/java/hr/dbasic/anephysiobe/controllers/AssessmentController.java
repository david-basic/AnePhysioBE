package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.CreateOrUpdatePointsOfPainRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.CreatePatientRassRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.DeletePatientRassRequestDto;
import hr.dbasic.anephysiobe.dto.requests.physiofile.assessment.UpdatePatientRassRequestDto;
import hr.dbasic.anephysiobe.dto.responses.ApiResponse;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.assessmentResponse.AssessmentResponseDto;
import hr.dbasic.anephysiobe.mappings.AppMappings;
import hr.dbasic.anephysiobe.services.AssessmentService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AssessmentController.AssessmentMappings.assessmentRequestMapping)
@RequiredArgsConstructor
public class AssessmentController {
    private final AssessmentService assessmentService;
    
    @GetMapping(AssessmentMappings.getAllAssessmentsGetMapping)
    public ResponseEntity<ApiResponse<List<AssessmentResponseDto>>> getAllAssessments() {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Procjena uspješno dohvaćena!",
                        assessmentService.getAllAssessments()
                )
        );
    }
    
    @GetMapping(AssessmentMappings.createAssessmentForPhysioFileWithIdGetMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> createAssessmentOnPhysioFileWithId(@PathVariable String id) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Procjena uspješno dodana!",
                        assessmentService.createAssessmentOnPhysioFileWithId(id)
                )
        );
    }
    
    @PostMapping(AssessmentMappings.createPatientRassPostMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> createPatientRass(@Valid @RequestBody CreatePatientRassRequestDto createPatientRassRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "RASS uspješno dodan!",
                        assessmentService.createPatientRass(createPatientRassRequestDto)
                )
        );
    }
    
    @PutMapping(AssessmentMappings.updatePatientRassByIdPutMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> updatePatientRassById(@PathVariable String id, @Valid @RequestBody UpdatePatientRassRequestDto updatePatientRassRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "RASS uspješno ažuriran!",
                        assessmentService.updatePatientRassById(id, updatePatientRassRequestDto)
                )
        );
    }
    
    @DeleteMapping(AssessmentMappings.deletePatientRassDeleteMapping)
    public ResponseEntity<ApiResponse<?>> deletePatientRassById(@Valid @RequestBody DeletePatientRassRequestDto deletePatientRassRequestDto) {
        assessmentService.deletePatientRassByIdInAssessmentById(deletePatientRassRequestDto);
        
        return ResponseEntity.ok(
                ApiResponse.ok("RASS uspješno izbrisan!")
        );
    }
    
    @PutMapping(AssessmentMappings.createOrUpdatePointsOfPainPutMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> updatePointsOfPainById(@PathVariable String id, @Valid @RequestBody CreateOrUpdatePointsOfPainRequestDto updatePatientRassRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Točke boli uspješno ažurirane!",
                        assessmentService.updatePointsOfPainByAssessmentId(id, updatePatientRassRequestDto)
                )
        );
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class AssessmentMappings {
        public static final String assessmentRequestMapping = AppMappings.apiAssessmentRequestMapping + "/assessments";
        public static final String getAllAssessmentsGetMapping = "";
        public static final String createAssessmentForPhysioFileWithIdGetMapping = "/new-assessment/{id}";
        public static final String createPatientRassPostMapping = "/new-patient-rass";
        public static final String updatePatientRassByIdPutMapping = "/update-patient-rass/{id}";
        public static final String deletePatientRassDeleteMapping = "/delete-patient-rass";
        public static final String createOrUpdatePointsOfPainPutMapping = "/create-or-update-points-of-pain/{id}";
    }
}
