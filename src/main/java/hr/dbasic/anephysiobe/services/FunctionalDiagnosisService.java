package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.FunctionalDiagnosis;

public interface FunctionalDiagnosisService {
    FunctionalDiagnosis findFunctionalDiagnosisByDescription(String description);
}
