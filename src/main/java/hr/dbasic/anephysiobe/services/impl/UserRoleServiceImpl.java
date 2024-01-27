package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.exceptions.UserRoleNotFoundException;
import hr.dbasic.anephysiobe.models.users.RoleEnum;
import hr.dbasic.anephysiobe.models.users.UserRole;
import hr.dbasic.anephysiobe.repositories.UserRoleRepositoryMongo;
import hr.dbasic.anephysiobe.services.UserRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRoleServiceImpl implements UserRoleService {
    private final UserRoleRepositoryMongo userRoleRepositoryMongo;

    @Override
    public UserRole getUserRole(RoleEnum role) {
        return userRoleRepositoryMongo.findByName(role.name())
                .orElseThrow(() -> new UserRoleNotFoundException(role));
    }
}
