package hr.dbasic.anephysiobe.exceptions;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.function.Supplier;

public class EntityNotFoundException extends NotFoundException{
    
    public EntityNotFoundException() {
        super(Constants.genericExceptionMessageFormat);
    }
    
    public EntityNotFoundException(String entityName) {
        super(Constants.genericExceptionMessageFormat.formatted(entityName));
    }
    
    public EntityNotFoundException(Throwable cause) {
        super(Constants.genericExceptionMessageFormat, cause);
    }
    
    public EntityNotFoundException(String entityName, Throwable cause) {
        super(Constants.genericExceptionMessageFormat.formatted(entityName), cause);
    }
    
    public static Supplier<EntityNotFoundException> supplier() {
        return EntityNotFoundException::new;
    }
    
    public static Supplier<EntityNotFoundException> supplier(String entityName) {
        return () -> new EntityNotFoundException(entityName);
    }
    
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Constants {
        
        public static final String exceptionMessageFormat = "Entitet sa danim identifikatorom ne postoji!";
        
        public static final String genericExceptionMessageFormat = "%s sa danim identifikatorom ne postoji!";
        
    }
}
