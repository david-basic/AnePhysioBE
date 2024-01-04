package hr.dbasic.anephysiobe.models.patients.mkbcodes;

import lombok.Getter;

@Getter
public enum MkbCodesY {
    
    
    
    private final String displayName;
    private final String code;
    
    MkbCodesY(String displayName, String code) {
        this.displayName = displayName;
        this.code = code;
    }
    
    @Override
    public String toString() {
        return code + " " + displayName;
    }
}
