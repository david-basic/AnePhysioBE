package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.users.RefreshToken;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RefreshTokenRepositoryMongo extends MongoRepository<RefreshToken, String> {
    Optional<RefreshToken> findRefreshTokenById(String id);
}
