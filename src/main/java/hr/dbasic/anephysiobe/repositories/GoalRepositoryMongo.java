package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.goals.Goal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoalRepositoryMongo extends MongoRepository<Goal, String> {
}
