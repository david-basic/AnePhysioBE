package hr.dbasic.anephysiobe.services.impl;

import hr.dbasic.anephysiobe.exceptions.EntityNotFoundException;
import hr.dbasic.anephysiobe.models.patients.Mkb;
import hr.dbasic.anephysiobe.repositories.MkbRepositoryMongo;
import hr.dbasic.anephysiobe.services.MkbService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MkbServiceImpl implements MkbService {
    
    private final MkbRepositoryMongo mkbRepositoryMongo;
    
    @Override
    public Mkb findMkbByCode(String mkbCode) {
        return mkbRepositoryMongo.findMkbByCode(mkbCode).orElseThrow(EntityNotFoundException::new);
    }
}
