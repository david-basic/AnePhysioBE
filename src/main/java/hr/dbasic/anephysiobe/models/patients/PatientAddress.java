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
    
    @NotNull(message = "Address must be input!")
    @Size(min = 3, max = 150, message = "Address must be between 3 and 150 characters long")
    private String address;
    
    @NotNull(message = "County name must be input!")
    @DBRef
    private County county;
    
    @NotNull(message = "City name must be input!")
    @Size(min = 2, max = 50, message = "City name must be between 2 and 50 characters long")
    private String city;
    
    @NotNull(message = "Zipcode must be input!")
    @Positive(message = "Zipcode can not be a negative number!")
    @ZipCodeLength
    private Integer zipCode;
    
    @DBRef
    private List<Patient> patients;
    
    @Override
    public String toString() {
        return address + ", " + zipCode + ", " + city + ", " + county;
    }
}
