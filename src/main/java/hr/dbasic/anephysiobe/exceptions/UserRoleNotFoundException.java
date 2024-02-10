package hr.dbasic.anephysiobe.exceptions;

import hr.dbasic.anephysiobe.models.users.RoleEnum;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

public class UserRoleNotFoundException extends InternalServerErrorException{
    public UserRoleNotFoundException(RoleEnum role) {
        super(Message.exceptionMessage.formatted(role.getDisplayName()));
    }

    public UserRoleNotFoundException(RoleEnum role, Throwable cause) {
        super(Message.exceptionMessage.formatted(role.getDisplayName()), cause);
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Message {
        public static final String exceptionMessage = "Rola %s nije pronađena!";
    }
}
