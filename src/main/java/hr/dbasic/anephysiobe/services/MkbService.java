package hr.dbasic.anephysiobe.services;

import hr.dbasic.anephysiobe.models.patients.Mkb;

public interface MkbService {
    Mkb findMkbByCode(String mkbCode);
}
