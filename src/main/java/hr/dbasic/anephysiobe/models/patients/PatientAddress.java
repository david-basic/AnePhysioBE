package hr.dbasic.anephysiobe.models.patients;

import hr.dbasic.anephysiobe.annotations.ZipCodeLength;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("patientAddresses")
public class PatientAddress {
    
    @Id
    private String id;
    
    @NotNull(message = "Adresa mora biti definirana!")
    @Size(min = 3, max = 150, message = "Adresa mora imati između 3 i 150 znakova!")
    private String address;
    
    @NotNull(message = "Županija mora biti definirana!")
    @DBRef
    private County county;
    
    @NotNull(message = "Grad mora biti definiran!")
    @Size(min = 2, max = 50, message = "Ime grada mora imati između 2 i 50 znaka!")
    private String city;
    
    @NotNull(message = "Poštanski broj mora biti definiran!")
    @Positive(message = "Poštanski broj ne smije biti negativan broj!")
    @ZipCodeLength
    private Integer zipCode;
    
    @DBRef
    private List<Patient> patients;
    
    @Override
    public String toString() {
        return address + ", " + zipCode + ", " + city + ", " + county.getDisplayName();
    }
}
