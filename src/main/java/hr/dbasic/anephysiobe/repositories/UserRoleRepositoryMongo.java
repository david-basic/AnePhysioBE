package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.users.UserRole;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRoleRepositoryMongo extends MongoRepository<UserRole, String> {

    Optional<UserRole> findByName(String name);

}
