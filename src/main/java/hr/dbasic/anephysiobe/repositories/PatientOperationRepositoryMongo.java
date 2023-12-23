package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.patients.PatientOperation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientOperationRepositoryMongo extends MongoRepository<PatientOperation, String> {
}
