package com.maurice.va.entity;

import com.maurice.va.model.constant.UserRoles;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.UUID;

public class User {
  @Id
  UUID id;

  @NotBlank
  String name;

  @NotBlank
  String email;

  @NotBlank
  String password;

  @NotBlank
  String salt;

  @NotNull
  UserRoles role;

  @NotNull
  BigDecimal balance;
}
