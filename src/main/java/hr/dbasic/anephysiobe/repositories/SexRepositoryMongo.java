package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.patients.Sex;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SexRepositoryMongo extends MongoRepository<Sex, String> {
}
