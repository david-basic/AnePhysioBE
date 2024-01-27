package hr.dbasic.anephysiobe.models.patients.mkbcodes;

import lombok.Getter;

@Getter
public enum MkbCodesU {
    
    U04("Teški akutni respiratorni sindrom (SARS)", "U04"),
    U04_9("Teški akutni respiratorni sindrom (SARS), nespecificiran", "U04.9"),
    U07_1("COVID-19, virus identificiran", "U07.1"),
    U07_2("COVID-19, virus nije identificiran", "U07.2"),
    U08("Osobna povijest COVID-19", "U08"),
    U08_9("Osobna povijest COVID-19, nespecificirana", "U08.9"),
    U09("Post COVID-19 stanje", "U09"),
    U09_9("Post COVID-19 stanje, nespecificirano", "U09.9"),
    U10("Multisistemski upalni sindrom koji je povezan sa COVID-19", "U10"),
    U10_9("Multisistemski upalni sindrom koji je povezan sa COVID-19, nespecificiran", "U10.9"),
    U11("Potreba za cijepljenjem protiv COVID-19", "U11"),
    U11_9("Potreba za cijepljenjem protiv COVID-19, nespecificirana", "U11.9"),
    U12("COVID-19 cjepiva koja uzrokuju štetne učinke u terapijskoj primjeni", "U12"),
    U12_9("COVID-19 cjepiva koja uzrokuju štetne učinke u terapijskoj primjeni, nespecificirana", "U12.9"),
    U80("Agens otporan na penicilin i srodne antibiotike", "U80"),
    U80_0("Agens otporan na penicilin", "U80.0"),
    U80_1("Agens otporan na meticilin", "U80.1"),
    U80_8("Agens otporan na druge antibiotike srodne penicilinu", "U80.8"),
    U81("Agens otporan na vankomicin i srodne antibiotike", "U81"),
    U81_0("Agens otporan na vankomicin", "U81.0"),
    U81_8("Agens otporan na antibiotike srodne vankomicinu", "U81.8"),
    U88("Agens otporan na više antibiotika", "U88"),
    U89("Agens otporan na druge i neodređene antibiotike", "U89"),
    U89_8("Agens otporan na neki drugi označeni antibiotik", "U89.8"),
    U89_9("Agens otporan na neoznačeni antibiotik", "U89.9");
    
    private final String displayName;
    private final String code;
    
    MkbCodesU(String displayName, String code) {
        this.displayName = displayName;
        this.code = code;
    }
    
    @Override
    public String toString() {
        return code + " " + displayName;
    }
}
