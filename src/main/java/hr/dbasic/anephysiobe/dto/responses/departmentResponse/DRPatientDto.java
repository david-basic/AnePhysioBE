package hr.dbasic.anephysiobe.dto.responses.departmentResponse;

import lombok.Builder;

@Builder
public record DRPatientDto(
        String id,
        String firstName,
        String lastName
) {
}
