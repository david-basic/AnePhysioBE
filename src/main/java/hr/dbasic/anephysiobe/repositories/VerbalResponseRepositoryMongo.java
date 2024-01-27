package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.VerbalResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VerbalResponseRepositoryMongo extends MongoRepository<VerbalResponse, String> {
}
