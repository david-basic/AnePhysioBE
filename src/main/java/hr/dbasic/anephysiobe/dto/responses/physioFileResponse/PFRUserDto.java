package hr.dbasic.anephysiobe.dto.responses.physioFileResponse;

import lombok.Builder;

@Builder
public record PFRUserDto(
        String id,
        String firstName,
        String lastName
) {
}
