package hr.dbasic.anephysiobe.models.patients.mkbcodes;

import lombok.Getter;

@Getter
public enum MkbCodesP {
    
    P00("Fetus i novorođenče na koje djeluju stanja u majke koja nisu nužno u vezi s postojećom trudnoćom", "P00"),
    P00_0("Fetus i novorođenče na koje djeluju hipertenzivni poremećaji u majke", "P00.0"),
    P00_1("Fetus i novorođenče na koje djeluje bolest bubrega i mokraćnog sustava u majke", "P00.1"),
    P00_2("Fetus i novorođenče na koje djeluju infektivne i parazitarne bolesti u majke", "P00.2"),
    P00_3("Fetus i novorođenče na koje djeluju druge bolesti majčina respiracijskog i cirkulacijskog sustava", "P00.3"),
    P00_4("Fetus i novorođenče na koje djeluju nutritivni poremećaji u majke", "P00.4"),
    P00_5("Fetus i novorođenče na koje djeluju ozljede u majke", "P00.5"),
    P00_6("Fetus i novorođenče na koje djeluju kirurški zahvati na majci", "P00.6"),
    P00_7("Fetus i novorođenče na koje djeluju drugi medicinski postupci na majci, nesvrstani drugamo", "P00.7"),
    P00_8("Fetus i novorođenče na koje djeluju druga stanja u majke", "P00.8"),
    P00_9("Fetus i novorođenče na koje djeluje nespecificirano stanje u majke", "P00.9"),
    P01("Fetus i novorođenče na koje djeluju komplikacije trudnoće u majke", "P01"),
    P01_0("Fetus i novorođenče rođeno zbog insuficijencije vrata maternice", "P01.0"),
    P01_1("Fetus i novorođenče rođeno nakon prijevremene rupture ovojnica", "P01.1"),
    P01_2("Fetus i novorođenče s oligohidramnionom", "P01.2"),
    P01_3("Fetus i novorođenče s polihidramnionom", "P01.3"),
    P01_4("Fetus i novorođenče iz izvanmaternične trudnoće", "P01.4"),
    P01_5("Fetus i novorođenče iz višeplodne trudnoće", "P01.5"),
    P01_6("Fetus i novorođenče nakon majčine smrti", "P01.6"),
    P01_7("Fetus i novorođenče s nepravilnim stavom prije rođenja", "P01.7"),
    P01_8("Fetus i novorođenče nakon drugih komplikacija trudnoće u majke", "P01.8"),
    P01_9("Fetus i novorođenče s komplikacijom trudnoće u majke, nespecificiranom", "P01.9"),
    P02("Fetus i novorođenče na koje djeluju komplikacije posteljice, pupkovine i ovojnica", "P02"),
    P02_0("Fetus i novorođenče s placentom previjom", "P02.0"),
    P02_1("Fetus i novorođenče s drugim oblicima odvajanja posteljice i krvarenjima", "P02.1"),
    P02_2("Fetus i novorođenče s drugim i nespecificiranim morfološkim i funkcionalnim abnormalnostima posteljice", "P02.2"),
    P02_3("Fetus i novorođenče sa sindromima placentarne transfuzije", "P02.3"),
    P02_4("Fetus i novorođenče s ispalom pupkovinom", "P02.4"),
    P02_5("Fetus i novorođenče s drugom kompresijom pupkovine", "P02.5"),
    P02_6("Fetus i novorođenče na koje djeluju druga i nespecificirana stanja pupkovine", "P02.6"),
    P02_7("Fetus i novorođenče s korioamnionitisom", "P02.7"),
    P02_8("Fetus i novorođenče s drugim abnormalnostima ovojnica", "P02.8"),
    P02_9("Fetus i novorođenče s abnormalnošću ovojnica, nespecificiranom", "P02.9"),
    P03("Fetus i novorođenče s drugim komplikacijama porođaja", "P03"),
    P03_0("Fetus i novorođenče rođeni iz stava zatkom i ekstrakcijom", "P03.0"),
    P03_1("Fetus i novorođenče rođeni iz drugih nepravilnih stavova, položaja i disproporcija", "P03.1"),
    P03_2("Fetus i novorođenče nakon rađanja forcepsom", "P03.2"),
    P03_3("Fetus i novorođenče nakon rađanja vakuumskim ekstraktorom (ventuzom)", "P03.3"),
    P03_4("Fetus i novorođenče nakon rađanja carskim rezom", "P03.4"),
    P03_5("Fetus i novorođenče nakon ubrzana rađanja", "P03.5"),
    P03_6("Fetus i novorođenče nakon abnormalnih kontrakcija maternice", "P03.6"),
    P03_8("Fetus i novorođenče nakon drugih specificiranih komplikacija porođaja", "P03.8"),
    P03_9("Fetus i novorođenče s komplikacijom pri rađanju, nespecificiranom", "P03.9"),
    P04("Fetus i novorođenče na koje djeluju štetni utjecaji preneseni preko posteljice ili majčinim mlijekom", "P04"),
    P04_0("Fetus i novorođenče nakon anestezije i analgezije majke u tijeku trudnoće i porođaja", "P04.0"),
    P04_1("Fetus i novorođenče nakon drugog medikamentoznog liječenja majke", "P04.1"),
    P04_2("Fetus i novorođenče iz trudnoće majke pušačice", "P04.2"),
    P04_3("Fetus i novorođenče iz trudnoće u kojoj je majka uzimala alkohol", "P04.3"),
    P04_4("Fetus i novorođenče nakon majčine upotrebe lijekova koji uzrokuju navikavanje", "P04.4"),
    P04_5("Fetus i novorođenče nakon majčine upotrebe prehrambeno-kemijskih tvari", "P04.5"),
    P04_6("Fetus i novorođenče nakon trudnoće s izloženošću majke kemijskim tvarima okoliša", "P04.6"),
    P04_8("Fetus i novorođenče iz trudnoće s drugim štetnim majčinim utjecajem", "P04.8"),
    P04_9("Fetus i novorođenče iz trudnoće sa štetnim majčinim utjecajem, nespecificiranim", "P04.9"),
    P05("Usporeni rast fetusa i njegova pothranjenost", "P05"),
    P05_0("Prelagan za dob trudnoće", "P05.0"),
    P05_1("Premalen za dob trudnoće", "P05.1"),
    P05_2("Pothranjenost fetusa bez napomene o fetusu laganom ili malenom za dob gestacije", "P05.2"),
    P05_9("Usporeni rast fetusa, nespecificiran", "P05.9"),
    P07("Poremećaji koji se odnose na kratko trajanje gestacije i nisku porođajnu težinu, nesvrstani drugamo", "P06"),
    P07_0("Ekstremno niska porođajna težina", "P06.0"),
    P07_1("Druga niska porođajna težina", "P06.1"),
    P07_2("Ekstremna nezrelost", "P06.2"),
    P07_3("Druga prijevremeno rođena dojenčad", "P06.3"),
    P08("Poremećaji koji se odnose na dugo trajanje gestacije i veliku porođajnu težinu", "P07"),
    P08_0("Izuzetno veliko dijete", "P07.0"),
    P08_1("Druga dojenčad teška za gestacijsku dob", "P07.1"),
    P08_2("Dojenče rođeno nakon termina, koje nije teško za gestacijsku dob", "P07.2"),
    P10("Intrakranijalna laceracija i krvarenje zbog porođajne ozljede", "P10"),
    P10_0("Subduralno krvarenje zbog porođajne ozljede", "P10.0"),
    P10_1("Cerebralno krvarenje zbog porođajne ozljede", "P10.1"),
    P10_2("Intraventrikularno krvarenje zbog porođajne ozljede", "P10.2"),
    P10_3("Subarahnoidalno krvarenje zbog porođajne ozljede", "P10.3"),
    P10_4("Tentorijalni rascjep zbog porođajne ozljede", "P10.4"),
    P10_8("Druge intrakranijalne laceracije i krvarenja zbog porođajne ozljede", "P10.8"),
    P10_9("Nespecificirana intrakranijalna laceracija i krvarenje zbog porođajne ozljede", "P10.9"),
    P11("Druge porođajne ozljede središnjega živčanog sustava", "P11"),
    P11_0("Moždani edem zbog porođajne ozljede", "P11.0"),
    P11_1("Drugo specificirano oštećenje mozga zbog porođajne ozljede", "P11.1"),
    P11_2("Nespecificirano oštećenje mozga zbog porođajne ozljede", "P11.2"),
    P11_3("Porođajna ozljeda ličnog živca (nervus facialis)", "P11.3"),
    P11_4("Porođajna ozljeda drugih kranijalnih živaca", "P11.4"),
    P11_5("Porođajna ozljeda kralježnice i kralježnične moždine", "P11.5"),
    P11_9("Porođajna ozljeda središnjega živčanog sustava, nespecificirana", "P11.9"),
    P12("Porođajna ozljeda oglavka", "P12"),
    P12_0("Kefalhematom zbog porođajne ozljede", "P12.0"),
    P12_1("Oteklina oglavka zbog porođajne ozljede", "P12.1"),
    P12_2("Epikranijalno subaponeurotično krvarenje zbog porođajne ozljede", "P12.2"),
    P12_3("Nagnječenje oglavka zbog porođajne ozljede", "P12.3"),
    P12_4("Ozljede oglavka zbog praćenja novorođenčetova stanja", "P12.4"),
    P12_8("Druge porođajne ozljede oglavka", "P12.8"),
    P12_9("Porođajna ozljeda oglavka, nespecificirana", "P12.9"),
    P13("Porođajna ozljeda koštanog sustava", "P13"),
    P13_0("Fraktura lubanje zbog porođajne ozljede", "P13.0"),
    P13_1("Druge porođajne ozljede lubanje", "P13.1"),
    P13_2("Porođajna ozljeda bedrene kosti (femura)", "P13.2"),
    P13_3("Porođajna ozljeda ostalih dugačkih kostiju", "P13.3"),
    P13_4("Fraktura ključne kosti (klavikule) zbog porođajne ozljede", "P13.4"),
    P13_8("Porođajne ozljede drugih dijelova kostura", "P13.8"),
    P13_9("Porođajna ozljeda kostura, nespecificirana", "P13.9"),
    P14("Porođajna ozljeda perifernoga živčanog sustava", "P14"),
    P14_0("Erbova paraliza zbog porođajne ozljede", "P14.0"),
    P14_1("Klumpkeova paraliza zbog porođajne ozljede", "P14.1"),
    P14_2("Paraliza dijafragmalnog živca (nervus phrenicus) zbog porođajne ozljede", "P14.2"),
    P14_3("Druge porođajne ozljede brahijalnog pleksusa", "P14.3"),
    P14_8("Porođajne ozljede drugih dijelova perifernoga živčanog sustava", "P14.8"),
    P14_9("Porođajna ozljeda perifernoga živčanog sustava, nespecificirana", "P14.9"),
    P15("Druge porođajne ozljede", "P15"),
    P15_0("Porođajna ozljeda jetre", "P15.0"),
    P15_1("Porođajna ozljeda slezene", "P15.1"),
    P15_2("Porođajna ozljeda sternomastoida", "P15.2"),
    P15_3("Porođajna ozljeda oka", "P15.3"),
    P15_4("Porođajna ozljeda lica", "P15.4"),
    P15_5("Porođajna ozljeda vanjskog spolovila", "P15.5"),
    P15_6("Supkutana masna nekroza zbog porođajne ozljede", "P15.6"),
    P15_8("Druge specificirane porođajne ozljede", "P15.8"),
    P15_9("Porođajna ozljeda, nespecificirana", "P15.9"),
    P20("Intrauterina hipoksija", "P20"),
    P20_0("Intrauterina hipoksija prvi put zamijećena prije početka trudova", "P20.0"),
    P20_1("Intrauterina hipoksija prvi put zamijećena u tijeku trudova i porođaja", "P20.1"),
    P20_9("Intrauterina hipoksija, nespecificirana", "P20.9"),
    P21("Porođajna asfiksija", "P21"),
    P21_0("Teška porođajna asfiksija", "P21.0"),
    P21_1("Blaga i umjerena porođajna asfiksija", "P21.1"),
    P21_9("Porođajna asfiksija, nespecificirana", "P21.9"),
    P22("Respiratorni distres novorođenčeta", "P22"),
    P22_0("Sindrom respiratornog distresa novorođenčeta", "P22.0"),
    P22_1("Prolazna tahipneja novorođenčeta", "P22.1"),
    P22_8("Drugi respiratorni distres novorođenčeta", "P22.8"),
    P22_9("Respiratorni distres novorođenčeta, nespecificiran", "P22.9"),
    P23("Kongenitalna pneumonija", "P23"),
    P23_0("Kongenitalna pneumonija uzrokovana virusom", "P23.,"),
    P23_1("Kongenitalna pneumonija koju uzrokuje Chlamydia", "P23.1"),
    P23_2("Kongenitalna pneumonija uzrokovana stafilokokom", "P23.2"),
    P23_3("Kongenitalna pneumonija uzrokovana streptokokom, grupa B", "P23.3"),
    P23_4("Kongenitalna pneumonija koju uzrokuje Escherichia coli", "P23.4"),
    P23_5("Kongenitalna pneumonija koju uzrokuje Pseudomonas", "P23.5"),
    P23_6("Kongenitalna pneumonija zbog drugih bakterijskih uzročnika", "P23.6"),
    P23_8("Kongenitalna pneumonija zbog drugih uzročnika", "P23.8"),
    P23_9("Kongenitalna pneumonija, nespecificirana", "P23.9"),
    P24("Neonatalni aspiracijski sindrom", "P24"),
    P24_0("Neonatalna aspiracija mekonija", "P24.0"),
    P24_1("Neonatalna aspiracija amnionske tekućine i sluzi", "P24.1"),
    P24_2("Neonatalna aspiracija krvi", "P24.2"),
    P24_3("Neonatalna aspiracija mlijeka i regurgitirane (povraćene) hrane", "P24.3"),
    P24_8("Drugi neonatalni aspiracijski sindromi", "P24.8"),
    P24_9("Neonatalni aspiracijski sindrom, nespecificiran", "P24.9"),
    P25("Intersticijski emfizem i srodna stanja nastala u perinatalnom razdoblju", "P25"),
    P25_0("Intersticijski emfizem nastao u perinatalnom razdoblju", "P25.0"),
    P25_1("Pneumotoraks nastao u perinatalnom razdoblju", "P25.1"),
    P25_2("Pneumomedijastinum nastao u perinatalnom razdoblju", "P25.2"),
    P25_3("Pneumoperikard nastao u perinatalnom razdoblju", "P25.3"),
    P25_8("Druga stanja povezana s intersticijskim emfizemom nastala u perinatalnom razdoblju", "P25.8"),
    P26("Plućno krvarenje nastalo u perinatalnom razdoblju", "P26"),
    P26_0("Traheobronhalno krvarenje nastalo u perinatalnom razdoblju", "P26.0"),
    P26_1("Masivno plućno krvarenje nastalo u perinatalnom razdoblju", "P26.1"),
    P26_8("Drugo plućno krvarenje nastalo u perinatalnom razdoblju", "P26.8"),
    P26_9("Nespecificirano plućno krvarenje nastalo u perinatalnom razdoblju", "P26.9"),
    P27("Kronična respiracijska bolest nastala u perinatalnom razdoblju", "P27"),
    P27_0("Wilson-Mikityjev sindrom", "P27.0"),
    P27_1("Bronhopulmonalna displazija nastala u perinatalnom razdoblju", "P27.1"),
    P27_8("Druge kronične respiratorne bolesti nastale u perinatalnom razdoblju", "P27.8"),
    P27_9("Nespecificirana kronična respiratorna bolest nastala u perinatalnom razdoblju", "P27.9"),
    P28("Druga stanja dišnog sustava nastala u perinatalnom razdoblju", "P28"),
    P28_0("Primarna atelektaza novorođenčeta", "P28.0"),
    P28_1("Druga i nespecificirana atelektaza novorođenčeta", "P28.1"),
    P28_2("Napadaji cijanoze u novorođenčeta", "P28.2"),
    P28_3("Primarna apneja u snu novorođenčeta", "P28.3"),
    P28_4("Druga apneja novorođenčeta", "P28.4"),
    P28_5("Zatajenje respiracije u novorođenčeta", "P28.5"),
    P28_8("Druga specificirana stanja respiracijskog sustava u novorođenčeta", "P28.8"),
    P28_9("Stanje respiracijskog sustava novorođenčeta, nespecificirano", "P28.9"),
    P29("Kardiovaskularni poremećaji nastali u perinatalnom razdoblju", "P29"),
    P29_0("Zatajenje srca u novorođenčeta", "P29.0"),
    P29_1("Srčana dizritmija u novorođenčeta", "P29.1"),
    P29_2("Hipertenzija u novorođenčeta", "P29.2"),
    P29_3("Perzistirajuća fetalna cirkulacija", "P29.3"),
    P29_4("Prolazna ishemija miokarda u novorođenčeta", "P29.4"),
    P29_8("Drugi kardiovaskularni poremećaji nastali u perinatalnom razdoblju", "P29.8"),
    P29_9("Kardiovaskularni poremećaj nastao u perinatalnom razdoblju, nespecificiran", "P29.9"),
    P35("Kongenitalne virusne bolesti", "P35"),
    P35_0("Sindrom prirođene rubeole", "P35.0"),
    P35_1("Kongenitalna infekcija citomegalovirusom", "P35.1"),
    P35_2("Kongenitalna infekcija virusom herpesa (herpes simpleks)", "P35.2"),
    P35_3("Kongenitalni virusni hepatitis", "P35.3"),
    P35_8("Druge prirođene virusne bolesti", "P35.8"),
    P35_9("Kongenitalna virusna bolest, nespecificirana", "P35.9"),
    P36("Bakterijska sepsa u novorođenčeta", "P36"),
    P36_0("Sepsa u novorođenčeta uzrokovana streptokokom, grupa B", "P36.0"),
    P36_1("Sepsa u novorođenčeta uzrokovana drugim i nespecificiranim streptokokom", "P36.1"),
    P36_2("Sepsa u novorođenčeta koju uzrokuje Staphylococcus aureus", "P36.2"),
    P36_3("Sepsa u novorođenčeta uzrokovana drugim i nespecificiranim stafilokokom", "P36.3"),
    P36_4("Sepsa u novorođenčeta koju uzrokuje Ecsherichia coli", "P36.4"),
    P36_5("Sepsa u novorođenčeta uzrokovana anaerobima", "P36.5"),
    P36_8("Druga bakterijska sepsa u novorođenčeta", "P36.8"),
    P36_9("Bakterijska sepsa u novorođenčeta, nespecificirana", "P36.9"),
    P37("Druge prirođene infektivne i parazitarne bolesti", "P37"),
    P37_0("Kongenitalna tuberkuloza", "P37.0"),
    P37_1("Kongenitalna toksoplazmoza", "P37.1"),
    P37_2("Neonatalna (diseminirana) listerioza", "P37.2"),
    P37_3("Kongenitalna malarija (Falciparum malariae)", "P37.3"),
    P37_4("Druga prirođena malarija", "P37.4"),
    P37_5("Neonatalna kandidijaza", "P37.5"),
    P37_8("Druge specificirane prirođene infektivne i parazitarne bolesti", "P37.8"),
    P37_9("Kongenitalna infektivna i parazitarna bolest, nespecificirana", "P37.9"),
    P38("Omfalitis novorođenčeta sa slabim krvarenjem ili bez njega", "P38"),
    P38_0("Omfalitis novorođenčeta sa slabim krvarenjem ili bez njega", "P38.0"),
    P39("Druge infekcije specifične za perinatalno razdoblje", "P39"),
    P39_0("Neonatalni infektivni mastitis", "P39.0"),
    P39_1("Neonatalni konjunktivitis i dakriocistitis", "P39.1"),
    P39_2("Intraamnionska infekcija fetusa, nesvrstana drugamo", "P39.2"),
    P39_3("Infekcija mokraćnog sustava u novorođenčeta", "P39.3"),
    P39_4("Infekcija kože u novorođenčeta", "P39.4"),
    P39_8("Druge specificirane infekcije specifične za perinatalno razdoblje", "P39.8"),
    P39_9("Infekcija specifična za perinatalno razdoblje, nespecificirana", "P39.9"),
    P50("Gubitak krvi fetusa (fetalni gubitak krvi)", "P50"),
    P50_0("Gubitak krvi fetusa iz vasa praevia", "P50.0"),
    P50_1("Gubitak krvi fetusa iz rupturirane pupčane vrpce", "P50.1"),
    P50_2("Gubitak krvi fetusa iz posteljice", "P50.2"),
    P50_3("Krvarenje u drugog blizanca (co-twin)", "P50.3"),
    P50_4("Krvarenje u majčinu cirkulaciju", "P50.4"),
    P50_5("Gubitak krvi fetusa iz presječenog kraja blizanačke pupčane vrpce", "P50.5"),
    P50_8("Drugi gubitak krvi fetusa", "P50.8"),
    P50_9("Gubitak krvi fetusa, nespecificiran", "P50.9"),
    P51("Umbilikalno krvarenje u novorođenčeta", "P51"),
    P51_0("Masivno umbilikalno krvarenje u novorođenčeta", "P51.0"),
    P51_8("Drugo umbilikalno krvarenje u novorođenčeta", "P51.8"),
    P51_9("Umbilikalno krvarenje u novorođenčeta, nespecificirano", "P51.9"),
    P52("Intrakranijalno netraumatsko krvarenje u fetusa i novorođenčeta", "P52"),
    P52_0("Intraventrikularno (netraumatsko) krvarenje u fetusa i novorođenčeta, prvoga stupnja", "P52.0"),
    P52_1("Intraventrikularno (netraumatsko) krvarenje u fetusa i novorođenčeta, drugoga stupnja", "P52.1"),
    P52_2("Intraventrikularno (netraumatsko) krvarenje u fetusa i novorođenčeta, trećega stupnja", "P52.2"),
    P52_3("Nespecificirano intraventrikularno (netraumatsko) krvarenje u fetusa i novorođenčeta", "P52.3"),
    P52_4("Intracerebralno (netraumatsko) krvarenje u fetusa i novorođenčeta", "P52.4"),
    P52_5("Subarahnoidalno (netraumatsko) krvarenje u fetusa i novorođenčeta", "P52.5"),
    P52_6("Cerebelarno (netraumatsko) i krvarenje u stražnjoj lubanjskoj šupljini u fetusa i novorođenčeta", "P52.6"),
    P52_8("Druga intrakranijalna (netraumatska) krvarenja u fetusa i novorođenčeta", "P52.8"),
    P52_9("Intrakranijalno (netraumatsko) krvarenje fetusa i novorođenčeta, nespecificirano", "P52.9"),
    P53("Hemoragijska bolest fetusa i novorođenčeta", "P53"),
    P53_0("Hemoragijska bolest fetusa i novorođenčeta", "P53.0"),
    P54("Druga neonatalna krvarenja", "P54"),
    P54_0("Neonatalna hematemeza", "P54.0"),
    P54_1("Neonatalna melena", "P54.1"),
    P54_2("Neonatalno krvarenje iz debeloga crijeva (rektalno)", "P54.2"),
    P54_3("Drugo neonatalno gastrointestinalno krvarenje", "P54.3"),
    P54_4("Neonatalno krvarenje u nadbubrežnu žlijezdu (adrenalno)", "P54.4"),
    P54_5("Neonatalno kožno krvarenje", "P54.5"),
    P54_6("Neonatalno krvarenje iz rodnice", "P54.6"),
    P54_8("Druga specificirana neonatalna krvarenja", "P54.8"),
    P54_9("Neonatalno krvarenje, nespecificirano", "P54.9"),
    P55("Hemolitična bolest fetusa i novorođenčeta", "P55"),
    P55_0("Rh-izoimunizacija fetusa i novorođenčeta", "P55.0"),
    P55_1("ABO-izoimunizacija fetusa i novorođenčeta", "P55.1"),
    P55_8("Druge hemolitične bolesti fetusa i novorođenčeta", "P55.8"),
    P55_9("Hemolitična bolest fetusa i novorođenčeta, nespecificirana", "P55.9"),
    P56("Fetalni hidrops zbog hemolitične bolesti", "P56"),
    P56_0("Fetalni hidrops zbog izoimunizacije", "P56.0"),
    P56_9("Fetalni hidrops zbog druge i nespecificirane hemolitične bolesti", "P56.9"),
    P57("Kernikterus", "P57"),
    P57_0("Kernikterus zbog izoimunizacije", "P57.0"),
    P57_8("Drugi specificirani kernikterus", "P57.8"),
    P57_9("Kernikterus, nespecificiran", "P57.9"),
    P58("Neonatalna žutica nastala zbog druge prekomjerne hemolize", "P58"),
    P58_0("Neonatalna žutica zbog nagnječenja", "P58.0"),
    P58_1("Neonatalna žutica zbog krvarenja", "P58.1"),
    P58_2("Neonatalna žutica zbog infekcije", "P58.2"),
    P58_3("Neonatalna žutica zbog policitemije", "P58.3"),
    P58_4("Neonatalna žutica zbog lijekova ili toksina prenesenih od majke ili danih novorođenčetu", "P58.4"),
    P58_5("Neonatalna žutica zbog progutane majčine krvi", "P58.5"),
    P58_8("Neonatalna žutica zbog drugih specificiranih prekomjernih hemoliza", "P58.8"),
    P58_9("Neonatalna žutica zbog prekomjerne hemolize, nespecificirana", "P58.9"),
    P59("Neonatalna žutica zbog drugih i nespecificiranih uzroka", "P59"),
    P59_0("Neonatalna žutica povezana s prijevremenim rođenjem", "P59.0"),
    P59_1("Sindrom zgusnute žuči", "P59.1"),
    P59_2("Neonatalna žutica zbog drugog i nespecificiranog hepatocelularnog oštećenja", "P59.2"),
    P59_3("Neonatalna žutica zbog zastoja mlijeka u dojci", "P59.3"),
    P59_8("Neonatalna žutica zbog drugih specificiranih uzroka", "P59.8"),
    P59_9("Neonatalna žutica, nespecificirana", "P59.9"),
    P60("Diseminirana intravaskularna koagulacija fetusa i novorođenčeta", "P60"),
    P60_0("Diseminirana intravaskularna koagulacija fetusa i novorođenčeta", "P60.0"),
    P61("Drugi perinatalni hematološki poremećaji", "P61"),
    P61_0("Prolazna neonatalna trombocitopenija", "P61.0"),
    P61_1("Neonatalna policitemija", "P61.1"),
    P61_2("Anemija zbog prematurnosti", "P61.2"),
    P61_3("Kongenitalna anemija zbog fetalnog gubitka krvi", "P61.3"),
    P61_4("Druge prirođene anemije koje nisu svrstane drugamo", "P61.4"),
    P61_5("Prolazna neonatalna neutropenija", "P61.5"),
    P61_6("Drugi prolazni neonatalni poremećaji koagulacije", "P61.6"),
    P61_8("Drugi specificirani perinatalni hematološki poremećaji", "P61.8"),
    P61_9("Perinatalni hematološki poremećaj, nespecificiran", "P61.9"),
    P70("Prolazni poremećaji metabolizma ugljikohidrata specifični za fetus i novorođenče", "P70"),
    P70_0("Sindrom dojenčeta majke s gestacijskim dijabetesom", "P70.0"),
    P70_1("Sindrom dojenčeta dijabetične majke", "P70.1"),
    P70_2("Neonatalni dijabetes melitus", "P70.2"),
    P70_3("Jatrogena neonatalna hipoglikemija", "P70.3"),
    P70_4("Druga neonatalna hipoglikemija", "P70.4"),
    P70_8("Drugi prolazni poremećaji metabolizma ugljikohidrata u fetusa i novorođenčeta", "P70.8"),
    P70_9("Prolazni poremećaj metabolizma ugljikohidrata u fetusa i novorođenčeta, nespecificiran", "P70.9"),
    P71("Prolazni neonatalni poremećaji metabolizma kalcija i magnezija", "P71"),
    P71_0("Hipokalcemija u novorođenčeta zbog uzimanja kravljeg mlijeka", "P71.0"),
    P71_1("Druga neonatalna hipokalcemija", "P71.1"),
    P71_2("Neonatalna hipomagnezijemija", "P71.2"),
    P71_3("Neonatalna tetanija bez manjka kalcija i megnezija", "P71.3"),
    P71_4("Prolazni neonatalni hipoparatireoidizam", "P71.4"),
    P71_8("Drugi prolazni neonatalni poremećaji metabolizma kalcija i magnezija", "P71.8"),
    P71_9("Prolazni neonatalni poremećaj metabolizma kalcija i magnezija, nespecificiran", "P71.9"),
    P72("Drugi prolazni neonatalni endokrinološki poremećaji", "P72"),
    P72_0("Neonatalna gušavost, nesvrstana drugamo", "P72.0"),
    P72_1("Prolazni neonatalni hipertireoidizam", "P72.1"),
    P72_2("Drugi prolazni neonatalni poremećaji funkcije štitnjače, nesvrstani drugamo", "P72.2"),
    P72_8("Drugi specificirani prolazni neonatalni endokrinološki poremećaji", "P72.8"),
    P72_9("Prolazni neonatalni endokrinološki poremećaj, nespecificiran", "P72.9"),
    P74("Drugi prolazni neonatalni poremećaji metabolizma i elektrolita", "P73"),
    P74_0("Kasna metabolička acidoza u novorođenčeta", "P73.0"),
    P74_1("Dehidracija novorođenčeta", "P73.1"),
    P74_2("Poremećaj ravnoteže natrija u novorođenčeta", "P73.2"),
    P74_3("Poremećaj ravnoteže kalija u novorođenčeta", "P73.3"),
    P74_4("Drugi prolazni poremećaj ravnoteže elektrolita u novorođenčeta", "P73.4"),
    P74_5("Prolazna tirozinemija u novorođenčeta", "P73.5"),
    P74_8("Drugi prolazni metabolički poremećaji u novorođenčeta", "P73.8"),
    P74_9("Prolazni metabolički poremećaj u novorođenčeta, nespecificiran", "P73.9"),
    P75("Mekonijski ileus", "P75"),
    P75_0("Mekonijski ileus", "P75.0"),
    P76("Druge crijevne opstrukcije u novorođenčeta", "P76"),
    P76_0("Sindrom začepljenja mekonijem", "P76.0"),
    P76_1("Prolazni ileus u novorođenčeta", "P76.1"),
    P76_2("Crijevna opstrukcija zbog zgusnutoga mlijeka", "P76.2"),
    P76_8("Druge specificirane crijevne opstrukcije u novorođenčeta", "P76.8"),
    P76_9("Crijevna opstrukcija u novorođenčeta, nespecificirana", "P76.9"),
    P77("Nekrotizirajući enterokolitis u fetusa i novorođenčeta", "P77"),
    P77_0("Nekrotizirajući enterokolitis u fetusa i novorođenčeta", "P77.0"),
    P78("Drugi perinatalni poremećaji probavnog sustava", "P78"),
    P78_0("Perinatalna perforacija crijeva", "P78.0"),
    P78_1("Drugi neonatalni peritonitis", "P78.1"),
    P78_2("Neonatalna hematemeza i melena zbog progutane majčine krvi", "P78.2"),
    P78_3("Neinfektivna neonatalna dijareja", "P78.3"),
    P78_8("Drugi specificirani perinatalni poremećaji probavnog sustava", "P78.8"),
    P78_9("Perinatalni poremećaj probavnog sustava, nespecificiran", "P78.9"),
    P80("Hipotermija u novorođenčeta", "P80"),
    P80_0("Sindrom hladne ozljede", "P80.0"),
    P80_8("Druga hipotermija u novorođenčeta", "P80.8"),
    P80_9("Hipotermija u novorođenčeta, nespecificirana", "P80.9"),
    P81("Drugi poremećaji regulacije temperature u novorođenčeta", "P81"),
    P81_0("Hipertermija u novorođenčeta uzrokovana temperaturom okoliša", "P81.0"),
    P81_8("Drugi specificirani poremećaji regulacije temperature u novorođenčeta", "P81.8"),
    P81_9("Porememećaj regulacije temperature u novorođenčeta, nespecificiran", "P81.9"),
    P83("Druga stanja kože specifična za fetus i novorođenče", "P82"),
    P83_0("Sklerema neonatorum", "P82.0"),
    P83_1("Neonatalni toksični eritem", "P82.1"),
    P83_2("Fetalni hidrops koji nije uzrokovan hemolitičnom bolesti", "P82.2"),
    P83_3("Drugi i nespecificirani edemi specifični za fetus i novorođenče", "P82.3"),
    P83_4("Povećanje mliječne žlijezde u novorođenčeta", "P82.4"),
    P83_5("Kongenitalna hidrokela", "P82.5"),
    P83_6("Polip pupka (umbilikalni polip) u novorođenčeta", "P82.6"),
    P83_8("Druga specificirana stanja kože specifična za fetus i novorođenče", "P82.8"),
    P83_9("Stanje kože specifično za fetus i novorođenče, nespecificirano", "P82.9"),
    P90("Konvulzije novorođenčeta", "P90"),
    P90_0("Konvulzije novorođenčeta", "P90.0"),
    P91("Drugi poremećaji cerebralnoga statusa u novorođenčeta", "P91"),
    P91_0("Novorođenačka cerebralna ishemija", "P91.0"),
    P91_1("Stečena periventrikularna cista u novorođenčeta", "P91.1"),
    P91_2("Novorođenačka cerebralna leukomalacija", "P91.2"),
    P91_3("Novorođenačka cerebralna razdražljivost", "P91.3"),
    P91_4("Neonatalna cerebralna depresija", "P91.4"),
    P91_5("Neonatalna koma", "P91.5"),
    P91_8("Drugi specificirani poremećaji cerebralnoga statusa u novorođenčeta", "P91.8"),
    P91_9("Poremećaj cerebralnoga statusa u novorođenčeta, nespecificiran", "P91.9"),
    P92("Problemi hranjenja novorođenčeta", "P92"),
    P92_0("Povraćanje u novorođenčeta", "P92.0"),
    P92_1("Regurgitacija i ruminacija u novorođenčeta", "P92.1"),
    P92_2("Sporo hranjenje novorođenčeta", "P92.2"),
    P92_3("Nedovoljno hranjenje novorođenčeta", "P92.3"),
    P92_4("Prekomjerno hranjenje novorođenčeta", "P92.4"),
    P92_5("Novorođenačke poteškoće pri dojenju", "P92.5"),
    P92_8("Drugi problemi hranjenja novorođenčeta", "P92.8"),
    P92_9("Problem hranjenja novorođenčeta, nespecificiran", "P92.9"),
    P93("Reakcije i intoksikacije zbog lijekova danih fetusu i novorođenčetu", "P93"),
    P93_0("Reakcije i intoksikacija zbog lijekova danih fetusu i novorođenčetu", "P93.0"),
    P94("Poremećaji mišićnog tonusa u novorođenčeta", "P94"),
    P94_0("Prolazna novorođenačka miastenija gravis", "P94.0"),
    P94_1("Kongenitalna hipertonija", "P94.1"),
    P94_2("Kongenitalna hipotonija", "P94.2"),
    P94_8("Drugi poremećaji mišićnog tonusa u novorođenčeta", "P94.8"),
    P94_9("Poremećaj mišićnog tonusa u novorođenčeta, nespecificiran", "P94.9"),
    P95("Fetalna smrt zbog nespecificiranog uzroka", "P95"),
    P95_0("Fetalna smrt zbog nespecificiranog uzroka", "P95.0"),
    P96("Druga stanja nastala u perinatalnom razdoblju", "P96"),
    P96_0("Kongenitalno zatajenje bubrega", "P96.0"),
    P96_1("Neonatalni simptomi odvikavanja od majčine uporabe lijekova koji uzrokuju ovisnost", "P96.1"),
    P96_2("Sindrom odvikavanja od terapijske uporabe lijekova u novorođenčeta", "P96.2"),
    P96_3("Široke kranijalne suture u novorođenčeta", "P96.3"),
    P96_4("Neuspio prekid trudnoće s posljedicama za fetus i novorođenče", "P96.4"),
    P96_5("Komplikacije intrauterinih postupaka, nesvrstane drugamo", "P96.5"),
    P96_8("Druga specificirana stanja nastala u perinatalnom razdoblju", "P96.8"),
    P96_9("Stanje nastalo u perinatalnom razdoblju, nespecificirano", "P96.9");
    
    private final String displayName;
    private final String code;
    
    MkbCodesP(String displayName, String code) {
        this.displayName = displayName;
        this.code = code;
    }
    
    @Override
    public String toString() {
        return code + " " + displayName;
    }
}