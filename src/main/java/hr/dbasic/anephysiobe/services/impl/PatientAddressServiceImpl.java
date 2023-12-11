package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.models.patients.Patient;
import hr.dbasic.anephysiobe.models.patients.PatientAddress;
import hr.dbasic.anephysiobe.repositories.PatientAddressRepositoryMongo;
import hr.dbasic.anephysiobe.services.PatientAddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientAddressServiceImpl implements PatientAddressService {
    
    private final PatientAddressRepositoryMongo patientAddressRepositoryMongo;
    
    @Override
    public void addPatientToAddress(Patient patient, PatientAddress patientAddress) {
        patientAddressRepositoryMongo.findPatientAddressByAddress(patientAddress.getAddress()).ifPresentOrElse(address -> {
            address.getPatients().add(patient);
        }, () -> {
            PatientAddress pa = PatientAddress.builder()
                    .address(patientAddress.getAddress())
                    .county(patientAddress.getCounty())
                    .city(patientAddress.getCity())
                    .zipCode(patientAddress.getZipCode())
                    .patients(List.of(patient))
                    .build();
            patientAddressRepositoryMongo.save(pa);
        });
    }
}
