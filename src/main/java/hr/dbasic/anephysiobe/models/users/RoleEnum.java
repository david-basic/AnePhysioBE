package hr.dbasic.anephysiobe.models.users;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(onlyExplicitlyIncluded = true)
public enum RoleEnum {
    ROLE_ADMIN(1, "admin"),
    ROLE_USER(2, "user");

    private final Integer id;

    @ToString.Include
    private final String displayName;

    RoleEnum(Integer id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

}
