package hr.dbasic.anephysiobe.models.physiofile.plans;

import lombok.Getter;

@Getter
public enum PlansEnum {
    
    P_INTUBIRANI("Intubirani", "Pasivne vježbe razgibavanja, drenažne položaji, pozicioniranje u krevetu"),
    P_EKSTUBIRANI("Ekstubirani", "Vježbe disanja, tehnike eliminiranja sekreta (ACBT), cirkulatorne vježbe, CARP-pozicioniranje, funkcionalne vježbe, posjedanje, ustajanje, hod");
    
    private final String type;
    private final String description;
    
    PlansEnum(String type, String description) {
        this.type = type;
        this.description = description;
    }
    
    @Override
    public String toString() {
        return type + ": " + description;
    }
}
