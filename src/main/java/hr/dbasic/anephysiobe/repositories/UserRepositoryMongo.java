package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.users.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepositoryMongo extends MongoRepository<User, String> {

    Boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);


}
