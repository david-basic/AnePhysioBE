package hr.dbasic.anephysiobe.validators;

import hr.dbasic.anephysiobe.exceptions.UniquenessViolatedException;
import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CreateAssessmentOnPhysioFileValidator implements Validator<PhysioFile> {
    
    @Override
    public void validate(PhysioFile target) {
        if (!Objects.isNull(target.getAssessment())) {
            throw new UniquenessViolatedException("Početna procjena za trenutni karton već postoji!");
        }
    }
}
