package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.models.patients.Mkb;
import hr.dbasic.anephysiobe.models.patients.MkbCodes;

public interface MkbService {
    Mkb findMkbByCode(MkbCodes mkbCode);
}
