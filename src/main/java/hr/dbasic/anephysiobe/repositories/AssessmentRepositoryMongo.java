package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.assessment.Assessment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AssessmentRepositoryMongo extends MongoRepository<Assessment, String> {
}
