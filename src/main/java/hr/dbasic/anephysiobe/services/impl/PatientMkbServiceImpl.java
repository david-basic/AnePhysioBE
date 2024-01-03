package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.models.patients.Mkb;
import hr.dbasic.anephysiobe.models.patients.PatientMkb;
import hr.dbasic.anephysiobe.repositories.PatientMkbRepositoryMongo;
import hr.dbasic.anephysiobe.services.PatientMkbService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientMkbServiceImpl implements PatientMkbService {
    
    private final PatientMkbRepositoryMongo patientMkbRepositoryMongo;
    
    @Override
    public List<PatientMkb> findPatientMkbsByMkb(Mkb mkb) {
        return patientMkbRepositoryMongo.findPatientMkbsByMkbCode(mkb);
    }
}
