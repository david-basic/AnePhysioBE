package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.physiofile.plans.Plan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanRepositoryMongo extends MongoRepository<Plan, String> {
}
