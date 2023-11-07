package hr.dbasic.anephysiobe.validators;

public interface Validator<T> {
    void validate(T target);
}
