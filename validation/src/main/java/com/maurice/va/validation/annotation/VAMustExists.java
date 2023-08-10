package com.maurice.va.validation.annotation;

import com.maurice.va.validation.validator.VAMustExistsValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, FIELD, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = {VAMustExistsValidator.class})
@Documented
public @interface VAMustExists {
  String message() default "VA Must Exists";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};
}
