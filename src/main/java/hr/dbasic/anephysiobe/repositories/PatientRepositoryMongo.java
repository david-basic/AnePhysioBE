package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.departments.Doctor;
import hr.dbasic.anephysiobe.models.patients.Patient;
import lombok.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PatientRepositoryMongo extends MongoRepository<Patient, String> {
    Optional<Patient> findAllByLeadingDoctor(Doctor doctor);
    
    @Override
    @NonNull
    Optional<Patient> findById(@NonNull String id);
}
