package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.users.User;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepositoryMongo extends MongoRepository<User, String> {

    Boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);


}
