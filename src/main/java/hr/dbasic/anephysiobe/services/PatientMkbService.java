package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.models.patients.Mkb;
import hr.dbasic.anephysiobe.models.patients.PatientMkb;

import java.util.List;

public interface PatientMkbService {
    List<PatientMkb> findPatientMkbsByMkb(Mkb mkb);
}
