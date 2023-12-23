package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.patients.Mkb;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MkbRepositoryMongo extends MongoRepository<Mkb, String> {
    Optional<Mkb> findMkbByCode(String code);
}
