package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhysioFileRepositoryMongo extends MongoRepository<PhysioFile, String> {
}
