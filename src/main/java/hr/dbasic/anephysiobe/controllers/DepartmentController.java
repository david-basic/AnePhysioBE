package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.mappings.AppMappings;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    
//    public ResponseEntity<ApiResponse<List<DepartmentResponseDto>>> getAllDepartments() {
//
//    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class DepartmentMappings {
        public static final String departmentRequestMapping = AppMappings.apiDepartmentRequestMapping + "/dept";
        public static final String getAllDepartmentsGetMapping = "";
    }
}
