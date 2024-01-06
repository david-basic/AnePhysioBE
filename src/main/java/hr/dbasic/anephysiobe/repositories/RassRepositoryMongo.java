package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.assessment.Rass;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RassRepositoryMongo extends MongoRepository<Rass, String> {
}
