package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.models.Bed;
import hr.dbasic.anephysiobe.models.Box;
import hr.dbasic.anephysiobe.models.departments.Department;
import hr.dbasic.anephysiobe.models.departments.DepartmentLocality;
import hr.dbasic.anephysiobe.models.departments.LocalityEnum;
import hr.dbasic.anephysiobe.models.doctors.Doctor;
import hr.dbasic.anephysiobe.models.patients.*;
import hr.dbasic.anephysiobe.models.patients.mkbcodes.*;
import hr.dbasic.anephysiobe.repositories.*;
import hr.dbasic.anephysiobe.services.MkbService;
import hr.dbasic.anephysiobe.services.RandomNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    
    private final MkbRepositoryMongo mkbRepositoryMongo;
    private final PatientMkbRepositoryMongo patientMkbRepositoryMongo;
    private final CountyRepositoryMongo countyRepositoryMongo;
    private final DoctorRepositoryMongo doctorRepositoryMongo;
    private final DepartmentLocalityRepositoryMongo departmentLocalityRepositoryMongo;
    private final RandomNumberService randomNumberService;
    private final SexRepositoryMongo sexRepositoryMongo;
    private final PatientRepositoryMongo patientRepositoryMongo;
    private final PatientAddressRepositoryMongo patientAddressRepositoryMongo;
    private final DepartmentRepositoryMongo departmentRepositoryMongo;
    private final BoxRepositoryMongo boxRepositoryMongo;
    private final BedRepositoryMongo bedRepositoryMongo;
    private final PatientOperationRepositoryMongo patientOperationRepositoryMongo;
    private final MkbService mkbService;
    
    @Override
    public void run(String... args) {
        
        Sex female = Sex.builder().name(SexEnum.FEMALE.name()).displayName(SexEnum.FEMALE.getDisplayName()).build();
        Sex male = Sex.builder().name(SexEnum.MALE.name()).displayName(SexEnum.MALE.getDisplayName()).build();
//        sexRepositoryMongo.saveAll(
//                List.of(
//                        female, male
//                )
//        );
        
        List<Mkb> mkbs = new ArrayList<>();
        for (MkbCodesA mkbCode : MkbCodesA.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesB mkbCode : MkbCodesB.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesC mkbCode : MkbCodesC.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesD mkbCode : MkbCodesD.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesE mkbCode : MkbCodesE.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesF mkbCode : MkbCodesF.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesG mkbCode : MkbCodesG.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesH mkbCode : MkbCodesH.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesI mkbCode : MkbCodesI.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesJ mkbCode : MkbCodesJ.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesK mkbCode : MkbCodesK.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesL mkbCode : MkbCodesL.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesM mkbCode : MkbCodesM.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesN mkbCode : MkbCodesN.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesO mkbCode : MkbCodesO.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesP mkbCode : MkbCodesP.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesQ mkbCode : MkbCodesQ.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesR mkbCode : MkbCodesR.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesS mkbCode : MkbCodesS.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesT mkbCode : MkbCodesT.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesU mkbCode : MkbCodesU.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesV mkbCode : MkbCodesV.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesW mkbCode : MkbCodesW.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesX mkbCode : MkbCodesX.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesY mkbCode : MkbCodesY.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        for (MkbCodesZ mkbCode : MkbCodesZ.values()) {
            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
        }
        
//        mkbRepositoryMongo.saveAll(mkbs);
        
        County bjelo_bilo = County.builder().name(CountyEnum.BJELOVARSKO_BILOGORSKA.name()).displayName(CountyEnum.BJELOVARSKO_BILOGORSKA.getDisplayName()).build();
        County brod_pos = County.builder().name(CountyEnum.BRODSKO_POSAVSKA.name()).displayName(CountyEnum.BRODSKO_POSAVSKA.getDisplayName()).build();
        County dubr_nere = County.builder().name(CountyEnum.DUBROVACKO_NERETVANSKA.name()).displayName(CountyEnum.DUBROVACKO_NERETVANSKA.getDisplayName()).build();
        County istr = County.builder().name(CountyEnum.ISTARSKA.name()).displayName(CountyEnum.ISTARSKA.getDisplayName()).build();
        County karlov = County.builder().name(CountyEnum.KARLOVACKA.name()).displayName(CountyEnum.KARLOVACKA.getDisplayName()).build();
        County kopr_kriz = County.builder().name(CountyEnum.KOPRIVNICKO_KRIZEVACKA.name()).displayName(CountyEnum.KOPRIVNICKO_KRIZEVACKA.getDisplayName()).build();
        County krap_zag = County.builder().name(CountyEnum.KRAPINSKO_ZAGORSKA.name()).displayName(CountyEnum.KRAPINSKO_ZAGORSKA.getDisplayName()).build();
        County lic_senj = County.builder().name(CountyEnum.LICKO_SENJSKA.name()).displayName(CountyEnum.LICKO_SENJSKA.getDisplayName()).build();
        County medim = County.builder().name(CountyEnum.MEDIMURSKA.name()).displayName(CountyEnum.MEDIMURSKA.getDisplayName()).build();
        County osje_bara = County.builder().name(CountyEnum.OSJECKO_BARANJSKA.name()).displayName(CountyEnum.OSJECKO_BARANJSKA.getDisplayName()).build();
        County poze_slav = County.builder().name(CountyEnum.POZESKO_SLAVONSKA.name()).displayName(CountyEnum.POZESKO_SLAVONSKA.getDisplayName()).build();
        County prim_gor = County.builder().name(CountyEnum.PRIMORSKO_GORANSKA.name()).displayName(CountyEnum.PRIMORSKO_GORANSKA.getDisplayName()).build();
        County sis_mos = County.builder().name(CountyEnum.SISACKO_MOSLAVACKA.name()).displayName(CountyEnum.SISACKO_MOSLAVACKA.getDisplayName()).build();
        County spli_dal = County.builder().name(CountyEnum.SPLITSKO_DALMATINSKA.name()).displayName(CountyEnum.SPLITSKO_DALMATINSKA.getDisplayName()).build();
        County sib_kni = County.builder().name(CountyEnum.SIBENSKO_KNINSKA.name()).displayName(CountyEnum.SIBENSKO_KNINSKA.getDisplayName()).build();
        County vara = County.builder().name(CountyEnum.VARAZDINSKA.name()).displayName(CountyEnum.VARAZDINSKA.getDisplayName()).build();
        County viro_podr = County.builder().name(CountyEnum.VIROVITICKO_PODRAVSKA.name()).displayName(CountyEnum.VIROVITICKO_PODRAVSKA.getDisplayName()).build();
        County vuko_sri = County.builder().name(CountyEnum.VUKOVARSKO_SRIJEMSKA.name()).displayName(CountyEnum.VUKOVARSKO_SRIJEMSKA.getDisplayName()).build();
        County zadar = County.builder().name(CountyEnum.ZADARSKA.name()).displayName(CountyEnum.ZADARSKA.getDisplayName()).build();
        County zagreba = County.builder().name(CountyEnum.ZAGREBACKA.name()).displayName(CountyEnum.ZAGREBACKA.getDisplayName()).build();
        County grad_zagre = County.builder().name(CountyEnum.GRAD_ZAGREB.name()).displayName(CountyEnum.GRAD_ZAGREB.getDisplayName()).build();
//        countyRepositoryMongo.saveAll(
//                List.of(
//                        bjelo_bilo, brod_pos, dubr_nere, istr, karlov, kopr_kriz, krap_zag, lic_senj, medim, osje_bara,
//                        poze_slav, prim_gor, sis_mos, spli_dal, sib_kni, vara, viro_podr, vuko_sri, zadar, zagreba,
//                        grad_zagre
//                )
//        );
        
        Doctor doc1 = Doctor.builder().firstName("Pero").lastName("Perić").title("prim.").role("spec. anesteziologije, reanim. i intenzivne med.").build();
        Doctor doc2 = Doctor.builder().firstName("Tom").lastName("Tomić").role("spec. anesteziologije, reanim. i intenzivne med.").build();
        Doctor doc3 = Doctor.builder().firstName("Ifo").lastName("Ifić").title("doc.").role("spec. anesteziologije, reanim. i intenzivne med.").build();
//        doctorRepositoryMongo.saveAll(
//                List.of(
//                        doc1, doc2, doc3
//                )
//        );
        
        DepartmentLocality loc1 = DepartmentLocality.builder().name(LocalityEnum.SUSAK.name()).displayName(LocalityEnum.SUSAK.getDisplayName()).build();
        DepartmentLocality loc2 = DepartmentLocality.builder().name(LocalityEnum.RIJEKA.name()).displayName(LocalityEnum.RIJEKA.getDisplayName()).build();
//        departmentLocalityRepositoryMongo.saveAll(
//                List.of(
//                        loc1, loc2
//                )
//        );
        
        PatientAddress pa1 = PatientAddress.builder().address("Trg Petra Krešimira IV 5").county(grad_zagre).city("Zagreb").zipCode(10000).build();
        PatientAddress pa2 = PatientAddress.builder().address("Ulica Kneza Branimira 12").county(spli_dal).city("Split").zipCode(21000).build();
        PatientAddress pa3 = PatientAddress.builder().address("Dr. Franje Tuđmana 22").county(osje_bara).city("Osijek").zipCode(31000).build();
        PatientAddress pa4 = PatientAddress.builder().address("Vukovarska ulica 8").county(prim_gor).city("Rijeka").zipCode(51000).build();
        PatientAddress pa5 = PatientAddress.builder().address("Kralja Tomislava 14").county(zadar).city("Zadar").zipCode(23000).build();
        PatientAddress pa6 = PatientAddress.builder().address("Trg bana Josipa Jelačića 7").county(vara).city("Varaždin").zipCode(42000).build();
        PatientAddress pa7 = PatientAddress.builder().address("Ulica Kralja Zvonimira 33").county(dubr_nere).city("Dubrovnik").zipCode(20000).build();
        PatientAddress pa8 = PatientAddress.builder().address("Maksimirska cesta 64").county(grad_zagre).city("Zagreb").zipCode(10000).build();
        PatientAddress pa9 = PatientAddress.builder().address("Franjevačka ulica 1").county(sib_kni).city("Šibenik").zipCode(22000).build();
        PatientAddress pa10 = PatientAddress.builder().address("Strossmayerova ulica 10").county(istr).city("Pula").zipCode(52100).build();
        PatientAddress pa11 = PatientAddress.builder().address("Ilica 22").county(grad_zagre).city("Zagreb").zipCode(10000).build();
        PatientAddress pa12 = PatientAddress.builder().address("Petra Preradovića 9").county(karlov).city("Karlovac").zipCode(47000).build();
        PatientAddress pa13 = PatientAddress.builder().address("Ul. Stjepana Radića 17").county(brod_pos).city("Slavonski Brod").zipCode(35000).build();
        PatientAddress pa14 = PatientAddress.builder().address("Kralja Petra Svačića 2").county(bjelo_bilo).city("Bjelovar").zipCode(43000).build();
        PatientAddress pa15 = PatientAddress.builder().address("Trg Stjepana Radića 6").county(vuko_sri).city("Vinkovci").zipCode(32000).build();
        PatientAddress pa16 = PatientAddress.builder().address("Mihanovićeva ulica 14").county(grad_zagre).city("Zagreb").zipCode(10000).build();
        PatientAddress pa17 = PatientAddress.builder().address("Dr. Ante Starčevića 29").county(sib_kni).city("Šibenik").zipCode(22100).build();
//        patientAddressRepositoryMongo.saveAll(
//                List.of(
//                        pa1, pa2, pa3, pa4, pa5, pa6, pa7, pa8, pa9, pa10, pa11, pa12, pa13, pa14, pa15, pa16, pa17
//                )
//        );
        
        PatientOperation op1 = PatientOperation.builder().procedureName("Amputacija potkoljenice").procedureDate(LocalDate.of(2023, Month.NOVEMBER, 28)).build(); //opci susak
        PatientOperation op2 = PatientOperation.builder().procedureName("Dekompresivna kraniotomija").procedureDate(LocalDate.of(2023, Month.NOVEMBER, 30)).build(); // opci susak
        PatientOperation op3 = PatientOperation.builder().procedureName("Postavljanje V-V ECMO").procedureDate(LocalDate.of(2023, Month.OCTOBER, 28)).build(); // izolacija susak
        PatientOperation op4 = PatientOperation.builder().procedureName("Commando operacija, kirurška traheotomija").procedureDate(LocalDate.of(2023, Month.DECEMBER, 2)).build(); // jil rijeka box1
        PatientOperation op5 = PatientOperation.builder().procedureName("Kirurška traheotomija").procedureDate(LocalDate.of(2023, Month.DECEMBER, 5)).build(); // jil rijeka box1
//        patientOperationRepositoryMongo.saveAll(
//                List.of(
//                        op1, op2, op3, op4, op5
//                )
//        );
        
        
        PatientMkb pm1 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm2 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm3 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm4 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm5 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm6 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm7 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesC.C01.getCode())).build();
        PatientMkb pm8 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm9 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm10 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm11 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm12 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm13 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm14 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm15 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm16 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
        PatientMkb pm17 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        patientMkbRepositoryMongo.saveAll(
//                List.of(
//                        pm1, pm2, pm3, pm4, pm5, pm6, pm7, pm8, pm8, pm10, pm11, pm12, pm13, pm14, pm15, pm16, pm17
//                )
//        );
        
        
        Patient p1 = Patient.builder().firstName("Mirko").lastName("Mirkić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1987, Month.JANUARY, 8)).sex(male).leadingMkb(pm1).patientMkbs(List.of(pm1)).admissionDateTime(LocalDateTime.of(2023, Month.OCTOBER, 5, 10, 30)).patientAddress(pa1).leadingDoctor(doc1).build();
        Patient p2 = Patient.builder().firstName("Darko").lastName("Darić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1968, Month.FEBRUARY, 2)).sex(male).leadingMkb(pm2).patientMkbs(List.of(pm2)).admissionDateTime(LocalDateTime.of(2023, Month.SEPTEMBER, 18, 15, 45)).patientAddress(pa2).leadingDoctor(doc2).build();
        Patient p3 = Patient.builder().firstName("Frko").lastName("Frkić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1991, Month.MARCH, 3)).sex(male).leadingMkb(pm3).patientMkbs(List.of(pm3)).operations(List.of(op1)).admissionDateTime(LocalDateTime.of(2023, Month.SEPTEMBER, 29, 11, 0)).patientAddress(pa3).leadingDoctor(doc3).build();
        Patient p4 = Patient.builder().firstName("Borko").lastName("Borić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1992, Month.OCTOBER, 15)).sex(male).leadingMkb(pm4).patientMkbs(List.of(pm4)).operations(List.of(op2)).admissionDateTime(LocalDateTime.of(2023, Month.OCTOBER, 12, 13, 20)).patientAddress(pa4).leadingDoctor(doc1).build();
        Patient p5 = Patient.builder().firstName("David").lastName("Davidić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1993, Month.APRIL, 18)).sex(male).leadingMkb(pm5).patientMkbs(List.of(pm5)).operations(List.of(op3)).admissionDateTime(LocalDateTime.of(2023, Month.NOVEMBER, 7, 9, 45)).patientAddress(pa5).leadingDoctor(doc2).build();
        Patient p6 = Patient.builder().firstName("Iva").lastName("Ivić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1943, Month.OCTOBER, 8)).sex(female).leadingMkb(pm6).patientMkbs(List.of(pm6)).admissionDateTime(LocalDateTime.of(2023, Month.SEPTEMBER, 7, 16, 0)).patientAddress(pa6).leadingDoctor(doc3).build();
        Patient p7 = Patient.builder().firstName("Matija").lastName("Mirkić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1956, Month.MAY, 8)).sex(male).leadingMkb(pm7).patientMkbs(List.of(pm7)).operations(List.of(op4)).admissionDateTime(LocalDateTime.of(2023, Month.OCTOBER, 24, 10, 10)).patientAddress(pa7).leadingDoctor(doc1).build();
        Patient p8 = Patient.builder().firstName("Mirko").lastName("Matijić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1969, Month.JULY, 30)).sex(male).leadingMkb(pm8).patientMkbs(List.of(pm8)).operations(List.of(op5)).admissionDateTime(LocalDateTime.of(2023, Month.SEPTEMBER, 13, 14, 30)).patientAddress(pa8).leadingDoctor(doc1).build();
        Patient p9 = Patient.builder().firstName("Perica").lastName("Mirkić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1975, Month.OCTOBER, 8)).sex(male).leadingMkb(pm9).patientMkbs(List.of(pm9)).admissionDateTime(LocalDateTime.of(2023, Month.NOVEMBER, 1, 11, 55)).patientAddress(pa9).leadingDoctor(doc2).build();
        Patient p10 = Patient.builder().firstName("Mirko").lastName("Nikolić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1979, Month.JUNE, 29)).sex(male).leadingMkb(pm10).patientMkbs(List.of(pm10)).admissionDateTime(LocalDateTime.of(2023, Month.OCTOBER, 8, 12, 40)).patientAddress(pa10).leadingDoctor(doc3).build();
        Patient p11 = Patient.builder().firstName("Nikola").lastName("Stafić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1968, Month.MAY, 3)).sex(male).leadingMkb(pm11).patientMkbs(List.of(pm11)).admissionDateTime(LocalDateTime.of(2023, Month.SEPTEMBER, 25, 9, 0)).patientAddress(pa11).leadingDoctor(doc3).build();
        Patient p12 = Patient.builder().firstName("Java").lastName("Javić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1968, Month.MARCH, 6)).sex(female).leadingMkb(pm12).patientMkbs(List.of(pm12)).admissionDateTime(LocalDateTime.of(2023, Month.NOVEMBER, 12, 15, 25)).patientAddress(pa12).leadingDoctor(doc2).build();
        Patient p13 = Patient.builder().firstName("Desna").lastName("Lijeva").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1986, Month.NOVEMBER, 19)).sex(female).leadingMkb(pm13).patientMkbs(List.of(pm13)).admissionDateTime(LocalDateTime.of(2023, Month.OCTOBER, 19, 11, 15)).patientAddress(pa13).leadingDoctor(doc2).build();
        Patient p14 = Patient.builder().firstName("Gornja").lastName("Donja").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1995, Month.FEBRUARY, 8)).sex(female).leadingMkb(pm14).patientMkbs(List.of(pm14)).admissionDateTime(LocalDateTime.of(2023, Month.SEPTEMBER, 2, 8, 50)).patientAddress(pa14).leadingDoctor(doc2).build();
        Patient p15 = Patient.builder().firstName("Ukras").lastName("Bornić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(1997, Month.DECEMBER, 7)).sex(male).leadingMkb(pm15).patientMkbs(List.of(pm15)).admissionDateTime(LocalDateTime.of(2023, Month.NOVEMBER, 6, 9, 30)).patientAddress(pa15).leadingDoctor(doc2).build();
        Patient p16 = Patient.builder().firstName("Borna").lastName("Ukrasnić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(2001, Month.NOVEMBER, 18)).sex(male).leadingMkb(pm16).patientMkbs(List.of(pm16)).admissionDateTime(LocalDateTime.of(2023, Month.SEPTEMBER, 21, 13, 50)).patientAddress(pa16).leadingDoctor(doc1).build();
        Patient p17 = Patient.builder().firstName("Zvjezdica").lastName("Zvikić").identificationNumber(randomNumberService.generateRandomBigInteger()).dob(LocalDate.of(2002, Month.DECEMBER, 8)).sex(female).leadingMkb(pm17).patientMkbs(List.of(pm17)).admissionDateTime(LocalDateTime.of(2023, Month.OCTOBER, 28, 12, 15)).patientAddress(pa17).leadingDoctor(doc3).build();
//        patientRepositoryMongo.saveAll(
//                List.of(
//                        p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17
//                )
//        );
        
        pa1.setPatients(List.of(p1));
        pa2.setPatients(List.of(p2));
        pa3.setPatients(List.of(p3));
        pa4.setPatients(List.of(p4));
        pa5.setPatients(List.of(p5));
        pa6.setPatients(List.of(p6));
        pa7.setPatients(List.of(p7));
        pa8.setPatients(List.of(p8));
        pa9.setPatients(List.of(p9));
        pa10.setPatients(List.of(p10));
        pa11.setPatients(List.of(p11));
        pa12.setPatients(List.of(p12));
        pa13.setPatients(List.of(p13));
        pa14.setPatients(List.of(p14));
        pa15.setPatients(List.of(p15));
        pa16.setPatients(List.of(p16));
        pa17.setPatients(List.of(p17));
//        patientAddressRepositoryMongo.saveAll(
//                List.of(
//                        pa1, pa2, pa3, pa4, pa5, pa6, pa7, pa8, pa9, pa10, pa11, pa12, pa13, pa14, pa15, pa16, pa17
//                )
//        );
        
        op1.setPatient(p3);
        op2.setPatient(p4);
        op3.setPatient(p5);
        op4.setPatient(p7);
        op5.setPatient(p8);
//        patientOperationRepositoryMongo.saveAll(
//                List.of(
//                        op1, op2, op3, op4, op5
//                )
//        );
        
        pm1.setPatient(p1);
        pm2.setPatient(p2);
        pm3.setPatient(p3);
        pm4.setPatient(p4);
        pm5.setPatient(p5);
        pm6.setPatient(p6);
        pm7.setPatient(p7);
        pm8.setPatient(p8);
        pm9.setPatient(p9);
        pm10.setPatient(p10);
        pm11.setPatient(p11);
        pm12.setPatient(p12);
        pm13.setPatient(p13);
        pm14.setPatient(p14);
        pm15.setPatient(p15);
        pm16.setPatient(p16);
        pm17.setPatient(p17);
//        patientMkbRepositoryMongo.saveAll(
//                List.of(
//                        pm1, pm2, pm3, pm4, pm5, pm6, pm7, pm8, pm8, pm10, pm11, pm12, pm13, pm14, pm15, pm16, pm17
//                )
//        );
        
        Bed b1 = Bed.builder().patient(p1).build();
        Bed b2 = Bed.builder().patient(p2).build();
        Bed b3 = Bed.builder().build();
        Bed b4 = Bed.builder().build();
        Bed b5 = Bed.builder().patient(p3).build();
        Bed b6 = Bed.builder().patient(p4).build();
        Bed b7 = Bed.builder().build();
        Bed b8 = Bed.builder().build();
        Bed b9 = Bed.builder().patient(p5).build();
        Bed b10 = Bed.builder().build();
        Bed b11 = Bed.builder().patient(p6).build();
        Bed b12 = Bed.builder().patient(p7).build();
        Bed b13 = Bed.builder().build();
        Bed b14 = Bed.builder().patient(p8).build();
        Bed b15 = Bed.builder().patient(p9).build();
        Bed b16 = Bed.builder().patient(p10).build();
        Bed b17 = Bed.builder().patient(p11).build();
        Bed b18 = Bed.builder().patient(p12).build();
        Bed b19 = Bed.builder().patient(p13).build();
        Bed b20 = Bed.builder().patient(p14).build();
        Bed b21 = Bed.builder().patient(p15).build();
        Bed b22 = Bed.builder().patient(p16).build();
        Bed b23 = Bed.builder().build();
        Bed b24 = Bed.builder().build();
        Bed b25 = Bed.builder().build();
        Bed b26 = Bed.builder().build();
        Bed b27 = Bed.builder().build();
        Bed b28 = Bed.builder().patient(p17).build();
        Bed b29 = Bed.builder().build();
        Bed b30 = Bed.builder().build();
//        bedRepositoryMongo.saveAll(
//                List.of(
//                        b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30
//                )
//        );
        
        // jil susak beds
        List<Bed> bedsForOpciBoxSus = new ArrayList<>();
        bedsForOpciBoxSus.add(b1);
        bedsForOpciBoxSus.add(b2);
        bedsForOpciBoxSus.add(b3);
        bedsForOpciBoxSus.add(b4);
        bedsForOpciBoxSus.add(b5);
        bedsForOpciBoxSus.add(b6);
        bedsForOpciBoxSus.add(b7);
        bedsForOpciBoxSus.add(b8);
        
        List<Bed> bedsForIzolacijaSus = new ArrayList<>();
        bedsForIzolacijaSus.add(b9);
        bedsForIzolacijaSus.add(b10);
        
        List<Bed> bedsForSepticniSus = new ArrayList<>();
        bedsForSepticniSus.add(b11);
        
        //jil rijeka beds
        List<Bed> box1beds = new ArrayList<>();
        box1beds.add(b12);
        box1beds.add(b13);
        box1beds.add(b14);
        box1beds.add(b15);
        List<Bed> box2beds = new ArrayList<>();
        box2beds.add(b16);
        box2beds.add(b17);
        box2beds.add(b18);
        box2beds.add(b19);
        List<Bed> izolacija1beds = new ArrayList<>();
        izolacija1beds.add(b20);
        List<Bed> septicni1beds = new ArrayList<>();
        septicni1beds.add(b21);
        
        //crc beds
        List<Bed> box1beds2 = new ArrayList<>();
        box1beds2.add(b22);
        box1beds2.add(b23);
        box1beds2.add(b24);
        box1beds2.add(b25);
        List<Bed> izo2 = new ArrayList<>();
        izo2.add(b26);
        List<Bed> sept2 = new ArrayList<>();
        sept2.add(b27);
        
        //kardio jil beds
        List<Bed> justBox = new ArrayList<>();
        justBox.add(b28);
        justBox.add(b29);
        justBox.add(b30);
        
        // jil rijeka
        Box box1 = Box.builder().name("Box 1").bedList(box1beds).build();
        Box box2 = Box.builder().name("Box 2").bedList(box2beds).build();
        Box box3 = Box.builder().name("Izolacija").bedList(izolacija1beds).build();
        Box box4 = Box.builder().name("Septični").bedList(septicni1beds).build();
        
        //crc
        Box box5 = Box.builder().name("Box 1").bedList(box1beds2).build();
        Box box6 = Box.builder().name("Izolacija").bedList(izo2).build();
        Box box7 = Box.builder().name("Septični").bedList(sept2).build();
        
        // jil susak
        Box box8 = Box.builder().name("Opći box").bedList(bedsForOpciBoxSus).build();
        Box box9 = Box.builder().name("Izolacija").bedList(bedsForIzolacijaSus).build();
        Box box10 = Box.builder().name("Septični").bedList(bedsForSepticniSus).build();
        
        //kardio jil
        Box box11 = Box.builder().name("Box").bedList(justBox).build();
//        boxRepositoryMongo.saveAll(
//                List.of(
//                        box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11
//                )
//        );
        
        List<Box> jilRijekaBoxes = new ArrayList<>();
        jilRijekaBoxes.add(box1);
        jilRijekaBoxes.add(box2);
        jilRijekaBoxes.add(box3);
        jilRijekaBoxes.add(box4);
        
        List<Box> crcBoxes = new ArrayList<>();
        crcBoxes.add(box5);
        crcBoxes.add(box6);
        crcBoxes.add(box7);
        
        List<Box> jilSusakBoxes = new ArrayList<>();
        jilSusakBoxes.add(box8);
        jilSusakBoxes.add(box9);
        jilSusakBoxes.add(box10);
        
        List<Box> kardioJilBoxes = new ArrayList<>();
        kardioJilBoxes.add(box11);
        
        Department dep1 = Department.builder().name("Jedinica intenzivnog liječenja Rijeka").boxes(jilRijekaBoxes).shorthand("JIL Rijeka").locality(loc2).build();
        Department dep2 = Department.builder().name("COVID respiratorni centar").boxes(crcBoxes).shorthand("CRC").locality(loc2).build();
        Department dep3 = Department.builder().name("Jedinica intenzivnog liječenja Sušak").boxes(jilSusakBoxes).shorthand("JIL Sušak").locality(loc1).build();
        Department dep4 = Department.builder().name("Jedinica intenzivnog liječenja kardiokirurških bolesnika").boxes(kardioJilBoxes).shorthand("Kardio JIL").locality(loc1).build();
//        departmentRepositoryMongo.saveAll(
//                List.of(
//                        dep1, dep2, dep3, dep4
//                )
//        );
        
        doc1.setDepartment(dep1);
        doc2.setDepartment(dep2);
        doc3.setDepartment(dep3);
//        doctorRepositoryMongo.saveAll(
//                List.of(
//                        doc1, doc2, doc3
//                )
//        );


    




    }
}
