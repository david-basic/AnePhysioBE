package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.models.patients.County;
import hr.dbasic.anephysiobe.models.patients.CountyEnum;
import hr.dbasic.anephysiobe.models.patients.Mkb;
import hr.dbasic.anephysiobe.models.patients.MkbCodes;
import hr.dbasic.anephysiobe.repositories.CountyRepositoryMongo;
import hr.dbasic.anephysiobe.repositories.MkbRepositoryMongo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    
    private final MkbRepositoryMongo mkbRepositoryMongo;
    private final CountyRepositoryMongo countyRepositoryMongo;
    
    @Override
    public void run(String... args) {
        
        List<Mkb> mkbs = new ArrayList<>();
        
        for (MkbCodes mkbCodes : MkbCodes.values()) {
//            mkbs.add(new Mkb(mkbCodes.getCode(), mkbCodes.getDisplayName()));
            System.out.println(mkbCodes);
        }
        
        //mkbRepositoryMongo.saveAll(mkbs);
        
        County county1 = County.builder().name(CountyEnum.BJELOVARSKO_BILOGORSKA.name()).displayName(CountyEnum.BJELOVARSKO_BILOGORSKA.getDisplayName()).build();
        County county2 = County.builder().name(CountyEnum.BRODSKO_POSAVSKA.name()).displayName(CountyEnum.BRODSKO_POSAVSKA.getDisplayName()).build();
        County county3 = County.builder().name(CountyEnum.DUBROVACKO_NERETVANSKA.name()).displayName(CountyEnum.DUBROVACKO_NERETVANSKA.getDisplayName()).build();
        County county4 = County.builder().name(CountyEnum.ISTARSKA.name()).displayName(CountyEnum.ISTARSKA.getDisplayName()).build();
        County county5 = County.builder().name(CountyEnum.KARLOVACKA.name()).displayName(CountyEnum.KARLOVACKA.getDisplayName()).build();
        County county6 = County.builder().name(CountyEnum.KOPRIVNICKO_KRIZEVACKA.name()).displayName(CountyEnum.KOPRIVNICKO_KRIZEVACKA.getDisplayName()).build();
        County county7 = County.builder().name(CountyEnum.KRAPINSKO_ZAGORSKA.name()).displayName(CountyEnum.KRAPINSKO_ZAGORSKA.getDisplayName()).build();
        County county8 = County.builder().name(CountyEnum.LICKO_SENJSKA.name()).displayName(CountyEnum.LICKO_SENJSKA.getDisplayName()).build();
        County county9 = County.builder().name(CountyEnum.MEDIMURSKA.name()).displayName(CountyEnum.MEDIMURSKA.getDisplayName()).build();
        County county10 = County.builder().name(CountyEnum.OSJECKO_BARANJSKA.name()).displayName(CountyEnum.OSJECKO_BARANJSKA.getDisplayName()).build();
        County county11 = County.builder().name(CountyEnum.POZESKO_SLAVONSKA.name()).displayName(CountyEnum.POZESKO_SLAVONSKA.getDisplayName()).build();
        County county12 = County.builder().name(CountyEnum.PRIMORSKO_GORANSKA.name()).displayName(CountyEnum.PRIMORSKO_GORANSKA.getDisplayName()).build();
        County county13 = County.builder().name(CountyEnum.SISACKO_MOSLAVACKA.name()).displayName(CountyEnum.SISACKO_MOSLAVACKA.getDisplayName()).build();
        County county14 = County.builder().name(CountyEnum.SPLITSKO_DALMATINSKA.name()).displayName(CountyEnum.SPLITSKO_DALMATINSKA.getDisplayName()).build();
        County county15 = County.builder().name(CountyEnum.SIBENSKO_KNINSKA.name()).displayName(CountyEnum.SIBENSKO_KNINSKA.getDisplayName()).build();
        County county16 = County.builder().name(CountyEnum.VARAZDINSKA.name()).displayName(CountyEnum.VARAZDINSKA.getDisplayName()).build();
        County county17 = County.builder().name(CountyEnum.VIROVITICKO_PODRAVSKA.name()).displayName(CountyEnum.VIROVITICKO_PODRAVSKA.getDisplayName()).build();
        County county18 = County.builder().name(CountyEnum.VUKOVARSKO_SRIJEMSKA.name()).displayName(CountyEnum.VUKOVARSKO_SRIJEMSKA.getDisplayName()).build();
        County county19 = County.builder().name(CountyEnum.ZADARSKA.name()).displayName(CountyEnum.ZADARSKA.getDisplayName()).build();
        County county20 = County.builder().name(CountyEnum.ZAGREBACKA.name()).displayName(CountyEnum.ZAGREBACKA.getDisplayName()).build();
        County county21 = County.builder().name(CountyEnum.GRAD_ZAGREB.name()).displayName(CountyEnum.GRAD_ZAGREB.getDisplayName()).build();

//        countyRepositoryMongo.saveAll(
//                List.of(
//                        county1, county2, county3, county4, county5, county6, county7, county8, county9, county10,
//                        county11, county12, county13, county14, county15, county16, county17, county18, county19, county20,
//                        county21
//                )
//        );
    }
}
