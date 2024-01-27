package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.MotorResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MotorResponseRepositoryMongo extends MongoRepository<MotorResponse, String> {
}
