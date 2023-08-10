package com.maurice.va.validation.validator;

import com.maurice.va.repository.VirtualAccountRepository;
import com.maurice.va.validation.annotation.VAMustExists;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class VAMustExistsValidator implements ConstraintValidator<VAMustExists, String> {

  @Autowired
  VirtualAccountRepository repository;

  @Override
  public boolean isValid(String vaNumber, ConstraintValidatorContext constraintValidatorContext) {
    return repository.existsByVANumber(vaNumber).blockOptional().orElse(false);
  }
}
