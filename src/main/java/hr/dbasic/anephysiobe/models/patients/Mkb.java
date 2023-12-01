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
@Document("mkbList")
public class Mkb implements Serializable {
    @Id
    private String id;
    
    @NotNull(message = "Mkb code must exist!")
    private String code;
    
    @NotNull(message = "Mkb must have a display name!")
    private String displayName;
    
    @Builder.Default
    private Boolean isLeadingMkb = false;
    
    public Mkb(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }
    
    @Override
    public String toString() {
        return code + " " + displayName;
    }
}
