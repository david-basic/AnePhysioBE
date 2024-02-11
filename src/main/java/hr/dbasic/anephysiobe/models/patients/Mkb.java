package hr.dbasic.anephysiobe.models.patients;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@Getter
@Setter
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@Document("mkbs")
public class Mkb implements Serializable {
    @Id
    private String id;
    
    @NotNull(message = "MKB kod mora imati naziv!")
    private String code;
    
    @NotNull(message = "MKB kod mora imati ime za prikaz!")
    private String displayName;
    
    @Override
    public String toString() {
        return code + " " + displayName;
    }
}
