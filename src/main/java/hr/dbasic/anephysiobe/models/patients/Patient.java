package hr.dbasic.anephysiobe.models.patients;

import hr.dbasic.anephysiobe.models.doctors.Doctor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("patients")
public class Patient {
    
    @Id
    private String id;
    
    @NotNull(message = "Patient must have identification number!")
    private BigInteger identificationNumber;
    
    @ToString.Include
    @NotNull(message = "Patient must have a first name!")
    @Size(min = 2, max = 70, message = "First name must have at least 2 characters and 70 at most!")
    private String firstName;
    
    @ToString.Include
    @NotNull(message = "Patient must have a last name!")
    @Size(min = 2, max = 70, message = "Last name must have at least 2 characters and 70 at most!")
    private String lastName;
    
    @NotNull(message = "Patient must have a date of birth!")
    private LocalDate dob;
    
    @NotNull(message = "Patient must have a sex!")
    @DBRef
    private Sex sex;
    
    @NotNull(message = "Patient must have a leading MKB!")
    @DBRef
    private PatientMkb leadingMkb;
    
    @NotNull(message = "Patient must have at least 1 MKB!")
    @DBRef
    private List<PatientMkb> patientMkbs;
    
    @DBRef
    private List<PatientOperation> operations;
    
    @NotNull(message = "Patient must have admission date time defined!")
    private LocalDateTime admissionDateTime;
    
    @NotNull(message = "Patient must have an address attached!")
    @DBRef
    private PatientAddress patientAddress;
    
    @NotNull(message = "Patient must have a leading doctor attached!")
    @DBRef
    private Doctor leadingDoctor;
    
    public Integer getPatientAge() {
        LocalDate today = LocalDate.now();
        Period age = Period.between(dob, today);
        return age.getYears();
    }
}
