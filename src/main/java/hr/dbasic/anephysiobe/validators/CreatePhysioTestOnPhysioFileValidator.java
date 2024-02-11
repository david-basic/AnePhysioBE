package hr.dbasic.anephysiobe.validators;

import hr.dbasic.anephysiobe.exceptions.UniquenessViolatedException;
import hr.dbasic.anephysiobe.models.physiofile.PhysioFile;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CreatePhysioTestOnPhysioFileValidator implements Validator<PhysioFile> {
    @Override
    public void validate(PhysioFile target) {
        if (!Objects.isNull(target.getPhysioTest())) {
            throw new UniquenessViolatedException("Test za trenutni karton već postoji!");
        }
    }
}
