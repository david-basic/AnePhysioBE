package hr.dbasic.anephysiobe.models.physiofile.physiotests.cpax;

import lombok.Getter;

@Getter
public enum AOPEnum {
    
    RESPIRATORY_FUNCTION_AOP_0("Dišna funkcija", 0, "Potpuna ovisnost o ventilatoru. Samo kontrolirano disanje. Analgosedacija ili paraliza"),
    RESPIRATORY_FUNCTION_AOP_1("Dišna funkcija", 1, "Ovisnost o ventilatoru. Kontrolirano disanje uz poneki samostalni udah."),
    RESPIRATORY_FUNCTION_AOP_2("Dišna funkcija", 2, "Spontano disanje na kontinuiranoj invazivnoj ili neinvazivnoj ventilatornoj potpori."),
    RESPIRATORY_FUNCTION_AOP_3("Dišna funkcija", 3, "Spontano disanje uz intermitentnu invazivnu ili neinvazivnu ventilacijsku potporu ili kontinuiranu oksigenaciju visokih protoka (>15L O2)."),
    RESPIRATORY_FUNCTION_AOP_4("Dišna funkcija", 4, "Standardna oksigenoterapija (<15L O2)."),
    RESPIRATORY_FUNCTION_AOP_5("Dišna funkcija", 5, "Spontano i suificijentno disanje bez primjene oksigenoterapije."),
    COUGH_AOP_0("Kašalj", 0, "Bez kašlja. Moguće analgosedacija ili paraliza."),
    COUGH_AOP_1("Kašalj", 1, "Kašalj provociran aspiracijom."),
    COUGH_AOP_2("Kašalj", 2, "Slab, neefektivan aktivan kašalj, bez aktivnog iskašljavanja (potrebna aspiracija sekreta)."),
    COUGH_AOP_3("Kašalj", 3, "Slab, djelomično efektivan aktivan kašalj uz povremeno uspješno iskašljavanje."),
    COUGH_AOP_4("Kašalj", 4, "Efektivan kašalj, mobilizacija i uklanjanje sekreta uz fizioterapijske postupke i procedure."),
    COUGH_AOP_5("Kašalj", 5, "Dosljedan efektivan kašalj, samostalna aktivna mobilizacija i uklanjanje sekreta."),
    MOVING_WITHIN_BED_AOP_0("Mobilnost u krevetu", 0, "Nemogućnost. Moguće analgosedacija ili paraliza."),
    MOVING_WITHIN_BED_AOP_1("Mobilnost u krevetu", 1, "Započinje pokret. Potrebna pomoć dvoje ili više osoba (maksimalno)."),
    MOVING_WITHIN_BED_AOP_2("Mobilnost u krevetu", 2, "Započinje pokret. Potrebna pomoć barem jedne osobe (umjereno)."),
    MOVING_WITHIN_BED_AOP_3("Mobilnost u krevetu", 3, "Započinje pokret. Potrebna pomoć jedne osobe (minimalno)."),
    MOVING_WITHIN_BED_AOP_4("Mobilnost u krevetu", 4, "Postiže samostalnost tijekom više ili točno 3 sekunde."),
    MOVING_WITHIN_BED_AOP_5("Mobilnost u krevetu", 5, "Postiže samostalnost u manje od 3 sekunde."),
    SUPINE_TO_SITTING_ON_THE_EDGE_OF_THE_BED_AOP_0("Posjedanje i sjedenje uz potporu", 0, "Nemogućnost/nestabilnost."),
    SUPINE_TO_SITTING_ON_THE_EDGE_OF_THE_BED_AOP_1("Posjedanje i sjedenje uz potporu", 1, "Započinje pokret. Potrebna pomoć dvoje ili više osoba (maksimalno)."),
    SUPINE_TO_SITTING_ON_THE_EDGE_OF_THE_BED_AOP_2("Posjedanje i sjedenje uz potporu", 2, "Započinje pokret. Potrebna pomoć barem jedna osobe (umjereno)."),
    SUPINE_TO_SITTING_ON_THE_EDGE_OF_THE_BED_AOP_3("Posjedanje i sjedenje uz potporu", 3, "Započinje pokret. Potrebna pomoć jedne osobe (minimalno)."),
    SUPINE_TO_SITTING_ON_THE_EDGE_OF_THE_BED_AOP_4("Posjedanje i sjedenje uz potporu", 4, "Postiže samostalnost tijekom više ili točno 3 sekunde."),
    SUPINE_TO_SITTING_ON_THE_EDGE_OF_THE_BED_AOP_5("Posjedanje i sjedenje uz potporu", 5, "Postiže samostalnost u manje od 3 sekunde."),
    DYNAMIC_SITTING_AOP_0("Dinamičko samostalno sjedenje", 0, "Nemogućnost/nestabilnost."),
    DYNAMIC_SITTING_AOP_1("Dinamičko samostalno sjedenje", 1, "Započinje pokret. Potrebna pomoć dvoje ili više osoba (maksimalno)."),
    DYNAMIC_SITTING_AOP_2("Dinamičko samostalno sjedenje", 2, "Započinje pokret. Potrebna pomoć barem jedna osobe (umjereno)."),
    DYNAMIC_SITTING_AOP_3("Dinamičko samostalno sjedenje", 3, "Započinje pokret. Potrebna pomoć jedne osobe (minimalno)."),
    DYNAMIC_SITTING_AOP_4("Dinamičko samostalno sjedenje", 4, "Samostalan sa djelomičnim dinamičkim balansom u sjedenju (npr. može promijeniti položaj trupa unutar baze potpore)."),
    DYNAMIC_SITTING_AOP_5("Dinamičko samostalno sjedenje", 5, "Samostalan s potpunim dinamičkim balansom u sjedenju (npr. može izaći iz baze potpore)."),
    STANDING_BALANCE_AOP_0("Ravnoteža tijekom vertikalizacije", 0, "Nemogućnost/nestabilnost/ovisnost o krevetu."),
    STANDING_BALANCE_AOP_1("Ravnoteža tijekom vertikalizacije", 1, "Nagibni stol ili slično."),
    STANDING_BALANCE_AOP_2("Ravnoteža tijekom vertikalizacije", 2, "Stajaća dizalica ili slično."),
    STANDING_BALANCE_AOP_3("Ravnoteža tijekom vertikalizacije", 3, "Ovisnost o potpori okvira, štaka hodalice ili sličnog."),
    STANDING_BALANCE_AOP_4("Ravnoteža tijekom vertikalizacije", 4, "Samostalan bez pomagala."),
    STANDING_BALANCE_AOP_5("Ravnoteža tijekom vertikalizacije", 5, "Samostalan bez potpore i potpunim dinamičkim balansom u stojećem položaju (npr. može izaći iz baze potpore)."),
    SIT_TO_STAND_AOP_0("Vertikalizacija iz sjedećeg položaja", 0, "Nemogućnost/nestabilnost."),
    SIT_TO_STAND_AOP_1("Vertikalizacija iz sjedećeg položaja", 1, "Vertikalizacija uz maksimalnu potporu (stajaća dizalica/elevator ili slično)."),
    SIT_TO_STAND_AOP_2("Vertikalizacija iz sjedećeg položaja", 2, "Vertikalizacija uz umjerenu pomoć (npr. jedna do dvije osobe)."),
    SIT_TO_STAND_AOP_3("Vertikalizacija iz sjedećeg položaja", 3, "Vertikalizacija uz minimalnu potporu (npr. jedna osoba)."),
    SIT_TO_STAND_AOP_4("Vertikalizacija iz sjedećeg položaja", 4, "Vertikalizacija gurajući od naslona stolice."),
    SIT_TO_STAND_AOP_5("Vertikalizacija iz sjedećeg položaja", 5, "Vertikalizacija bez pomoći aktivacije gornjih ekstremiteta."),
    TRANSFERRING_FROM_BED_TO_CHAIR_AOP_0("Transfer iz kreveta na stolac", 0, "Nemogućnost/nestabilnost."),
    TRANSFERRING_FROM_BED_TO_CHAIR_AOP_1("Transfer iz kreveta na stolac", 1, "Elevator."),
    TRANSFERRING_FROM_BED_TO_CHAIR_AOP_2("Transfer iz kreveta na stolac", 2, "Stajaća dizalica ili slično."),
    TRANSFERRING_FROM_BED_TO_CHAIR_AOP_3("Transfer iz kreveta na stolac", 3, "Okretni transfer (bez koračanja) uz pomoć pomagala ili fizioterapeuta."),
    TRANSFERRING_FROM_BED_TO_CHAIR_AOP_4("Transfer iz kreveta na stolac", 4, "Transfer vertikalizacijom i koračanjem uz pomogalo ili fizioterapeuta."),
    TRANSFERRING_FROM_BED_TO_CHAIR_AOP_5("Transfer iz kreveta na stolac", 5, "Samostalan transfer bez pomagala."),
    STEPPING_AOP_0("Koračanje u mjestu", 0, "Nemogućnost/nestabilnost."),
    STEPPING_AOP_1("Koračanje u mjestu", 1, "Stajaća dizalica ili slično."),
    STEPPING_AOP_2("Koračanje u mjestu", 2, "Korištenje pomagala uz pomoć barem jedne osobe (umjereno)."),
    STEPPING_AOP_3("Koračanje u mjestu", 3, "Korištenje pomagala uz pomoć jedne osobe (minimalno)."),
    STEPPING_AOP_4("Koračanje u mjestu", 4, "Korištenje pomagala ili pomoć jedne osobe (minimalno)."),
    STEPPING_AOP_5("Koračanje u mjestu", 5, "Samostalan bez pomagala."),
    GRIP_STRENGTH_AOP_0("Snaga stiska šake (dominantne ruke)", 0, "Nemogućnost procjene."),
    GRIP_STRENGTH_AOP_1("Snaga stiska šake (dominantne ruke)", 1, "<20%"),
    GRIP_STRENGTH_AOP_2("Snaga stiska šake (dominantne ruke)", 2, "<40%"),
    GRIP_STRENGTH_AOP_3("Snaga stiska šake (dominantne ruke)", 3, "<60%"),
    GRIP_STRENGTH_AOP_4("Snaga stiska šake (dominantne ruke)", 4, "<80%"),
    GRIP_STRENGTH_AOP_5("Snaga stiska šake (dominantne ruke)", 5, ">80%");
    
    private final String aspectName;
    private final Integer level;
    private final String levelDescription;
    
    AOPEnum(String aspectName, Integer level, String levelDescription) {
        this.aspectName = aspectName;
        this.level = level;
        this.levelDescription = levelDescription;
    }
    
    @Override
    public String toString() {
        return aspectName + " - Level " + level + ": " + levelDescription;
    }
}
