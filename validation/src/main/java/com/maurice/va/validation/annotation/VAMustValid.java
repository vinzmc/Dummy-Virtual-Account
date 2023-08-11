package com.maurice.va.validation.annotation;

import com.maurice.va.validation.validator.VAMustExistsValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Size;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Size(min = 16, max = 16, message = "The provided VA Number should consist of exactly 16 digits")
@Target({TYPE, FIELD, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = {VAMustExistsValidator.class})
@Documented
public @interface VAMustValid {
  String message() default "Virtual Account Number Must Valid";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};
}
