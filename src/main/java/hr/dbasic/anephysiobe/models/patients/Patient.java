package hr.dbasic.anephysiobe.models.patients;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
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
    private String name;
    private Integer age;
    private Mkb leadingMkb; // svaka mkb sifra ima svoj naziv
    private List<Mkb> mkbList;
//    private List<PatientOperation> operationList; // id, naziv operacije / procedure, datum obavljene operacije
    private Date datumPrijema;
    private Long matičniBroj;
//    private PatientAddress adresaa;
    
    
}
