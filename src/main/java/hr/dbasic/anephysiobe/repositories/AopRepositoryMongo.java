package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.physiotests.cpax.AOP;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AopRepositoryMongo extends MongoRepository<AOP, String> {
}
