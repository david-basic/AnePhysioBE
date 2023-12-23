package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.converters.DepartmentToDepartmentResponseDtoConverter;
import hr.dbasic.anephysiobe.dto.responses.departmentResponse.DepartmentResponseDto;
import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.departments.Department;
import hr.dbasic.anephysiobe.repositories.DepartmentRepositoryMongo;
import hr.dbasic.anephysiobe.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepositoryMongo departmentRepositoryMongo;
    private final DepartmentToDepartmentResponseDtoConverter departmentToDepartmentResponseDtoConverter;
    
    @Override
    public List<DepartmentResponseDto> getAllDepartments() {
        return departmentRepositoryMongo.findAll().stream().map(
                departmentToDepartmentResponseDtoConverter::convert
        ).toList();
    }
    
    @Override
    public DepartmentResponseDto getDepartmentById(String id) {
        Department foundDept = departmentRepositoryMongo.findById(id).orElseThrow(EntityNotFoundException.supplier("Department"));
        return departmentToDepartmentResponseDtoConverter.convert(foundDept);
    }
}
