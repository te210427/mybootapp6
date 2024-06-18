package jp.te4a.spring.boot.myapp12;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class WriterValidator implements ConstraintValidator<Writer, String> {
    private String ok;

    @Override
    public void initialize(Writer wr) {
        ok = wr.ok();
    }

    @Override
    public boolean isValid(String in, ConstraintValidatorContext cxt) {
        if (in == null) {
            return false;
        }
        return in.equals(ok);
    }
}
