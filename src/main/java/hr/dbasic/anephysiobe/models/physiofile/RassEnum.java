package hr.dbasic.anephysiobe.models.physiofile;

import lombok.Getter;

@Getter
public enum RassEnum {
    R_POS_4("+4", "Borben", "Nasilan, opasnost za osoblje"),
    R_POS_3("+3", "Izrazito agitiran", "Izvlači tubus, katetere; agresivan"),
    R_POS_2("+2", "Agitiran", "Česti nevoljni pokreti, opire se respiratoru"),
    R_POS_1("+1", "Nemiran", "Anksiozan, u strahu, neagresivni pokreti"),
    R0("0", "Budan i miran", "Spontano obraća pažnju na osoblje"),
    R_NEG_1("-1", "Pospan", "Nije potpuno budan, ali se budi na glasovni podražaj (otvara oči, kontakt očima >10 sek)"),
    R_NEG_2("-2", "Lagano sediran", "Kratko se budi na glasovni podražaj, kontakt očima (<10 sek)"),
    R_NEG_3("-3", "Umjereno sediran", "Pomiče očima na podražaj (bez kontakta očima)"),
    R_NEG_4("-4", "Duboko sediran", "Otvara oči na taktilni podražaj"),
    R_NEG_5("-5", "Nepodražljiv", "Ne odgovara na glasovni ni taktilni podražaj");
    
    private final String score;
    private final String term;
    private final String scoreDescription;
    
    RassEnum(String score, String term, String scoreDescription) {
        this.score = score;
        this.term = term;
        this.scoreDescription = scoreDescription;
    }
    
    @Override
    public String toString() {
        return score + " | " + term + " | " + scoreDescription;
    }
}
