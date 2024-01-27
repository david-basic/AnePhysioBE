package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.departments.Bed;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BedRepositoryMongo extends MongoRepository<Bed, String> {
}
