package hr.dbasic.anephysiobe.dto.responses.patientResponse;

import lombok.Builder;

@Builder
public record PRDoctorDto(
        String id,
        String role,
        String fullNameAndTitles
) {
}
