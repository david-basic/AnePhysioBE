package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.EyeOpeningResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EyeOpeningResponseRepositoryMongo extends MongoRepository<EyeOpeningResponse, String> {
}
