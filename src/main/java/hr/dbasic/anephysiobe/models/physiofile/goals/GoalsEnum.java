package hr.dbasic.anephysiobe.models.physiofile.goals;

import lombok.Getter;

@Getter
public enum GoalsEnum {
    
    G_INTUBIRANI("Intubirani", "Poboljšati opće stanje bolesnika, spriječiti nastanak komplikacija dugotrajnog ležanja"),
    G_EKSTUBIRANI("Ekstubirani", "Edukacija o pravilnom obrascu disanja i iskašljavanja (kod prisutnog sekreta), očuvati snagu i pokretljivost LMA, vertikalizacija");
    
    private final String type;
    private final String description;
    
    GoalsEnum(String type, String description) {
        this.type = type;
        this.description = description;
    }
    
    @Override
    public String toString() {
        return type + ": " + description;
    }
}
