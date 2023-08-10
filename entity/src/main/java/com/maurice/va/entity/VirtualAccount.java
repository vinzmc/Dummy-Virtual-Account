package com.maurice.va.entity;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.UUID;

public class VirtualAccount {
  @Id
  UUID id;

  @NotBlank
  String VANumber;

  @NotBlank
  String name;

  BigDecimal requiredPayment;

  Long expiredDate;
}
