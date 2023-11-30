package hr.dbasic.anephysiobe.annotations;

import hr.dbasic.anephysiobe.validators.ZipCodeLengthValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ZipCodeLengthValidator.class)
@Documented
public @interface ZipCodeLength {
    String message() default "Zipcode has exactly 5 digits";
    
    Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};
}
