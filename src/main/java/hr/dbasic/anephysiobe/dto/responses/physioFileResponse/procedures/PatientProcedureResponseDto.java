package hr.dbasic.anephysiobe.dto.responses.physioFileResponse.procedures;

import hr.dbasic.anephysiobe.dto.responses.physioFileResponse.PFRUserDto;
import lombok.Builder;

import java.util.List;

@Builder
public record PatientProcedureResponseDto(
        String id,
        String description,
        String dateTime,
        List<PFRUserDto> workingTherapists
) {
}
