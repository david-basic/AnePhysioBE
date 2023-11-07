package hr.dbasic.anephysiobe.dto.responses;

import hr.dbasic.anephysiobe.models.users.User;
import lombok.Builder;

@Builder
public record AuthResponseDto(
    User currentUser
) {

}
