package hr.dbasic.anephysiobe.models.patients;

import hr.dbasic.anephysiobe.models.departments.Doctor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
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
public class Patient implements Serializable {
    
    @Id
    private String id;
    
    @NotNull(message = "Pacijent mora imati identifikacijski broj!")
    private BigInteger identificationNumber;
    
    @ToString.Include
    @NotNull(message = "Ime pacijenta mora biti definirano!")
    @Size(min = 2, max = 70, message = "Ime mora imati najmanje 2, a najviše 70 znakova!")
    private String firstName;
    
    @ToString.Include
    @NotNull(message = "Prezime pacijenta mora biti definirano!")
    @Size(min = 2, max = 70, message = "Prezime mora imati najmanje 2, a najviše 70 znakova!")
    private String lastName;
    
    @NotNull(message = "Datum rođena pacijenta mora biti definirano!")
    private LocalDate dob;
    
    @NotNull(message = "Spol pacijenta mora biti definiran!")
    @DBRef
    private Sex sex;
    
    @NotNull(message = "Vodeća dijagnoza pacijenta mora biti definirana!")
    @DBRef
    private PatientMkb leadingMkb;
    
    @NotNull(message = "Pacijent mora imati barem 1 dijagnozu!")
    @DBRef
    private List<PatientMkb> patientMkbs;
    
    @DBRef
    private List<PatientOperation> operations;
    
    @NotNull(message = "Datum i vrijeme prijema pacijenta mora biti definirano!")
    private LocalDateTime admissionDateTime;
    
    @NotNull(message = "Adresa stanovanja pacijenta mora biti definirana!")
    @DBRef
    private PatientAddress patientAddress;
    
    @NotNull(message = "Doktor mora biti definiran pacijentu!")
    @DBRef
    private Doctor leadingDoctor;
    
    public Integer getPatientAge() {
        LocalDate today = LocalDate.now();
        Period age = Period.between(dob, today);
        return age.getYears();
    }
}
