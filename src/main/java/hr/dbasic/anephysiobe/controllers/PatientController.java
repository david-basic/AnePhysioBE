package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.dto.responses.ApiResponse;
import hr.dbasic.anephysiobe.dto.responses.patientResponse.PatientResponseDto;
import hr.dbasic.anephysiobe.mappings.AppMappings;
import hr.dbasic.anephysiobe.services.PatientService;
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
@RequestMapping(PatientController.PatientMappings.patientRequestMapping)
@RequiredArgsConstructor
public class PatientController {
    
    private final PatientService patientService;
    
    @GetMapping(PatientMappings.getAllPatientsGetMapping)
    public ResponseEntity<ApiResponse<List<PatientResponseDto>>> getAllPatients() {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Patients fetched successfully",
                        patientService.getAllPatients()
                )
        );
    }
    
    @GetMapping(PatientMappings.getPatientByIdGetMapping)
    public ResponseEntity<ApiResponse<PatientResponseDto>> getPatientById(@PathVariable String id) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Patient fetched successfully",
                        patientService.getPatientById(id)
                )
        );
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class PatientMappings {
        public static final String patientRequestMapping = AppMappings.apiPatientRequestMapping + "/patients";
        public static final String getAllPatientsGetMapping = "";
        public static final String getPatientByIdGetMapping = "/{id}";
    }
}
