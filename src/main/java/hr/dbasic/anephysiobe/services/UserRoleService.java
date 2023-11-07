package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.models.users.RoleEnum;
import hr.dbasic.anephysiobe.models.users.UserRole;

public interface UserRoleService {
    UserRole getUserRole(RoleEnum roleEnum);
}
