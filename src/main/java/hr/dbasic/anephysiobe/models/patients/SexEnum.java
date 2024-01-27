package hr.dbasic.anephysiobe.models.patients;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(onlyExplicitlyIncluded = true)
public enum SexEnum {
    MALE(1, "Male"),
    FEMALE(2, "Female");
    
    private final Integer id;
    
    @ToString.Include
    private final String displayName;
    
    SexEnum(Integer id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }
}
