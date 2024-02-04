package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.patients.Sex;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SexRepositoryMongo extends MongoRepository<Sex, String> {
    Optional<Sex> findByName(String name);
}
