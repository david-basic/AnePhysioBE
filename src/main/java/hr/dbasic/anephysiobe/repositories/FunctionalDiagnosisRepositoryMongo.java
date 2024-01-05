package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.FunctionalDiagnosis;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface FunctionalDiagnosisRepositoryMongo extends MongoRepository<FunctionalDiagnosis, String> {
    Optional<FunctionalDiagnosis> findFunctionalDiagnosisByDescription(String description);
}
