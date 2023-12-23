package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.Box;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoxRepositoryMongo extends MongoRepository<Box, String> {
}
