package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.departments.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepositoryMongo extends MongoRepository<Department, String> {
}
