package hr.dbasic.anephysiobe.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@SuppressWarnings({"DuplicatedCode", "SpellCheckingInspection", "CommentedOutCode", "unused", "MismatchedQueryAndUpdateOfCollection"})
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

//    private final MkbRepositoryMongo mkbRepositoryMongo;
//    private final PatientMkbRepositoryMongo patientMkbRepositoryMongo;
//    private final CountyRepositoryMongo countyRepositoryMongo;
//    private final DoctorRepositoryMongo doctorRepositoryMongo;
//    private final DepartmentLocalityRepositoryMongo departmentLocalityRepositoryMongo;
//    private final RandomNumberService randomNumberService;
//    private final SexRepositoryMongo sexRepositoryMongo;
//    private final PatientRepositoryMongo patientRepositoryMongo;
//    private final PatientAddressRepositoryMongo patientAddressRepositoryMongo;
//    private final DepartmentRepositoryMongo departmentRepositoryMongo;
//    private final BoxRepositoryMongo boxRepositoryMongo;
//    private final BedRepositoryMongo bedRepositoryMongo;
//    private final PatientOperationRepositoryMongo patientOperationRepositoryMongo;
//    private final MkbService mkbService;
//    private final FunctionalDiagnosisRepositoryMongo functionalDiagnosisRepositoryMongo;
//    private final AssessmentRepositoryMongo assessmentRepositoryMongo;
//    private final RassRepositoryMongo rassRepositoryMongo;
//    private final GoalRepositoryMongo goalRepositoryMongo;
//    private final PlanRepositoryMongo planRepositoryMongo;
//    private final PhysioTestRepositoryMongo physioTestRepositoryMongo;
//    private final PhysioFileRepositoryMongo physioFileRepositoryMongo;
//    private final ProcedureRepositoryMongo procedureRepositoryMongo;
//    private final MmtRepositoryMongo mmtRepositoryMongo;
//    private final EyeOpeningResponseRepositoryMongo eyeOpeningResponseRepositoryMongo;
//    private final MotorResponseRepositoryMongo motorResponseRepositoryMongo;
//    private final VerbalResponseRepositoryMongo verbalResponseRepositoryMongo;
//    private final AopRepositoryMongo aopRepositoryMongo;

    @Override
    public void run(String... args) {

//        Sex female = Sex.builder().name(SexEnum.FEMALE.name()).displayName(SexEnum.FEMALE.getDisplayName()).build();
//        Sex male = Sex.builder().name(SexEnum.MALE.name()).displayName(SexEnum.MALE.getDisplayName()).build();
//        sexRepositoryMongo.saveAll(
//                List.of(
//                        female, male
//                )
//        );
//
//        List<Mkb> mkbs = new ArrayList<>();
//        for (MkbCodesA mkbCode : MkbCodesA.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesB mkbCode : MkbCodesB.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesC mkbCode : MkbCodesC.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesD mkbCode : MkbCodesD.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesE mkbCode : MkbCodesE.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesF mkbCode : MkbCodesF.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesG mkbCode : MkbCodesG.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesH mkbCode : MkbCodesH.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesI mkbCode : MkbCodesI.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesJ mkbCode : MkbCodesJ.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesK mkbCode : MkbCodesK.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesL mkbCode : MkbCodesL.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesM mkbCode : MkbCodesM.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesN mkbCode : MkbCodesN.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesO mkbCode : MkbCodesO.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesP mkbCode : MkbCodesP.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesQ mkbCode : MkbCodesQ.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesR mkbCode : MkbCodesR.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesS mkbCode : MkbCodesS.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesT mkbCode : MkbCodesT.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesU mkbCode : MkbCodesU.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesV mkbCode : MkbCodesV.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesW mkbCode : MkbCodesW.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesX mkbCode : MkbCodesX.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesY mkbCode : MkbCodesY.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        for (MkbCodesZ mkbCode : MkbCodesZ.values()) {
//            mkbs.add(Mkb.builder().code(mkbCode.getCode()).displayName(mkbCode.getDisplayName()).build());
//        }
//        mkbRepositoryMongo.saveAll(mkbs);
//
//        County bjelo_bilo = County.builder().name(CountyEnum.BJELOVARSKO_BILOGORSKA.name()).displayName(CountyEnum.BJELOVARSKO_BILOGORSKA.getDisplayName()).build();
//        County brod_pos = County.builder().name(CountyEnum.BRODSKO_POSAVSKA.name()).displayName(CountyEnum.BRODSKO_POSAVSKA.getDisplayName()).build();
//        County dubr_nere = County.builder().name(CountyEnum.DUBROVACKO_NERETVANSKA.name()).displayName(CountyEnum.DUBROVACKO_NERETVANSKA.getDisplayName()).build();
//        County istr = County.builder().name(CountyEnum.ISTARSKA.name()).displayName(CountyEnum.ISTARSKA.getDisplayName()).build();
//        County karlov = County.builder().name(CountyEnum.KARLOVACKA.name()).displayName(CountyEnum.KARLOVACKA.getDisplayName()).build();
//        County kopr_kriz = County.builder().name(CountyEnum.KOPRIVNICKO_KRIZEVACKA.name()).displayName(CountyEnum.KOPRIVNICKO_KRIZEVACKA.getDisplayName()).build();
//        County krap_zag = County.builder().name(CountyEnum.KRAPINSKO_ZAGORSKA.name()).displayName(CountyEnum.KRAPINSKO_ZAGORSKA.getDisplayName()).build();
//        County lic_senj = County.builder().name(CountyEnum.LICKO_SENJSKA.name()).displayName(CountyEnum.LICKO_SENJSKA.getDisplayName()).build();
//        County medim = County.builder().name(CountyEnum.MEDIMURSKA.name()).displayName(CountyEnum.MEDIMURSKA.getDisplayName()).build();
//        County osje_bara = County.builder().name(CountyEnum.OSJECKO_BARANJSKA.name()).displayName(CountyEnum.OSJECKO_BARANJSKA.getDisplayName()).build();
//        County poze_slav = County.builder().name(CountyEnum.POZESKO_SLAVONSKA.name()).displayName(CountyEnum.POZESKO_SLAVONSKA.getDisplayName()).build();
//        County prim_gor = County.builder().name(CountyEnum.PRIMORSKO_GORANSKA.name()).displayName(CountyEnum.PRIMORSKO_GORANSKA.getDisplayName()).build();
//        County sis_mos = County.builder().name(CountyEnum.SISACKO_MOSLAVACKA.name()).displayName(CountyEnum.SISACKO_MOSLAVACKA.getDisplayName()).build();
//        County spli_dal = County.builder().name(CountyEnum.SPLITSKO_DALMATINSKA.name()).displayName(CountyEnum.SPLITSKO_DALMATINSKA.getDisplayName()).build();
//        County sib_kni = County.builder().name(CountyEnum.SIBENSKO_KNINSKA.name()).displayName(CountyEnum.SIBENSKO_KNINSKA.getDisplayName()).build();
//        County vara = County.builder().name(CountyEnum.VARAZDINSKA.name()).displayName(CountyEnum.VARAZDINSKA.getDisplayName()).build();
//        County viro_podr = County.builder().name(CountyEnum.VIROVITICKO_PODRAVSKA.name()).displayName(CountyEnum.VIROVITICKO_PODRAVSKA.getDisplayName()).build();
//        County vuko_sri = County.builder().name(CountyEnum.VUKOVARSKO_SRIJEMSKA.name()).displayName(CountyEnum.VUKOVARSKO_SRIJEMSKA.getDisplayName()).build();
//        County zadar = County.builder().name(CountyEnum.ZADARSKA.name()).displayName(CountyEnum.ZADARSKA.getDisplayName()).build();
//        County zagreba = County.builder().name(CountyEnum.ZAGREBACKA.name()).displayName(CountyEnum.ZAGREBACKA.getDisplayName()).build();
//        County grad_zagre = County.builder().name(CountyEnum.GRAD_ZAGREB.name()).displayName(CountyEnum.GRAD_ZAGREB.getDisplayName()).build();
//        countyRepositoryMongo.saveAll(
//                List.of(
//                        bjelo_bilo, brod_pos, dubr_nere, istr, karlov, kopr_kriz, krap_zag, lic_senj, medim, osje_bara,
//                        poze_slav, prim_gor, sis_mos, spli_dal, sib_kni, vara, viro_podr, vuko_sri, zadar, zagreba,
//                        grad_zagre
//                )
//        );
//
//        Doctor doc1 = Doctor.builder().firstName("Pero").lastName("Perić").title("prim.").role("spec. anesteziologije, reanim. i intenzivne med.").build();
//        Doctor doc2 = Doctor.builder().firstName("Tom").lastName("Tomić").role("spec. anesteziologije, reanim. i intenzivne med.").build();
//        Doctor doc3 = Doctor.builder().firstName("Ifo").lastName("Ifić").title("doc.").role("spec. anesteziologije, reanim. i intenzivne med.").build();
//        doctorRepositoryMongo.saveAll(
//                List.of(
//                        doc1, doc2, doc3
//                )
//        );
//
//        DepartmentLocality loc1 = DepartmentLocality.builder().name(LocalityEnum.SUSAK.name()).displayName(LocalityEnum.SUSAK.getDisplayName()).build();
//        DepartmentLocality loc2 = DepartmentLocality.builder().name(LocalityEnum.RIJEKA.name()).displayName(LocalityEnum.RIJEKA.getDisplayName()).build();
//        departmentLocalityRepositoryMongo.saveAll(
//                List.of(
//                        loc1, loc2
//                )
//        );
//
//        PatientAddress pa1 = PatientAddress.builder().address("Trg Petra Krešimira IV 5").county(grad_zagre).city("Zagreb").zipCode(10000).build();
//        PatientAddress pa2 = PatientAddress.builder().address("Ulica Kneza Branimira 12").county(spli_dal).city("Split").zipCode(21000).build();
//        PatientAddress pa3 = PatientAddress.builder().address("Dr. Franje Tuđmana 22").county(osje_bara).city("Osijek").zipCode(31000).build();
//        PatientAddress pa4 = PatientAddress.builder().address("Vukovarska ulica 8").county(prim_gor).city("Rijeka").zipCode(51000).build();
//        PatientAddress pa5 = PatientAddress.builder().address("Kralja Tomislava 14").county(zadar).city("Zadar").zipCode(23000).build();
//        PatientAddress pa6 = PatientAddress.builder().address("Trg bana Josipa Jelačića 7").county(vara).city("Varaždin").zipCode(42000).build();
//        PatientAddress pa7 = PatientAddress.builder().address("Ulica Kralja Zvonimira 33").county(dubr_nere).city("Dubrovnik").zipCode(20000).build();
//        PatientAddress pa8 = PatientAddress.builder().address("Maksimirska cesta 64").county(grad_zagre).city("Zagreb").zipCode(10000).build();
//        PatientAddress pa9 = PatientAddress.builder().address("Franjevačka ulica 1").county(sib_kni).city("Šibenik").zipCode(22000).build();
//        PatientAddress pa10 = PatientAddress.builder().address("Strossmayerova ulica 10").county(istr).city("Pula").zipCode(52100).build();
//        PatientAddress pa11 = PatientAddress.builder().address("Ilica 22").county(grad_zagre).city("Zagreb").zipCode(10000).build();
//        PatientAddress pa12 = PatientAddress.builder().address("Petra Preradovića 9").county(karlov).city("Karlovac").zipCode(47000).build();
//        PatientAddress pa13 = PatientAddress.builder().address("Ul. Stjepana Radića 17").county(brod_pos).city("Slavonski Brod").zipCode(35000).build();
//        PatientAddress pa14 = PatientAddress.builder().address("Kralja Petra Svačića 2").county(bjelo_bilo).city("Bjelovar").zipCode(43000).build();
//        PatientAddress pa15 = PatientAddress.builder().address("Trg Stjepana Radića 6").county(vuko_sri).city("Vinkovci").zipCode(32000).build();
//        PatientAddress pa16 = PatientAddress.builder().address("Mihanovićeva ulica 14").county(grad_zagre).city("Zagreb").zipCode(10000).build();
//        PatientAddress pa17 = PatientAddress.builder().address("Dr. Ante Starčevića 29").county(sib_kni).city("Šibenik").zipCode(22100).build();
//        patientAddressRepositoryMongo.saveAll(
//                List.of(
//                        pa1, pa2, pa3, pa4, pa5, pa6, pa7, pa8, pa9, pa10, pa11, pa12, pa13, pa14, pa15, pa16, pa17
//                )
//        );
//
//        PatientOperation op1 = PatientOperation.builder().procedureName("Kraniotomija").procedureDate(LocalDate.of(2024, Month.JANUARY, 2)).build(); //opci susak
//        PatientOperation op2 = PatientOperation.builder().procedureName("Dekompresivna kraniotomija").procedureDate(LocalDate.of(2023, Month.DECEMBER, 30)).build(); // opci susak
//        PatientOperation op3 = PatientOperation.builder().procedureName("Postavljanje V-V ECMO").procedureDate(LocalDate.of(2023, Month.OCTOBER, 28)).build(); // izolacija susak
//        PatientOperation op4 = PatientOperation.builder().procedureName("Commando operacija, kirurška traheotomija").procedureDate(LocalDate.of(2023, Month.DECEMBER, 2)).build(); // jil rijeka box1
//        PatientOperation op5 = PatientOperation.builder().procedureName("Kirurška traheotomija").procedureDate(LocalDate.of(2023, Month.DECEMBER, 5)).build(); // jil rijeka box1
//        patientOperationRepositoryMongo.saveAll(
//                List.of(
//                        op1, op2, op3, op4, op5
//                )
//        );
//
//
//        PatientMkb pm1 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesI.I60_2.getCode())).build();
//        PatientMkb pm2 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesJ.J96_0.getCode())).build();
//        PatientMkb pm3 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesS.S47_0.getCode())).build();
//        PatientMkb pm4 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        PatientMkb pm5 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        PatientMkb pm6 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        PatientMkb pm7 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesC.C01.getCode())).build();
//        PatientMkb pm8 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        PatientMkb pm9 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        PatientMkb pm10 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        PatientMkb pm11 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        PatientMkb pm12 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        PatientMkb pm13 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        PatientMkb pm14 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        PatientMkb pm15 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        PatientMkb pm16 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        PatientMkb pm17 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesA.A41_9.getCode())).build();
//        patientMkbRepositoryMongo.saveAll(
//                List.of(
//                        pm1, pm2, pm3, pm4, pm5, pm6, pm7, pm8, pm9, pm10, pm11, pm12, pm13, pm14, pm15, pm16, pm17
//                )
//        );
//
//        List<PatientMkb> p1_OtherMKBs = new ArrayList<>();
//        p1_OtherMKBs.add(pm1);
//        PatientMkb p1_omkb1 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesG.G93_6.getCode())).build();
//        p1_OtherMKBs.add(p1_omkb1);
//        PatientMkb p1_omkb2 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesI.I60_2.getCode())).build();
//        p1_OtherMKBs.add(p1_omkb2);
//        PatientMkb p1_omkb3 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesI.I67_1.getCode())).build();
//        p1_OtherMKBs.add(p1_omkb3);
//        PatientMkb p1_omkb4 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesU.U07_2.getCode())).build();
//        p1_OtherMKBs.add(p1_omkb4);
//        patientMkbRepositoryMongo.saveAll(
//                List.of(
//                        p1_omkb1, p1_omkb2, p1_omkb3, p1_omkb4
//                )
//        );
//
//        List<PatientMkb> p2_OtherMKBs = new ArrayList<>();
//        p2_OtherMKBs.add(pm2);
//        PatientMkb p2_omkb1 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesI.I10_0.getCode())).build();
//        p2_OtherMKBs.add(p2_omkb1);
//        PatientMkb p2_omkb2 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesI.I49_9.getCode())).build();
//        p2_OtherMKBs.add(p2_omkb2);
//        PatientMkb p2_omkb3 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesJ.J96_0.getCode())).build();
//        p2_OtherMKBs.add(p2_omkb3);
//        PatientMkb p2_omkb4 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesJ.J18_9.getCode())).build();
//        p2_OtherMKBs.add(p2_omkb4);
//        PatientMkb p2_omkb5 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesJ.J45_9.getCode())).build();
//        p2_OtherMKBs.add(p2_omkb5);
//        PatientMkb p2_omkb6 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesN.N17.getCode())).build();
//        p2_OtherMKBs.add(p2_omkb6);
//        PatientMkb p2_omkb7 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesU.U07_2.getCode())).build();
//        p2_OtherMKBs.add(p2_omkb7);
//        patientMkbRepositoryMongo.saveAll(
//                List.of(
//                        p2_omkb1, p2_omkb2, p2_omkb3, p2_omkb4, p2_omkb5, p2_omkb6, p2_omkb7
//                )
//        );
//
//        List<PatientMkb> p3_OtherMKBs = new ArrayList<>();
//        p3_OtherMKBs.add(pm3);
//        PatientMkb p3_omkb1 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesS.S42_2.getCode())).build();
//        p3_OtherMKBs.add(p3_omkb1);
//        PatientMkb p3_omkb2 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesS.S52.getCode())).build();
//        p3_OtherMKBs.add(p3_omkb2);
//        PatientMkb p3_omkb3 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesS.S41_1.getCode())).build();
//        p3_OtherMKBs.add(p3_omkb3);
//        PatientMkb p3_omkb4 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesS.S27_3.getCode())).build();
//        p3_OtherMKBs.add(p3_omkb4);
//        PatientMkb p3_omkb5 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesS.S36_0.getCode())).build();
//        p3_OtherMKBs.add(p3_omkb5);
//        PatientMkb p3_omkb6 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesS.S37_0.getCode())).build();
//        p3_OtherMKBs.add(p3_omkb6);
//        PatientMkb p3_omkb7 = PatientMkb.builder().mkbCode(mkbService.findMkbByCode(MkbCodesY.Y34.getCode())).build();
//        p3_OtherMKBs.add(p3_omkb7);
//        patientMkbRepositoryMongo.saveAll(
//                List.of(
//                        p3_omkb1, p3_omkb2, p3_omkb3, p3_omkb4, p3_omkb5, p3_omkb6, p3_omkb7
//                )
//        );
//
//
//        Patient p1 = Patient.builder().firstName("Petra").lastName("Perić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1945, Month.MARCH, 26)).sex(female).leadingMkb(pm1).patientMkbs(p1_OtherMKBs).admissionDateTime(LocalDateTime.of(2024, Month.JANUARY, 2, 5, 30)).patientAddress(pa1).leadingDoctor(doc1).build();
//        Patient p2 = Patient.builder().firstName("Darko").lastName("Darić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1945, Month.MARCH, 21)).sex(male).leadingMkb(pm2).patientMkbs(p2_OtherMKBs).admissionDateTime(LocalDateTime.of(2023, Month.DECEMBER, 31, 16, 45)).patientAddress(pa2).leadingDoctor(doc2).build();
//        Patient p3 = Patient.builder().firstName("Frko").lastName("Frkić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1957, Month.APRIL, 7)).sex(male).leadingMkb(pm3).patientMkbs(p3_OtherMKBs).operations(List.of(op1)).admissionDateTime(LocalDateTime.of(2023, Month.SEPTEMBER, 29, 11, 0)).patientAddress(pa3).leadingDoctor(doc3).build();
//        Patient p4 = Patient.builder().firstName("Borko").lastName("Borić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1992, Month.OCTOBER, 15)).sex(male).leadingMkb(pm4).patientMkbs(List.of(pm4)).operations(List.of(op2)).admissionDateTime(LocalDateTime.of(2023, Month.OCTOBER, 12, 13, 20)).patientAddress(pa4).leadingDoctor(doc1).build();
//        Patient p5 = Patient.builder().firstName("David").lastName("Davidić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1993, Month.APRIL, 18)).sex(male).leadingMkb(pm5).patientMkbs(List.of(pm5)).operations(List.of(op3)).admissionDateTime(LocalDateTime.of(2023, Month.NOVEMBER, 7, 9, 45)).patientAddress(pa5).leadingDoctor(doc2).build();
//        Patient p6 = Patient.builder().firstName("Iva").lastName("Ivić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1943, Month.OCTOBER, 8)).sex(female).leadingMkb(pm6).patientMkbs(List.of(pm6)).admissionDateTime(LocalDateTime.of(2023, Month.SEPTEMBER, 7, 16, 0)).patientAddress(pa6).leadingDoctor(doc3).build();
//        Patient p7 = Patient.builder().firstName("Matija").lastName("Mirkić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1956, Month.MAY, 8)).sex(male).leadingMkb(pm7).patientMkbs(List.of(pm7)).operations(List.of(op4)).admissionDateTime(LocalDateTime.of(2023, Month.OCTOBER, 24, 10, 10)).patientAddress(pa7).leadingDoctor(doc1).build();
//        Patient p8 = Patient.builder().firstName("Mirko").lastName("Matijić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1969, Month.JULY, 30)).sex(male).leadingMkb(pm8).patientMkbs(List.of(pm8)).operations(List.of(op5)).admissionDateTime(LocalDateTime.of(2023, Month.SEPTEMBER, 13, 14, 30)).patientAddress(pa8).leadingDoctor(doc1).build();
//        Patient p9 = Patient.builder().firstName("Perica").lastName("Mirkić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1975, Month.OCTOBER, 8)).sex(male).leadingMkb(pm9).patientMkbs(List.of(pm9)).admissionDateTime(LocalDateTime.of(2023, Month.NOVEMBER, 1, 11, 55)).patientAddress(pa9).leadingDoctor(doc2).build();
//        Patient p10 = Patient.builder().firstName("Mirko").lastName("Nikolić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1979, Month.JUNE, 29)).sex(male).leadingMkb(pm10).patientMkbs(List.of(pm10)).admissionDateTime(LocalDateTime.of(2023, Month.OCTOBER, 8, 12, 40)).patientAddress(pa10).leadingDoctor(doc3).build();
//        Patient p11 = Patient.builder().firstName("Nikola").lastName("Stafić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1968, Month.MAY, 3)).sex(male).leadingMkb(pm11).patientMkbs(List.of(pm11)).admissionDateTime(LocalDateTime.of(2023, Month.SEPTEMBER, 25, 9, 0)).patientAddress(pa11).leadingDoctor(doc3).build();
//        Patient p12 = Patient.builder().firstName("Java").lastName("Javić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1968, Month.MARCH, 6)).sex(female).leadingMkb(pm12).patientMkbs(List.of(pm12)).admissionDateTime(LocalDateTime.of(2023, Month.NOVEMBER, 12, 15, 25)).patientAddress(pa12).leadingDoctor(doc2).build();
//        Patient p13 = Patient.builder().firstName("Desna").lastName("Lijeva").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1986, Month.NOVEMBER, 19)).sex(female).leadingMkb(pm13).patientMkbs(List.of(pm13)).admissionDateTime(LocalDateTime.of(2023, Month.OCTOBER, 19, 11, 15)).patientAddress(pa13).leadingDoctor(doc2).build();
//        Patient p14 = Patient.builder().firstName("Gornja").lastName("Donja").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1995, Month.FEBRUARY, 8)).sex(female).leadingMkb(pm14).patientMkbs(List.of(pm14)).admissionDateTime(LocalDateTime.of(2023, Month.SEPTEMBER, 2, 8, 50)).patientAddress(pa14).leadingDoctor(doc2).build();
//        Patient p15 = Patient.builder().firstName("Ukras").lastName("Bornić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(1997, Month.DECEMBER, 7)).sex(male).leadingMkb(pm15).patientMkbs(List.of(pm15)).admissionDateTime(LocalDateTime.of(2023, Month.NOVEMBER, 6, 9, 30)).patientAddress(pa15).leadingDoctor(doc2).build();
//        Patient p16 = Patient.builder().firstName("Borna").lastName("Ukrasnić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(2001, Month.NOVEMBER, 18)).sex(male).leadingMkb(pm16).patientMkbs(List.of(pm16)).admissionDateTime(LocalDateTime.of(2023, Month.SEPTEMBER, 21, 13, 50)).patientAddress(pa16).leadingDoctor(doc1).build();
//        Patient p17 = Patient.builder().firstName("Zvjezdica").lastName("Zvikić").identificationNumber(randomNumberService.generateRandomBigInteger(true, 5)).dob(LocalDate.of(2002, Month.DECEMBER, 8)).sex(female).leadingMkb(pm17).patientMkbs(List.of(pm17)).admissionDateTime(LocalDateTime.of(2023, Month.OCTOBER, 28, 12, 15)).patientAddress(pa17).leadingDoctor(doc3).build();
//        patientRepositoryMongo.saveAll(
//                List.of(
//                        p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17
//                )
//        );
//
//        pa1.setPatients(List.of(p1));
//        pa2.setPatients(List.of(p2));
//        pa3.setPatients(List.of(p3));
//        pa4.setPatients(List.of(p4));
//        pa5.setPatients(List.of(p5));
//        pa6.setPatients(List.of(p6));
//        pa7.setPatients(List.of(p7));
//        pa8.setPatients(List.of(p8));
//        pa9.setPatients(List.of(p9));
//        pa10.setPatients(List.of(p10));
//        pa11.setPatients(List.of(p11));
//        pa12.setPatients(List.of(p12));
//        pa13.setPatients(List.of(p13));
//        pa14.setPatients(List.of(p14));
//        pa15.setPatients(List.of(p15));
//        pa16.setPatients(List.of(p16));
//        pa17.setPatients(List.of(p17));
//        patientAddressRepositoryMongo.saveAll(
//                List.of(
//                        pa1, pa2, pa3, pa4, pa5, pa6, pa7, pa8, pa9, pa10, pa11, pa12, pa13, pa14, pa15, pa16, pa17
//                )
//        );
//
//        op1.setPatient(p3);
//        op2.setPatient(p4);
//        op3.setPatient(p5);
//        op4.setPatient(p7);
//        op5.setPatient(p8);
//        patientOperationRepositoryMongo.saveAll(
//                List.of(
//                        op1, op2, op3, op4, op5
//                )
//        );
//
//        pm1.setPatient(p1);
//        pm2.setPatient(p2);
//        pm3.setPatient(p3);
//        pm4.setPatient(p4);
//        pm5.setPatient(p5);
//        pm6.setPatient(p6);
//        pm7.setPatient(p7);
//        pm8.setPatient(p8);
//        pm9.setPatient(p9);
//        pm10.setPatient(p10);
//        pm11.setPatient(p11);
//        pm12.setPatient(p12);
//        pm13.setPatient(p13);
//        pm14.setPatient(p14);
//        pm15.setPatient(p15);
//        pm16.setPatient(p16);
//        pm17.setPatient(p17);
//        patientMkbRepositoryMongo.saveAll(
//                List.of(
//                        pm1, pm2, pm3, pm4, pm5, pm6, pm7, pm8, pm9, pm10, pm11, pm12, pm13, pm14, pm15, pm16, pm17
//                )
//        );
//
//        p1_omkb1.setPatient(p1);
//        p1_omkb2.setPatient(p1);
//        p1_omkb3.setPatient(p1);
//        p1_omkb4.setPatient(p1);
//        patientMkbRepositoryMongo.saveAll(
//                List.of(
//                        p1_omkb1, p1_omkb2, p1_omkb3, p1_omkb4
//                )
//        );
//
//        p2_omkb1.setPatient(p2);
//        p2_omkb2.setPatient(p2);
//        p2_omkb3.setPatient(p2);
//        p2_omkb4.setPatient(p2);
//        p2_omkb5.setPatient(p2);
//        p2_omkb6.setPatient(p2);
//        p2_omkb7.setPatient(p2);
//        patientMkbRepositoryMongo.saveAll(
//                List.of(
//                        p2_omkb1, p2_omkb2, p2_omkb3, p2_omkb4, p2_omkb5, p2_omkb6, p2_omkb7
//                )
//        );
//
//        p3_omkb1.setPatient(p3);
//        p3_omkb2.setPatient(p3);
//        p3_omkb3.setPatient(p3);
//        p3_omkb4.setPatient(p3);
//        p3_omkb5.setPatient(p3);
//        p3_omkb6.setPatient(p3);
//        p3_omkb7.setPatient(p3);
//        patientMkbRepositoryMongo.saveAll(
//                List.of(
//                        p3_omkb1, p3_omkb2, p3_omkb3, p3_omkb4, p3_omkb5, p3_omkb6, p3_omkb7
//                )
//        );
//
//
//        Bed b1 = Bed.builder().patient(p1).build();
//        Bed b2 = Bed.builder().patient(p2).build();
//        Bed b3 = Bed.builder().build();
//        Bed b4 = Bed.builder().build();
//        Bed b5 = Bed.builder().patient(p3).build();
//        Bed b6 = Bed.builder().patient(p4).build();
//        Bed b7 = Bed.builder().build();
//        Bed b8 = Bed.builder().build();
//        Bed b9 = Bed.builder().patient(p5).build();
//        Bed b10 = Bed.builder().build();
//        Bed b11 = Bed.builder().patient(p6).build();
//        Bed b12 = Bed.builder().patient(p7).build();
//        Bed b13 = Bed.builder().build();
//        Bed b14 = Bed.builder().patient(p8).build();
//        Bed b15 = Bed.builder().patient(p9).build();
//        Bed b16 = Bed.builder().patient(p10).build();
//        Bed b17 = Bed.builder().patient(p11).build();
//        Bed b18 = Bed.builder().patient(p12).build();
//        Bed b19 = Bed.builder().patient(p13).build();
//        Bed b20 = Bed.builder().patient(p14).build();
//        Bed b21 = Bed.builder().patient(p15).build();
//        Bed b22 = Bed.builder().patient(p16).build();
//        Bed b23 = Bed.builder().build();
//        Bed b24 = Bed.builder().build();
//        Bed b25 = Bed.builder().build();
//        Bed b26 = Bed.builder().build();
//        Bed b27 = Bed.builder().build();
//        Bed b28 = Bed.builder().patient(p17).build();
//        Bed b29 = Bed.builder().build();
//        Bed b30 = Bed.builder().build();
//        bedRepositoryMongo.saveAll(
//                List.of(
//                        b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30
//                )
//        );
//
//        // jil susak beds
//        List<Bed> bedsForOpciBoxSus = new ArrayList<>();
//        bedsForOpciBoxSus.add(b1);
//        bedsForOpciBoxSus.add(b2);
//        bedsForOpciBoxSus.add(b3);
//        bedsForOpciBoxSus.add(b4);
//        bedsForOpciBoxSus.add(b5);
//        bedsForOpciBoxSus.add(b6);
//        bedsForOpciBoxSus.add(b7);
//        bedsForOpciBoxSus.add(b8);
//
//        List<Bed> bedsForIzolacijaSus = new ArrayList<>();
//        bedsForIzolacijaSus.add(b9);
//        bedsForIzolacijaSus.add(b10);
//
//        List<Bed> bedsForSepticniSus = new ArrayList<>();
//        bedsForSepticniSus.add(b11);
//
//        //jil rijeka beds
//        List<Bed> box1beds = new ArrayList<>();
//        box1beds.add(b12);
//        box1beds.add(b13);
//        box1beds.add(b14);
//        box1beds.add(b15);
//        List<Bed> box2beds = new ArrayList<>();
//        box2beds.add(b16);
//        box2beds.add(b17);
//        box2beds.add(b18);
//        box2beds.add(b19);
//        List<Bed> izolacija1beds = new ArrayList<>();
//        izolacija1beds.add(b20);
//        List<Bed> septicni1beds = new ArrayList<>();
//        septicni1beds.add(b21);
//
//        //crc beds
//        List<Bed> box1beds2 = new ArrayList<>();
//        box1beds2.add(b22);
//        box1beds2.add(b23);
//        box1beds2.add(b24);
//        box1beds2.add(b25);
//        List<Bed> izo2 = new ArrayList<>();
//        izo2.add(b26);
//        List<Bed> sept2 = new ArrayList<>();
//        sept2.add(b27);
//
//        //kardio jil beds
//        List<Bed> justBox = new ArrayList<>();
//        justBox.add(b28);
//        justBox.add(b29);
//        justBox.add(b30);
//
//        // jil rijeka
//        Box box1 = Box.builder().name("Box 1").bedList(box1beds).build();
//        Box box2 = Box.builder().name("Box 2").bedList(box2beds).build();
//        Box box3 = Box.builder().name("Izolacija").bedList(izolacija1beds).build();
//        Box box4 = Box.builder().name("Septični").bedList(septicni1beds).build();
//
//        //crc
//        Box box5 = Box.builder().name("Box 1").bedList(box1beds2).build();
//        Box box6 = Box.builder().name("Izolacija").bedList(izo2).build();
//        Box box7 = Box.builder().name("Septični").bedList(sept2).build();
//
//        // jil susak
//        Box box8 = Box.builder().name("Opći box").bedList(bedsForOpciBoxSus).build();
//        Box box9 = Box.builder().name("Izolacija").bedList(bedsForIzolacijaSus).build();
//        Box box10 = Box.builder().name("Septični").bedList(bedsForSepticniSus).build();
//
//        //kardio jil
//        Box box11 = Box.builder().name("Box").bedList(justBox).build();
//        boxRepositoryMongo.saveAll(
//                List.of(
//                        box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11
//                )
//        );
//
//        List<Box> jilRijekaBoxes = new ArrayList<>();
//        jilRijekaBoxes.add(box1);
//        jilRijekaBoxes.add(box2);
//        jilRijekaBoxes.add(box3);
//        jilRijekaBoxes.add(box4);
//
//        List<Box> crcBoxes = new ArrayList<>();
//        crcBoxes.add(box5);
//        crcBoxes.add(box6);
//        crcBoxes.add(box7);
//
//        List<Box> jilSusakBoxes = new ArrayList<>();
//        jilSusakBoxes.add(box8);
//        jilSusakBoxes.add(box9);
//        jilSusakBoxes.add(box10);
//
//        List<Box> kardioJilBoxes = new ArrayList<>();
//        kardioJilBoxes.add(box11);
//
//        Department dep1 = Department.builder().name("Jedinica intenzivnog liječenja Rijeka").boxes(jilRijekaBoxes).shorthand("JIL Rijeka").locality(loc2).build();
//        Department dep2 = Department.builder().name("COVID respiratorni centar").boxes(crcBoxes).shorthand("CRC").locality(loc2).build();
//        Department dep3 = Department.builder().name("Jedinica intenzivnog liječenja Sušak").boxes(jilSusakBoxes).shorthand("JIL Sušak").locality(loc1).build();
//        Department dep4 = Department.builder().name("Jedinica intenzivnog liječenja kardiokirurških bolesnika").boxes(kardioJilBoxes).shorthand("Kardio JIL").locality(loc1).build();
//        departmentRepositoryMongo.saveAll(
//                List.of(
//                        dep1, dep2, dep3, dep4
//                )
//        );
//
//        doc1.setDepartment(dep1);
//        doc2.setDepartment(dep2);
//        doc3.setDepartment(dep3);
//        doctorRepositoryMongo.saveAll(
//                List.of(
//                        doc1, doc2, doc3
//                )
//        );
//
//
//        List<FunctionalDiagnosis> fds = new ArrayList<>();
//        for (FunctionalDiagnosesEnum fd : FunctionalDiagnosesEnum.values()) {
//            fds.add(FunctionalDiagnosis.builder().description(fd.toString()).build());
//        }
//        functionalDiagnosisRepositoryMongo.saveAll(fds);
//
//
//        List<PatientFunctionalDiagnosis> pfd1 = new ArrayList<>();
//        pfd1.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).build());
//        pfd1.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).build());
//        pfd1.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd1.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).build());
//        pfd1.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).selected(true).build());
//        pfd1.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).build());
//        pfd1.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).selected(true).build());
//
//        List<PatientFunctionalDiagnosis> pfd2 = new ArrayList<>();
//        pfd2.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).selected(true).build());
//        pfd2.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).build());
//        pfd2.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd2.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).build());
//        pfd2.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd2.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).build());
//        pfd2.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).build());
//
//        List<PatientFunctionalDiagnosis> pfd3 = new ArrayList<>();
//        pfd3.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).build());
//        pfd3.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).build());
//        pfd3.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd3.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).build());
//        pfd3.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd3.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).selected(true).build());
//        pfd3.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).build());
//
//        List<PatientFunctionalDiagnosis> pfd4 = new ArrayList<>();
//        pfd4.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).build());
//        pfd4.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).build());
//        pfd4.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd4.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).build());
//        pfd4.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd4.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).selected(true).build());
//        pfd4.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).selected(true).build());
//
//        List<PatientFunctionalDiagnosis> pfd5 = new ArrayList<>();
//        pfd5.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).build());
//        pfd5.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).build());
//        pfd5.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd5.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).selected(true).build());
//        pfd5.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd5.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).selected(true).build());
//        pfd5.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).selected(true).build());
//
//        List<PatientFunctionalDiagnosis> pfd6 = new ArrayList<>();
//        pfd6.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).build());
//        pfd6.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).build());
//        pfd6.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd6.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).selected(true).build());
//        pfd6.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd6.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).selected(true).build());
//        pfd6.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).selected(true).build());
//
//        List<PatientFunctionalDiagnosis> pfd7 = new ArrayList<>();
//        pfd7.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).build());
//        pfd7.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).build());
//        pfd7.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd7.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).build());
//        pfd7.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd7.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).selected(true).build());
//        pfd7.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).selected(true).build());
//
//        List<PatientFunctionalDiagnosis> pfd8 = new ArrayList<>();
//        pfd8.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).selected(true).build());
//        pfd8.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).build());
//        pfd8.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).selected(true).build());
//        pfd8.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).selected(true).build());
//        pfd8.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd8.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).selected(true).build());
//        pfd8.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).selected(true).build());
//
//        List<PatientFunctionalDiagnosis> pfd9 = new ArrayList<>();
//        pfd9.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).build());
//        pfd9.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).build());
//        pfd9.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd9.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).selected(true).build());
//        pfd9.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd9.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).build());
//        pfd9.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).build());
//
//        List<PatientFunctionalDiagnosis> pfd10 = new ArrayList<>();
//        pfd10.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).build());
//        pfd10.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).build());
//        pfd10.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd10.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).selected(true).build());
//        pfd10.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd10.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).build());
//        pfd10.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).build());
//
//        List<PatientFunctionalDiagnosis> pfd11 = new ArrayList<>();
//        pfd11.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).build());
//        pfd11.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).selected(true).build());
//        pfd11.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd11.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).selected(true).build());
//        pfd11.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd11.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).selected(true).build());
//        pfd11.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).selected(true).build());
//
//        List<PatientFunctionalDiagnosis> pfd12 = new ArrayList<>();
//        pfd12.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).build());
//        pfd12.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).selected(true).build());
//        pfd12.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd12.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).selected(true).build());
//        pfd12.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd12.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).selected(true).build());
//        pfd12.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).selected(true).build());
//
//        List<PatientFunctionalDiagnosis> pfd13 = new ArrayList<>();
//        pfd13.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).selected(true).build());
//        pfd13.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).build());
//        pfd13.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).selected(true).build());
//        pfd13.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).selected(true).build());
//        pfd13.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd13.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).selected(true).build());
//        pfd13.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).selected(true).build());
//
//        List<PatientFunctionalDiagnosis> pfd14 = new ArrayList<>();
//        pfd14.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).build());
//        pfd14.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).build());
//        pfd14.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd14.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).selected(true).build());
//        pfd14.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd14.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).build());
//        pfd14.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).build());
//
//        List<PatientFunctionalDiagnosis> pfd15 = new ArrayList<>();
//        pfd15.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).build());
//        pfd15.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).selected(true).build());
//        pfd15.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd15.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).selected(true).build());
//        pfd15.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd15.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).selected(true).build());
//        pfd15.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).selected(true).build());
//
//        List<PatientFunctionalDiagnosis> pfd16 = new ArrayList<>();
//        pfd16.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).selected(true).build());
//        pfd16.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).build());
//        pfd16.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).selected(true).build());
//        pfd16.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).selected(true).build());
//        pfd16.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd16.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).selected(true).build());
//        pfd16.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).selected(true).build());
//
//        List<PatientFunctionalDiagnosis> pfd17 = new ArrayList<>();
//        pfd17.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_1.getDescription()).build());
//        pfd17.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_2.getDescription()).selected(true).build());
//        pfd17.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_3.getDescription()).build());
//        pfd17.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_4.getDescription()).selected(true).build());
//        pfd17.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_5.getDescription()).build());
//        pfd17.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_6.getDescription()).selected(true).build());
//        pfd17.add(PatientFunctionalDiagnosis.builder().name(FunctionalDiagnosesEnum.FD_7.getDescription()).selected(true).build());
//
//        Rass r1 = Rass.builder().score(RassEnum.R_POS_4.getScore()).term(RassEnum.R_POS_4.getTerm()).scoreDescription(RassEnum.R_POS_4.getScoreDescription()).build();
//        Rass r2 = Rass.builder().score(RassEnum.R_POS_3.getScore()).term(RassEnum.R_POS_3.getTerm()).scoreDescription(RassEnum.R_POS_3.getScoreDescription()).build();
//        Rass r3 = Rass.builder().score(RassEnum.R_POS_2.getScore()).term(RassEnum.R_POS_2.getTerm()).scoreDescription(RassEnum.R_POS_2.getScoreDescription()).build();
//        Rass r4 = Rass.builder().score(RassEnum.R_POS_1.getScore()).term(RassEnum.R_POS_1.getTerm()).scoreDescription(RassEnum.R_POS_1.getScoreDescription()).build();
//        Rass r5 = Rass.builder().score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).build();
//        Rass r6 = Rass.builder().score(RassEnum.R_NEG_1.getScore()).term(RassEnum.R_NEG_1.getTerm()).scoreDescription(RassEnum.R_NEG_1.getScoreDescription()).build();
//        Rass r7 = Rass.builder().score(RassEnum.R_NEG_2.getScore()).term(RassEnum.R_NEG_2.getTerm()).scoreDescription(RassEnum.R_NEG_2.getScoreDescription()).build();
//        Rass r8 = Rass.builder().score(RassEnum.R_NEG_3.getScore()).term(RassEnum.R_NEG_3.getTerm()).scoreDescription(RassEnum.R_NEG_3.getScoreDescription()).build();
//        Rass r9 = Rass.builder().score(RassEnum.R_NEG_4.getScore()).term(RassEnum.R_NEG_4.getTerm()).scoreDescription(RassEnum.R_NEG_4.getScoreDescription()).build();
//        Rass r10 = Rass.builder().score(RassEnum.R_NEG_5.getScore()).term(RassEnum.R_NEG_5.getTerm()).scoreDescription(RassEnum.R_NEG_5.getScoreDescription()).build();
//        rassRepositoryMongo.saveAll(
//                List.of(
//                        r1, r2, r3, r4, r5, r6, r7, r8, r9, r10
//                )
//        );
//
//        PatientRass pr1 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R_NEG_5.getScore()).term(RassEnum.R_NEG_5.getTerm()).scoreDescription(RassEnum.R_NEG_5.getScoreDescription()).additionalDescription("Lošeg općeg stanja \n IMV(FiO2 50% peep 12 SpO2 97% \n Bez kontakta RASS -5").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr2 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("U kontaktu").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr3 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R_NEG_5.getScore()).term(RassEnum.R_NEG_5.getTerm()).scoreDescription(RassEnum.R_NEG_5.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr4 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr5 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr6 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr7 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr8 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr9 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr10 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr11 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr12 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr13 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr14 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr15 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr16 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//        PatientRass pr17 = PatientRass.patientRassBuilder().id(String.valueOf(randomNumberService.generateRandomBigInteger(false, 12))).score(RassEnum.R0.getScore()).term(RassEnum.R0.getTerm()).scoreDescription(RassEnum.R0.getScoreDescription()).additionalDescription("/").rassDateTime(LocalDateTime.now()).build();
//
//        Assessment a1 = Assessment.builder().patientRass(List.of(pr1)).notes("/").build();
//        Assessment a2 = Assessment.builder().patientRass(List.of(pr2)).notes("/").build();
//        Assessment a3 = Assessment.builder().patientRass(List.of(pr3)).notes("/").build();
//        Assessment a4 = Assessment.builder().patientRass(List.of(pr4)).notes("/").build();
//        Assessment a5 = Assessment.builder().patientRass(List.of(pr5)).notes("/").build();
//        Assessment a6 = Assessment.builder().patientRass(List.of(pr6)).notes("/").build();
//        Assessment a7 = Assessment.builder().patientRass(List.of(pr7)).notes("/").build();
//        Assessment a8 = Assessment.builder().patientRass(List.of(pr8)).notes("/").build();
//        Assessment a9 = Assessment.builder().patientRass(List.of(pr9)).notes("/").build();
//        Assessment a10 = Assessment.builder().patientRass(List.of(pr10)).notes("/").build();
//        Assessment a11 = Assessment.builder().patientRass(List.of(pr11)).notes("/").build();
//        Assessment a12 = Assessment.builder().patientRass(List.of(pr12)).notes("/").build();
//        Assessment a13 = Assessment.builder().patientRass(List.of(pr13)).notes("/").build();
//        Assessment a14 = Assessment.builder().patientRass(List.of(pr14)).notes("/").build();
//        Assessment a15 = Assessment.builder().patientRass(List.of(pr15)).notes("/").build();
//        Assessment a16 = Assessment.builder().patientRass(List.of(pr16)).notes("/").build();
//        Assessment a17 = Assessment.builder().patientRass(List.of(pr17)).notes("/").build();
//        assessmentRepositoryMongo.saveAll(
//                List.of(
//                        a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17
//                )
//        );
//
//
//        Goal g1 = Goal.builder().type(GoalsEnum.G_INTUBIRANI.getType()).description(GoalsEnum.G_INTUBIRANI.getDescription()).build();
//        Goal g2 = Goal.builder().type(GoalsEnum.G_EKSTUBIRANI.getType()).description(GoalsEnum.G_EKSTUBIRANI.getDescription()).build();
//        goalRepositoryMongo.saveAll(
//                List.of(
//                        g1, g2
//                )
//        );
//
//        PatientGoal pg11 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).selected(true).build();
//        PatientGoal pg12 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).build();
//        List<PatientGoal> pgl1 = new ArrayList<>(List.of(pg11, pg12));
//
//        PatientGoal pg21 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).build();
//        PatientGoal pg22 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).selected(true).build();
//        List<PatientGoal> pgl2 = new ArrayList<>(List.of(pg21, pg22));
//
//        PatientGoal pg31 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).build();
//        PatientGoal pg32 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).selected(true).build();
//        List<PatientGoal> pgl3 = new ArrayList<>(List.of(pg31, pg32));
//
//        PatientGoal pg41 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).build();
//        PatientGoal pg42 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).selected(true).build();
//        List<PatientGoal> pgl4 = new ArrayList<>(List.of(pg41, pg42));
//
//        PatientGoal pg51 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).build();
//        PatientGoal pg52 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).selected(true).build();
//        List<PatientGoal> pgl5 = new ArrayList<>(List.of(pg51, pg52));
//
//        PatientGoal pg61 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).build();
//        PatientGoal pg62 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).selected(true).build();
//        List<PatientGoal> pgl6 = new ArrayList<>(List.of(pg61, pg62));
//
//        PatientGoal pg71 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).build();
//        PatientGoal pg72 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).selected(true).build();
//        List<PatientGoal> pgl7 = new ArrayList<>(List.of(pg71, pg72));
//
//        PatientGoal pg81 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).selected(true).build();
//        PatientGoal pg82 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).build();
//        List<PatientGoal> pgl8 = new ArrayList<>(List.of(pg81, pg82));
//
//        PatientGoal pg91 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).selected(true).build();
//        PatientGoal pg92 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).build();
//        List<PatientGoal> pgl9 = new ArrayList<>(List.of(pg91, pg92));
//
//        PatientGoal pg101 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).selected(true).build();
//        PatientGoal pg102 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).build();
//        List<PatientGoal> pgl10 = new ArrayList<>(List.of(pg101, pg102));
//
//        PatientGoal pg111 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).build();
//        PatientGoal pg112 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).selected(true).build();
//        List<PatientGoal> pgl11 = new ArrayList<>(List.of(pg111, pg112));
//
//        PatientGoal pg121 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).build();
//        PatientGoal pg122 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).selected(true).build();
//        List<PatientGoal> pgl12 = new ArrayList<>(List.of(pg121, pg122));
//
//        PatientGoal pg131 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).build();
//        PatientGoal pg132 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).selected(true).build();
//        List<PatientGoal> pgl13 = new ArrayList<>(List.of(pg131, pg132));
//
//        PatientGoal pg141 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).build();
//        PatientGoal pg142 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).selected(true).build();
//        List<PatientGoal> pgl14 = new ArrayList<>(List.of(pg141, pg142));
//
//        PatientGoal pg151 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).build();
//        PatientGoal pg152 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).selected(true).build();
//        List<PatientGoal> pgl15 = new ArrayList<>(List.of(pg151, pg152));
//
//        PatientGoal pg161 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).selected(true).build();
//        PatientGoal pg162 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).build();
//        List<PatientGoal> pgl16 = new ArrayList<>(List.of(pg161, pg162));
//
//        PatientGoal pg171 = PatientGoal.patientGoalBuilder().type(g1.getType()).description(g1.getDescription()).selected(true).build();
//        PatientGoal pg172 = PatientGoal.patientGoalBuilder().type(g2.getType()).description(g2.getDescription()).build();
//        List<PatientGoal> pgl17 = new ArrayList<>(List.of(pg171, pg172));
//
//        Plan pl1 = Plan.builder().type(PlansEnum.P_INTUBIRANI.getType()).description(PlansEnum.P_INTUBIRANI.getDescription()).build();
//        Plan pl2 = Plan.builder().type(PlansEnum.P_EKSTUBIRANI.getType()).description(PlansEnum.P_EKSTUBIRANI.getDescription()).build();
//        planRepositoryMongo.saveAll(
//                List.of(
//                        pl1, pl2
//                )
//        );
//
//        PatientPlan pp11 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).selected(true).build();
//        PatientPlan pp12 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).build();
//        List<PatientPlan> ppl1 = new ArrayList<>(List.of(pp11, pp12));
//
//        PatientPlan pp21 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).build();
//        PatientPlan pp22 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).selected(true).build();
//        List<PatientPlan> ppl2 = new ArrayList<>(List.of(pp21, pp22));
//
//        PatientPlan pp31 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).build();
//        PatientPlan pp32 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).selected(true).build();
//        List<PatientPlan> ppl3 = new ArrayList<>(List.of(pp31, pp32));
//
//        PatientPlan pp41 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).selected(true).build();
//        PatientPlan pp42 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).build();
//        List<PatientPlan> ppl4 = new ArrayList<>(List.of(pp41, pp42));
//
//        PatientPlan pp51 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).selected(true).build();
//        PatientPlan pp52 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).build();
//        List<PatientPlan> ppl5 = new ArrayList<>(List.of(pp51, pp52));
//
//        PatientPlan pp61 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).build();
//        PatientPlan pp62 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).selected(true).build();
//        List<PatientPlan> ppl6 = new ArrayList<>(List.of(pp61, pp62));
//
//        PatientPlan pp71 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).build();
//        PatientPlan pp72 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).selected(true).build();
//        List<PatientPlan> ppl7 = new ArrayList<>(List.of(pp71, pp72));
//
//        PatientPlan pp81 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).build();
//        PatientPlan pp82 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).selected(true).build();
//        List<PatientPlan> ppl8 = new ArrayList<>(List.of(pp81, pp82));
//
//        PatientPlan pp91 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).build();
//        PatientPlan pp92 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).selected(true).build();
//        List<PatientPlan> ppl9 = new ArrayList<>(List.of(pp91, pp92));
//
//        PatientPlan pp101 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).build();
//        PatientPlan pp102 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).selected(true).build();
//        List<PatientPlan> ppl10 = new ArrayList<>(List.of(pp101, pp102));
//
//        PatientPlan pp111 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).selected(true).build();
//        PatientPlan pp112 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).build();
//        List<PatientPlan> ppl11 = new ArrayList<>(List.of(pp111, pp112));
//
//        PatientPlan pp121 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).selected(true).build();
//        PatientPlan pp122 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).build();
//        List<PatientPlan> ppl12 = new ArrayList<>(List.of(pp121, pp122));
//
//        PatientPlan pp131 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).selected(true).build();
//        PatientPlan pp132 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).build();
//        List<PatientPlan> ppl13 = new ArrayList<>(List.of(pp131, pp132));
//
//        PatientPlan pp141 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).selected(true).build();
//        PatientPlan pp142 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).build();
//        List<PatientPlan> ppl14 = new ArrayList<>(List.of(pp141, pp142));
//
//        PatientPlan pp151 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).build();
//        PatientPlan pp152 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).selected(true).build();
//        List<PatientPlan> ppl15 = new ArrayList<>(List.of(pp151, pp152));
//
//        PatientPlan pp161 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).build();
//        PatientPlan pp162 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).selected(true).build();
//        List<PatientPlan> ppl16 = new ArrayList<>(List.of(pp161, pp162));
//
//        PatientPlan pp171 = PatientPlan.patientPlanBuilder().type(pl1.getType()).description(pl1.getDescription()).build();
//        PatientPlan pp172 = PatientPlan.patientPlanBuilder().type(pl2.getType()).description(pl2.getDescription()).selected(true).build();
//        List<PatientPlan> ppl17 = new ArrayList<>(List.of(pp171, pp172));
//
//        List<Procedure> procList = new ArrayList<>();
//        for (ProceduresEnum proc : ProceduresEnum.values()) {
//            procList.add(Procedure.builder().description(proc.getDescription()).build());
//        }
//        procedureRepositoryMongo.saveAll(procList);
//
//
//        List<PatientProcedure> ppd1 = new ArrayList<>();
//        BigInteger randp1 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd1.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp1)).date(LocalDateTime.of(2024, Month.JANUARY, 3, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//        ppd1.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp1.add(BigInteger.ONE))).date(LocalDateTime.of(2024, Month.JANUARY, 3, 0, 0)).description(ProceduresEnum.P_10.getDescription()).workingTherapists("Mikolić").build());
//        ppd1.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp1.add(BigInteger.TWO))).date(LocalDateTime.of(2024, Month.JANUARY, 3, 0, 0)).description(ProceduresEnum.P_8.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd2 = new ArrayList<>();
//        BigInteger randp2 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd2.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp2)).date(LocalDateTime.of(2024, Month.JANUARY, 3, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//        ppd2.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp2.add(BigInteger.ONE))).date(LocalDateTime.of(2024, Month.JANUARY, 3, 0, 0)).description(ProceduresEnum.P_2.getDescription()).workingTherapists("Mikolić").build());
//        ppd2.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp2.add(BigInteger.TWO))).date(LocalDateTime.of(2024, Month.JANUARY, 3, 0, 0)).description(ProceduresEnum.P_3.getDescription()).workingTherapists("Mikolić").build());
//        ppd2.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp2.add(BigInteger.valueOf(3)))).date(LocalDateTime.of(2024, Month.JANUARY, 3, 0, 0)).description(ProceduresEnum.P_6.getDescription()).workingTherapists("Mikolić").build());
//        ppd2.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp2.add(BigInteger.valueOf(4)))).date(LocalDateTime.of(2024, Month.JANUARY, 3, 0, 0)).description(ProceduresEnum.P_10.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd3 = new ArrayList<>();
//        BigInteger randp3 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd3.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp3)).date(LocalDateTime.of(2023, Month.DECEMBER, 17, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//        ppd3.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp2.add(BigInteger.ONE))).date(LocalDateTime.of(2023, Month.DECEMBER, 17, 0, 0)).description(ProceduresEnum.P_10.getDescription()).workingTherapists("Mikolić").build());
//        ppd3.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp2.add(BigInteger.TWO))).date(LocalDateTime.of(2023, Month.DECEMBER, 17, 0, 0)).description(ProceduresEnum.P_22.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd4 = new ArrayList<>();
//        BigInteger randp4 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd4.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp4)).date(LocalDateTime.of(2023, Month.DECEMBER, 18, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd5 = new ArrayList<>();
//        BigInteger randp5 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd5.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp5)).date(LocalDateTime.of(2023, Month.DECEMBER, 19, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd6 = new ArrayList<>();
//        BigInteger randp6 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd6.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp6)).date(LocalDateTime.of(2023, Month.DECEMBER, 20, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd7 = new ArrayList<>();
//        BigInteger randp7 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd7.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp7)).date(LocalDateTime.of(2023, Month.DECEMBER, 21, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd8 = new ArrayList<>();
//        BigInteger randp8 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd8.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp8)).date(LocalDateTime.of(2023, Month.DECEMBER, 22, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd9 = new ArrayList<>();
//        BigInteger randp9 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd9.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp9)).date(LocalDateTime.of(2023, Month.DECEMBER, 23, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd10 = new ArrayList<>();
//        BigInteger randp10 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd10.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp10)).date(LocalDateTime.of(2023, Month.DECEMBER, 24, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd11 = new ArrayList<>();
//        BigInteger randp11 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd11.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp11)).date(LocalDateTime.of(2023, Month.DECEMBER, 25, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd12 = new ArrayList<>();
//        BigInteger randp12 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd12.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp12)).date(LocalDateTime.of(2023, Month.DECEMBER, 26, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd13 = new ArrayList<>();
//        BigInteger randp13 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd13.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp13)).date(LocalDateTime.of(2023, Month.DECEMBER, 27, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd14 = new ArrayList<>();
//        BigInteger randp14 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd14.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp14)).date(LocalDateTime.of(2023, Month.DECEMBER, 28, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd15 = new ArrayList<>();
//        BigInteger randp15 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd15.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp15)).date(LocalDateTime.of(2023, Month.DECEMBER, 29, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd16 = new ArrayList<>();
//        BigInteger randp16 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd16.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp16)).date(LocalDateTime.of(2023, Month.DECEMBER, 30, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//        List<PatientProcedure> ppd17 = new ArrayList<>();
//        BigInteger randp17 = randomNumberService.generateRandomBigInteger(false, 12);
//        ppd17.add(PatientProcedure.patientProcedureBuilder().id(String.valueOf(randp17)).date(LocalDateTime.of(2023, Month.DECEMBER, 31, 0, 0)).description(ProceduresEnum.P_1.getDescription()).workingTherapists("Mikolić").build());
//
//
//        List<Mmt> mmts = new ArrayList<>();
//        for (MmtEnum mt : MmtEnum.values()) {
//            mmts.add(Mmt.builder().grade(mt.getGrade()).description(mt.getDescription()).build());
//        }
//        mmtRepositoryMongo.saveAll(mmts);
//
//        List<EyeOpeningResponse> eors = new ArrayList<>();
//        for (EyeOpeningResponseEnum er : EyeOpeningResponseEnum.values()) {
//            eors.add(EyeOpeningResponse.eyeOpeningResponseBuilder().score(er.getScore()).scale(er.getScale()).build());
//        }
//        eyeOpeningResponseRepositoryMongo.saveAll(eors);
//
//        List<MotorResponse> mrs = new ArrayList<>();
//        for (MotorResponseEnum mr : MotorResponseEnum.values()) {
//            mrs.add(MotorResponse.motorResponseBuilder().score(mr.getScore()).scale(mr.getScale()).build());
//        }
//        motorResponseRepositoryMongo.saveAll(mrs);
//
//        List<VerbalResponse> vrs = new ArrayList<>();
//        for (VerbalResponseEnum vr : VerbalResponseEnum.values()) {
//            vrs.add(VerbalResponse.verbalResponseBuilder().score(vr.getScore()).scale(vr.getScale()).build());
//        }
//        verbalResponseRepositoryMongo.saveAll(vrs);
//
//        List<AOP> aops = new ArrayList<>();
//        for (AOPEnum aop : AOPEnum.values()) {
//            aops.add(AOP.aopBuilder().aspectName(aop.getAspectName()).level(aop.getLevel()).levelDescription(aop.getLevelDescription()).build());
//        }
//        aopRepositoryMongo.saveAll(aops);
//
//
//        PhysioFile physioFile1 = PhysioFile.builder().fileOpenedBy("Iva Mikolić").patient(p1).patientFunctionalDiagnoses(pfd1).assessment(a1).patientGoals(pgl1).patientPlans(ppl1).notes("/").patientProcedures(ppd1).build();
//        PhysioFile physioFile2 = PhysioFile.builder().fileOpenedBy("David Bašić").patient(p2).patientFunctionalDiagnoses(pfd2).assessment(a2).patientGoals(pgl2).patientPlans(ppl2).notes("/").patientProcedures(ppd2).build();
//        PhysioFile physioFile3 = PhysioFile.builder().fileOpenedBy("Iva Mikolić").patient(p3).patientFunctionalDiagnoses(pfd3).assessment(a3).patientGoals(pgl3).patientPlans(ppl3).notes("/").patientProcedures(ppd3).build();
//        PhysioFile physioFile4 = PhysioFile.builder().fileOpenedBy("Iva Mikolić").patient(p4).patientFunctionalDiagnoses(pfd4).assessment(a4).patientGoals(pgl4).patientPlans(ppl4).notes("/").patientProcedures(ppd4).build();
//        PhysioFile physioFile5 = PhysioFile.builder().fileOpenedBy("Iva Mikolić").patient(p5).patientFunctionalDiagnoses(pfd5).assessment(a5).patientGoals(pgl5).patientPlans(ppl5).notes("/").patientProcedures(ppd5).build();
//        PhysioFile physioFile6 = PhysioFile.builder().fileOpenedBy("Iva Mikolić").patient(p6).patientFunctionalDiagnoses(pfd6).assessment(a6).patientGoals(pgl6).patientPlans(ppl6).notes("/").patientProcedures(ppd6).build();
//        PhysioFile physioFile7 = PhysioFile.builder().fileOpenedBy("Iva Mikolić").patient(p7).patientFunctionalDiagnoses(pfd7).assessment(a7).patientGoals(pgl7).patientPlans(ppl7).notes("/").patientProcedures(ppd7).build();
//        PhysioFile physioFile8 = PhysioFile.builder().fileOpenedBy("Iva Mikolić").patient(p8).patientFunctionalDiagnoses(pfd8).assessment(a8).patientGoals(pgl8).patientPlans(ppl8).notes("/").patientProcedures(ppd8).build();
//        PhysioFile physioFile9 = PhysioFile.builder().fileOpenedBy("David Bašić").patient(p9).patientFunctionalDiagnoses(pfd9).assessment(a9).patientGoals(pgl9).patientPlans(ppl9).notes("/").patientProcedures(ppd9).build();
//        PhysioFile physioFile10 = PhysioFile.builder().fileOpenedBy("David Bašić").patient(p10).patientFunctionalDiagnoses(pfd10).assessment(a10).patientGoals(pgl10).patientPlans(ppl10).notes("/").patientProcedures(ppd10).build();
//        PhysioFile physioFile11 = PhysioFile.builder().fileOpenedBy("David Bašić").patient(p11).patientFunctionalDiagnoses(pfd11).assessment(a11).patientGoals(pgl11).patientPlans(ppl11).notes("/").patientProcedures(ppd11).build();
//        PhysioFile physioFile12 = PhysioFile.builder().fileOpenedBy("David Bašić").patient(p12).patientFunctionalDiagnoses(pfd12).assessment(a12).patientGoals(pgl12).patientPlans(ppl12).notes("/").patientProcedures(ppd12).build();
//        PhysioFile physioFile13 = PhysioFile.builder().fileOpenedBy("David Bašić").patient(p13).patientFunctionalDiagnoses(pfd13).assessment(a13).patientGoals(pgl13).patientPlans(ppl13).notes("/").patientProcedures(ppd13).build();
//        PhysioFile physioFile14 = PhysioFile.builder().fileOpenedBy("David Bašić").patient(p14).patientFunctionalDiagnoses(pfd14).assessment(a14).patientGoals(pgl14).patientPlans(ppl14).notes("/").patientProcedures(ppd14).build();
//        PhysioFile physioFile15 = PhysioFile.builder().fileOpenedBy("Iva Mikolić").patient(p15).patientFunctionalDiagnoses(pfd15).assessment(a15).patientGoals(pgl15).patientPlans(ppl15).notes("/").patientProcedures(ppd15).build();
//        PhysioFile physioFile16 = PhysioFile.builder().fileOpenedBy("Iva Mikolić").patient(p16).patientFunctionalDiagnoses(pfd16).assessment(a16).patientGoals(pgl16).patientPlans(ppl16).notes("/").patientProcedures(ppd16).build();
//        PhysioFile physioFile17 = PhysioFile.builder().fileOpenedBy("Iva Mikolić").patient(p17).patientFunctionalDiagnoses(pfd17).assessment(a17).patientGoals(pgl17).patientPlans(ppl17).notes("/").patientProcedures(ppd17).build();
//        physioFileRepositoryMongo.saveAll(
//                List.of(
//                        physioFile1, physioFile2, physioFile3, physioFile4, physioFile5, physioFile6, physioFile7, physioFile8, physioFile9, physioFile10, physioFile11, physioFile12, physioFile13, physioFile14, physioFile15, physioFile16, physioFile17)
//        );

    }
}
