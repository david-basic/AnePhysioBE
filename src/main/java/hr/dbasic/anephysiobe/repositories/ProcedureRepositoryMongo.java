package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.procedures.Procedure;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProcedureRepositoryMongo extends MongoRepository<Procedure, String> {
}
