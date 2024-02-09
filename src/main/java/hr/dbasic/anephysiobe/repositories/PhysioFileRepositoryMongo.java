package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PhysioFileRepositoryMongo extends MongoRepository<PhysioFile, String> {
    List<PhysioFile> findPhysioFilesByPatientId(String id);
    Optional<PhysioFile> findPhysioFileByAssessmentId(String id);
    Optional<PhysioFile> findPhysioFileByPhysioTestId(String id);
}
