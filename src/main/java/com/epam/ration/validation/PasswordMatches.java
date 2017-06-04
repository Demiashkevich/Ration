package com.epam.ration.validation;

import com.epam.ration.validation.custom.PasswordMatchesValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD})
@Documented
@Constraint(validatedBy = PasswordMatchesValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordMatches {
    String message() default "Passwords don't match";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
