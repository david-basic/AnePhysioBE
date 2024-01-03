package hr.dbasic.anephysiobe.models.physiofile;

import lombok.Getter;

@Getter
public enum VerbalResponseEnum {
    VR_5(5, "Orijentiran"),
    VR_4(4, "Zbunjen"),
    VR_3(3, "Neodgovarajuće riječi"),
    VR_2(2, "Nerazumljiv govor"),
    VR_1(1, "Nema odgovora");
    
    private final Integer score;
    private final String scale;
    
    VerbalResponseEnum(Integer score, String scale){
        this.score = score;
        this.scale = scale;
    }
    
    @Override
    public String toString() {
        return score + " - " + scale;
    }
}
