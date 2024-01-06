package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.FunctionalDiagnosis;

import java.util.List;

public interface FunctionalDiagnosisService {
    FunctionalDiagnosis findFunctionalDiagnosisByDescription(String description);
    List<FunctionalDiagnosis> findAllFunctionalDiagnoses();
}
