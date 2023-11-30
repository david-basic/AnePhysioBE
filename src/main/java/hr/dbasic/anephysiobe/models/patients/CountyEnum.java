package hr.dbasic.anephysiobe.models.patients;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(onlyExplicitlyIncluded = true)
public enum CountyEnum {
    BJELOVARSKO_BILOGORSKA(1, "Bjelovarsko-bilogorska županija"),
    BRODSKO_POSAVSKA(2, "Brodsko-posavska županija"),
    DUBROVACKO_NERETVANSKA(3, "Dubrovačko-neretvanska županija"),
    ISTARSKA(4, "Istarska županija"),
    KARLOVACKA(5, "Karlovačka županija"),
    KOPRIVNICKO_KRIZEVACKA(6, "Koprivničko-križevačka županija"),
    KRAPINSKO_ZAGORSKA(7, "Krapinsko-zagorska županija"),
    LICKO_SENJSKA(8, "Ličko-senjska županija"),
    MEDIMURSKA(9, "Međimurska županija"),
    OSJECKO_BARANJSKA(10, "Osječko-baranjska županija"),
    POZESKO_SLAVONSKA(11, "Požeško-slavonska županija"),
    PRIMORSKO_GORANSKA(12, "Primorsko-goranska županija"),
    SISACKO_MOSLAVACKA(13, "Sisačko-moslavačka županija"),
    SPLITSKO_DALMATINSKA(14, "Splitsko-dalmatinska županija"),
    SIBENSKO_KNINSKA(15, "Šibensko-kninska županija"),
    VARAZDINSKA(16, "Varaždinska županija"),
    VIROVITICKO_PODRAVSKA(17, "Virovitičko-podravska županija"),
    VUKOVARSKO_SRIJEMSKA(18, "Vukovarsko-srijemska županija"),
    ZADARSKA(19, "Zadarska županija"),
    ZAGREBACKA(20, "Zagrebačka županija"),
    GRAD_ZAGREB(21, "Grad Zagreb");
    
    private final Integer id;
    
    @ToString.Include
    private final String displayName;
    
    CountyEnum(Integer id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }
}
