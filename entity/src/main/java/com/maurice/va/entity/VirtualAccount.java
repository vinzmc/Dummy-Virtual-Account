package com.maurice.va.entity;

import com.maurice.va.model.constant.VAStatus;
import com.maurice.va.model.constant.VAType;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class VirtualAccount {
  @Id
  private UUID id;

  @NotBlank
  private String VANumber;

  @NotBlank
  private String name;

  private BigDecimal requiredPayment;

  private Long expiredDate;

  private String description;

  private VAType type;

  private VAStatus status;
}
