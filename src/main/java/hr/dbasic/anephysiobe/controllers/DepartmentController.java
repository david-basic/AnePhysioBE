package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.dto.responses.ApiResponse;
import hr.dbasic.anephysiobe.dto.responses.DepartmentResponseDto;
import hr.dbasic.anephysiobe.mappings.AppMappings;
import hr.dbasic.anephysiobe.services.DepartmentService;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(DepartmentController.DepartmentMappings.departmentRequestMapping)
@RequiredArgsConstructor
public class DepartmentController {
    
    private final DepartmentService departmentService;
    
    @GetMapping(DepartmentMappings.getAllDepartmentsGetMapping)
    public ResponseEntity<ApiResponse<List<DepartmentResponseDto>>> getAllDepartments() {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Departments fetched successfully",
                        departmentService.getAllDepartments()
                )
        );
    }
    
    @GetMapping(DepartmentMappings.getDepartmentByIdGetMapping)
    public ResponseEntity<ApiResponse<DepartmentResponseDto>> getDepartmentById(@PathVariable String id) {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Department fetched successfully",
                        departmentService.getDepartmentById(id)
                )
        );
    }
    
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class DepartmentMappings {
        public static final String departmentRequestMapping = AppMappings.apiDepartmentRequestMapping + "/dept";
        public static final String getAllDepartmentsGetMapping = "";
        public static final String getDepartmentByIdGetMapping = "/{id}";
    }
}
