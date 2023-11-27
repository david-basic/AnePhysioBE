package hr.dbasic.anephysiobe.controllers;

import hr.dbasic.anephysiobe.models.patients.Mkb;
import hr.dbasic.anephysiobe.models.patients.MkbCodes;
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
    
    @Override
    public void run(String... args) {
        
        List<Mkb> mkbs = new ArrayList<>();
        
        for (MkbCodes mkbCodes : MkbCodes.values()) {
//            mkbs.add(new Mkb(mkbCodes.getCode(), mkbCodes.getDisplayName()));
            System.out.println(mkbCodes);
        }
        
        //mkbRepositoryMongo.saveAll(mkbs);
    }
}
