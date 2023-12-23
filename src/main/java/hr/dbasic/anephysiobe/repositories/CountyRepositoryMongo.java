package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.patients.County;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CountyRepositoryMongo extends MongoRepository<County, String> {

    Optional<County> findByName(String name);
}
