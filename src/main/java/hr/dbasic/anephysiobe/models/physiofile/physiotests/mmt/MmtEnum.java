package hr.dbasic.anephysiobe.models.physiofile.physiotests.mmt;

import lombok.Getter;

@Getter
public enum MmtEnum {
    MMT_5(5, "Mišić može savladati pun opseg pokreta uz maksimalni otpor FT"),
    MMT_4(4, "Mišićnom kontrakcijom moguće je savladati pun opseg pokreta protiv sile Zemljine teže i blagog otpora"),
    MMT_3(3, "Mišićnom kontrakcijom moguće je savladati pun opseg pokreta protiv sile Zemljine teže (antigravitacijski pokret)"),
    MMT_2(2, "Mišić je sposoban savladati pun opseg pokreta u zglobu u rasteretnom položaju (suspenzija, kosina…)"),
    MMT_1(1, "Prisutna palpabilna kontrakcija mišića"),
    MMT_0(0, "Nema mišićne aktivnosti");
    
    private final Integer grade;
    private final String description;
    
    MmtEnum(Integer grade, String description) {
        this.grade = grade;
        this.description = description;
    }
    
    @Override
    public String toString() {
        return grade + " - " + description;
    }
}
