package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.dto.responses.ApiResponse;
import hr.dbasic.anephysiobe.dto.responses.DepartmentResponseDto;
import hr.dbasic.anephysiobe.mappings.AppMappings;
import hr.dbasic.anephysiobe.services.DepartmentService;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(DepartmentController.DepartmentMappings.departmentRequestMapping)
@RequiredArgsConstructor
public class DepartmentController {
    
    private final DepartmentService departmentService;
    
    @PostMapping(DepartmentMappings.getAllDepartmentsGetMapping)
    public ResponseEntity<ApiResponse<List<DepartmentResponseDto>>> getAllDepartments() {
        return ResponseEntity.ok(
                ApiResponse.ok(
                        "Departments fetched successfully",
                        departmentService.getAllDepartments()
                )
        );
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class DepartmentMappings {
        public static final String departmentRequestMapping = AppMappings.apiDepartmentRequestMapping + "/dept";
        public static final String getAllDepartmentsGetMapping = "";
    }
}
