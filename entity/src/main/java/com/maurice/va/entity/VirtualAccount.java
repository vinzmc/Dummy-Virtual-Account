package com.maurice.va.entity;

import com.maurice.va.model.constant.VAType;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class VirtualAccount {
  @Id
  UUID id;

  @NotBlank
  String VANumber;

  @NotBlank
  String name;

  BigDecimal requiredPayment;

  Long expiredDate;

  String description;

  VAType type;
}
