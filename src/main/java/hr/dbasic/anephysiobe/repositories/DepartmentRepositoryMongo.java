package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.departments.Department;
import lombok.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DepartmentRepositoryMongo extends MongoRepository<Department, String> {
    @Override
    @NonNull
    Optional<Department> findById(@NonNull String id);
}
