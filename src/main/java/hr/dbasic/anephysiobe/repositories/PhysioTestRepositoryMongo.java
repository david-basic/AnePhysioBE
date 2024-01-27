package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.physiotests.PhysioTest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhysioTestRepositoryMongo extends MongoRepository<PhysioTest, String> {
}
