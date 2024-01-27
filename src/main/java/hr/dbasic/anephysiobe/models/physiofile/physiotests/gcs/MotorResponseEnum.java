package hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs;

import lombok.Getter;

@Getter
public enum MotorResponseEnum {
    MR_6(6, "Izvršava zapovijedi"),
    MR_5(5, "Lokalizira bolni podražaj"),
    MR_4(4, "Povlačenje od izvora boli"),
    MR_3(3, "Stereotipni fleksijski odgovor na bol"),
    MR_2(2, "Stereotipni ekstenzijski odgovor na bol"),
    MR_1(1, "Nema odgovora");
    
    private final Integer score;
    private final String scale;
    
    MotorResponseEnum(Integer score, String scale){
        this.score = score;
        this.scale = scale;
    }
    
    @Override
    public String toString() {
        return score + " - " + scale;
    }
}
