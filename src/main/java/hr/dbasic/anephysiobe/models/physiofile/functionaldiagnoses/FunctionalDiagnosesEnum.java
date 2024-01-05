package hr.dbasic.anephysiobe.models.physiofile.functionaldiagnoses;

import lombok.Getter;

@Getter
public enum FunctionalDiagnosesEnum {
    
    FD_1("Otežano disanje"),
    FD_2("Otežana pokretljivost"),
    FD_3("Lijevostrana ili desnostrana oduzetost"),
    FD_4("Generalizirana hipotrofija"),
    FD_5("Imobilizacija uvjetovana operativnim postupkom"),
    FD_6("Politrauma");
    
    private final String name;
    
    FunctionalDiagnosesEnum(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
