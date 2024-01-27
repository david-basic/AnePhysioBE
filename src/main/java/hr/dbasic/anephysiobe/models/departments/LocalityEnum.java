package hr.dbasic.anephysiobe.models.departments;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(onlyExplicitlyIncluded = true)
public enum LocalityEnum {
    SUSAK(1, "Sušak"),
    RIJEKA(2, "Rijeka");
    
    private final Integer id;
    
    @ToString.Include
    private final String displayName;
    
    LocalityEnum(Integer id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }
}
