package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.dto.requests.physiofile.procedure.*;
import hr.dbasic.anephysiobe.dto.responses.ApiResponse;
import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PhysioFileResponseDto;
import hr.dbasic.anephysiobe.mappings.AppMappings;
import hr.dbasic.anephysiobe.services.ProcedureService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ProcedureController.ProcedureMappings.procedureRequestMapping)
@RequiredArgsConstructor
public class ProcedureController {
    private final ProcedureService procedureService;
    
    @PostMapping(ProcedureMappings.createPatientProcedurePostMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> createPatientProcedureInPhysioFileWithId(@Valid @RequestBody CreatePatientProcedureRequestDto createPatientProcedureRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.created(
                        procedureService.createPatientProcedure(createPatientProcedureRequestDto),
                        "Patient procedure successfully added"
                )
        );
    }
    
    @PutMapping(ProcedureMappings.updatePatientProcedureByIdPutMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> updatePatientProcedureById(@PathVariable String id, @Valid @RequestBody UpdatePatientProcedureRequestDto updatePatientProcedureRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Patient procedure successfully updated",
                        procedureService.updatePatientProcedureById(id, updatePatientProcedureRequestDto)
                )
        );
    }
    
    @DeleteMapping(ProcedureMappings.deletePatientProcedureDeleteMapping)
    public ResponseEntity<ApiResponse<?>> deletePatientProcedureById(@Valid @RequestBody DeletePatientProcedureRequestDto deletePatientProcedureRequestDto) {
        procedureService.deletePatientProcedureByIdInPhysioFileById(deletePatientProcedureRequestDto);
        
        return ResponseEntity.ok(
                ApiResponse.ok("Patient procedure successfully deleted")
        );
    }
    
    @PostMapping(ProcedureMappings.createProcedurePostMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> createProcedureInPhysioFileWithId(@Valid @RequestBody CreateProcedureRequestDto createProcedureRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ApiResponse.created(
                        procedureService.createProcedure(createProcedureRequestDto),
                        "Procedure successfully added"
                )
        );
    }
    
    @PutMapping(ProcedureMappings.updateProcedureByIdPutMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> updateProcedureById(@PathVariable String id, @Valid @RequestBody UpdateProcedureRequestDto updateProcedureRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Procedure successfully updated",
                        procedureService.updateProcedureById(id, updateProcedureRequestDto)
                )
        );
    }
    
    @DeleteMapping(ProcedureMappings.deleteProcedureDeleteMapping)
    public ResponseEntity<ApiResponse<PhysioFileResponseDto>> deleteProcedureById(@Valid @RequestBody DeleteProcedureRequestDto deleteProcedureRequestDto) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Procedure successfully deleted",
                        procedureService.deleteProcedureById(deleteProcedureRequestDto)
                )
        );
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class ProcedureMappings {
        public static final String procedureRequestMapping = AppMappings.apiProcedureRequestMapping + "/procedure";
        public static final String createPatientProcedurePostMapping = "/new-patient-procedure";
        public static final String updatePatientProcedureByIdPutMapping = "/update-patient-procedure/{id}";
        public static final String deletePatientProcedureDeleteMapping = "/delete-patient-procedure";
        public static final String createProcedurePostMapping = "/new-procedure";
        public static final String updateProcedureByIdPutMapping = "/update-procedure/{id}";
        public static final String deleteProcedureDeleteMapping = "/delete-procedure";
    }
}
