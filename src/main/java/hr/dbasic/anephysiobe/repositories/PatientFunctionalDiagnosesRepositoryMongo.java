package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.PatientFunctionalDiagnosis;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PatientFunctionalDiagnosesRepositoryMongo extends MongoRepository<PatientFunctionalDiagnosis, String> {
    Optional<PatientFunctionalDiagnosis> findByFunctionalDiagnosisId(String id);
}
