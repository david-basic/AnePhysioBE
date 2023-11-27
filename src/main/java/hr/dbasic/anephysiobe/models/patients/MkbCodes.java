package hr.dbasic.anephysiobe.models.patients;

import lombok.Getter;

@Getter
public enum MkbCodes {
    A00(1, "Kolera", "A00"),
    A00_0(2, "Kolera koju uzrokuje Vibrio cholerae, biovar cholerae, klasična kolera", "A00.0"),
    A00_1(3, "Kolera koju uzrokuje Vibrio cholerae 01, biovar El Tor, El Tor kolera", "A00.1"),
    A00_9(4, "Kolera, nespecificirana", "A00.9"),
    A01(5, "Trbušni tifus i paratifus", "A01"),
    A01_0(6, "Trbušni tifus, Uzročnik Salmonella typhi", "A01.0"),
    A01_1(7, "Paratifus Aw", "A01.1"),
    A01_2(8, "Paratifus B", "A01.2"),
    A01_3(9, "Paratifus C", "A01.3"),
    A01_4(10, "Paratifus, nespecificiran, Uzročnik Salmonella paratyphi BPO", "A01.4"),
    A02(11, "Ostale infekcije uzrokovane salmonelama", "A02"),
    A02_0(12, "Entritis uzrokovan salmonelom, salmoneloza", "A02.0"),
    A02_1(13, "Sepsa uzrokovana salmonelom", "A02.1"),
    A02_2(14, "Lokalizirane infekcije salmonelama", "A02.2"),
    A02_8(15, "Ostale specificirane infekcije salmonelama", "A02.8"),
    A02_9(16, "Infekcije salmonelama, nespecificirane", "A02.9"),
    A03(17, "Šigeloze", "A03"),
    A03_0(18, "Šigeloza koju uzrokuje Shigella dysenteriae, Šigeloza grupe A (Shiga-Kruse disenterija)", "A03.0"),
    A03_1(19, "Šigeloza koju uzrokuje Shigella flexneri, Šigeloza grupe B", "A03.1"),
    A03_2(20, "Šigeloza koju uzrokuje Shigella boydii, Šigeloza grupe C", "A03.2"),
    A03_3(21, "Šigeloza koju uzrokuje Shigella sonnei, Šigeloza grupe D", "A03.3"),
    A03_8(22, "Ostale šigeloze", "A03.8"),
    A03_9(23, "Šigeloza, nespecificirana, Bacilarna dizenterija BPO", "A03.9"),
    A04(24, "Ostale bakterijske crijevne infekcije", "A04"),
    A04_0(25, "Infekcija enteropatogenom E.coli", "A04.0"),
    A04_1(26, "Infekcija enterotoksičnom E.coli", "A04.1"),
    A04_2(27, "Infekcija enteroinvazivnom E.coli", "A04.2");
    
    private final Integer id;
    private final String displayName;
    private final String code;
    
    MkbCodes(Integer id, String displayName, String code) {
        this.id = id;
        this.displayName = displayName;
        this.code = code;
    }
    
    @Override
    public String toString() {
        return code + " " + displayName;
    }
    }
