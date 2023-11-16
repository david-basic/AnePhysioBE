package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.RefreshToken;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RefreshTokenRepositoryMongo extends MongoRepository<RefreshToken, String> {
    Optional<RefreshToken> findRefreshTokenById(String id);
}
