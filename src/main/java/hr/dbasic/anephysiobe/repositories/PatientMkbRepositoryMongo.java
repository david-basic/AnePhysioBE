package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.patients.Mkb;
import hr.dbasic.anephysiobe.models.patients.Patient;
import hr.dbasic.anephysiobe.models.patients.PatientMkb;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PatientMkbRepositoryMongo extends MongoRepository<PatientMkb, String> {
    List<PatientMkb> findPatientMkbsByMkbCode(Mkb mkb);
    List<PatientMkb> findPatientMkbsByPatient(Patient patient);
}
