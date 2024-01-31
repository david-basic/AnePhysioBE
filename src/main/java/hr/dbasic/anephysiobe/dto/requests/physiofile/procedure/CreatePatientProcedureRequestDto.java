package hr.dbasic.anephysiobe.dto.requests.physiofile.procedure;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.List;

@Builder
public record CreatePatientProcedureRequestDto(
        @NotNull(message = "Parent physio file id has to be provided")
        String physioFileId,
        @NotNull(message = "Description has to be provided")
        String description,
        @NotNull(message = "Date time has to be provided")
        String dateTime,
        @NotNull(message = "Id of therapists on the procedure has to be provided")
        List<String> workingTherapistsIds
) {
}
