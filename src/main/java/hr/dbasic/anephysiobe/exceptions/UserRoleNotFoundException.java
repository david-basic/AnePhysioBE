package hr.dbasic.anephysiobe.exceptions;

import hr.dbasic.anephysiobe.models.users.RoleEnum;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

public class UserRoleNotFoundException extends InternalServerErrorException{
    public UserRoleNotFoundException(RoleEnum role) {
        super(Message.exceptionMessage.formatted(role.getDisplayName())); //TODO might have to change to role.displayName if this doesn't work
    }

    public UserRoleNotFoundException(RoleEnum role, Throwable cause) {
        super(Message.exceptionMessage.formatted(role.getDisplayName()), cause); //TODO might have to change to role.displayName if this doesn't work
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Message {
        public static final String exceptionMessage = "Role %s was not found!";
    }
}
