package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.dto.responses.DepartmentResponseDto;

import java.util.List;

public interface DepartmentService {
    List<DepartmentResponseDto> getAllDepartments();
    DepartmentResponseDto getDepartmentById(String id);
}
