package hr.dbasic.anephysiobe.models.physiofile.physiotests.gcs;

import lombok.Getter;

@Getter
public enum EyeOpeningResponseEnum {
    EOR_4(4, "Spontano"),
    EOR_3(3, "Na zvučni podražaj"),
    EOR_2(2, "Na bolni podražaj"),
    EOR_1(1, "Ne otvara oči");
    
    private final Integer score;
    private final String scale;

    EyeOpeningResponseEnum(Integer score, String scale){
        this.score = score;
        this.scale = scale;
    }
    
    @Override
    public String toString() {
        return score + " - " + scale;
    }
}
