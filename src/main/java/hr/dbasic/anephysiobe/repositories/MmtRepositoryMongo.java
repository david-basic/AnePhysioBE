package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.physiotests.mmt.Mmt;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MmtRepositoryMongo extends MongoRepository<Mmt, String> {
}
