package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses.FunctionalDiagnosis;
import hr.dbasic.anephysiobe.repositories.FunctionalDiagnosisRepositoryMongo;
import hr.dbasic.anephysiobe.services.FunctionalDiagnosisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FunctionalDiagnosisServiceImpl implements FunctionalDiagnosisService {
    
    private final FunctionalDiagnosisRepositoryMongo functionalDiagnosisRepositoryMongo;
    
    @Override
    public FunctionalDiagnosis findFunctionalDiagnosisByDescription(String description) {
        return functionalDiagnosisRepositoryMongo.findFunctionalDiagnosisByDescription(description).orElseThrow(EntityNotFoundException::new);
    }
}
