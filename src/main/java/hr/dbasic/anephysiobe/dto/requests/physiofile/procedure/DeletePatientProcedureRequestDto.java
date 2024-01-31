package hr.dbasic.anephysiobe.dto.requests.physiofile.procedure;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record DeletePatientProcedureRequestDto(
        @NotNull(message = "Physio file id has to be provided!")
        String physioFileId,
        @NotNull(message = "Patient procedure id has to be provided!")
        String patientProcedureId
) {
}
