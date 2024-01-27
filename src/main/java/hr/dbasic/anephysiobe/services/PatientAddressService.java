package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.models.patients.Patient;
import hr.dbasic.anephysiobe.models.patients.PatientAddress;

public interface PatientAddressService {
    void addPatientToAddress(Patient patient, PatientAddress patientAddress);
}
