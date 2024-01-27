package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PhysioFileRepositoryMongo extends MongoRepository<PhysioFile, String> {
    Optional<PhysioFile> findPhysioFileByPatientId(String id);
    Optional<PhysioFile> findPhysioFileByAssessmentId(String id);
    Optional<PhysioFile> findPhysioFileByPhysioTestId(String id);
}
