package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.departments.DepartmentLocality;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentLocalityRepositoryMongo extends MongoRepository<DepartmentLocality, String> {
}
