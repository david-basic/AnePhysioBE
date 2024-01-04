package hr.dbasic.anephysiobe.models.physiofile;

import lombok.Getter;

@Getter
public enum ProceduresEnum {
    P_1("Početna procjena"),
    P_2("Vježbe disanja"),
    P_3("ACBT"),
    P_4("Perkusije i vibracije"),
    P_5("Cirkulatorne vježbe"),
    P_6("Aktivne vježbe"),
    P_7("Aktivno potpomognute vježbe"),
    P_8("Pasivne vježbe"),
    P_9("Pasivno potpomognute vježbe"),
    P_10("Pozicioniranje"),
    P_11("Inhalacija"),
    P_12("Bandaža"),
    P_13("Baubinda"),
    P_14("Visoki sjedeći položaj u krevetu"),
    P_15("Posjedanje"),
    P_16("Vertikalizacija"),
    P_17("Hod"),
    P_18("Primjena elektrostimulatora"),
    P_19("Topli oblozi"),
    P_20("Hladni oblozi"),
    P_21("Krioterapija"),
    P_22("Promjena potpore"),
    P_23("Mehanička insuflacija/eksuflacija"),
    P_24("Mehanička eksuflacija"),
    P_25("Završna procjena");
    
    private final String name;
    
    ProceduresEnum(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
