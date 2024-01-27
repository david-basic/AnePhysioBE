package hr.dbasic.anephysiobe.validators;

@FunctionalInterface
public interface WithValidator<T, W> {
    void validate(T target, W with);
}
