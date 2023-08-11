package com.maurice.va.entity;

import com.maurice.va.model.constant.UserRoles;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.UUID;

public class User {
  @Id
  private  UUID id;

  @NotBlank
  private String name;

  @NotBlank
  private String email;

  @NotBlank
  private String password;

  @NotBlank
  private String salt;

  @NotNull
  private UserRoles role;

  @NotNull
  private BigDecimal balance;
}
