package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.doctors.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepositoryMongo extends MongoRepository<Doctor, String> {
}
