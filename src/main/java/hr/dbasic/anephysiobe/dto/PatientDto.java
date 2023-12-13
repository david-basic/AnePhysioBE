package hr.dbasic.anephysiobe.dto;

import lombok.Builder;

@Builder
public record PatientDto(
        String id,
        String firstName,
        String lastName
) {
}
