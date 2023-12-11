package hr.dbasic.anephysiobe.repositories;

import hr.dbasic.anephysiobe.models.patients.PatientAddress;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PatientAddressRepositoryMongo extends MongoRepository<PatientAddress, String> {
    Optional<PatientAddress> findPatientAddressById(String id);
    Optional<PatientAddress> findPatientAddressByAddress(String address);
}
