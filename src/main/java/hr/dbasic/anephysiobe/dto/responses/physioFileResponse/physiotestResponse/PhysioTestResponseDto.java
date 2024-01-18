package hr.dbasic.anephysiobe.dto.responses.physioFileResponse.physiotestResponse;

import hr.dbasic.anephysiobe.models.physiofile.physiotests.Vas;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.cpax.Cpax;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs.Gcs;
import hr.dbasic.anephysiobe.models.physiofile.physiotests.mmt.PatientMmt;
import lombok.Builder;

import java.util.List;

@Builder
public record PhysioTestResponseDto(
        String id,
        List<Cpax> cpax,
        List<Gcs> gcs,
        List<PatientMmt> mmt,
        List<Vas> vas
) {
}
