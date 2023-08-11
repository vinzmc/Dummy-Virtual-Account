package com.maurice.va.model.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum VAStatus{
  ACTIVE("VA Active"), CLOSED("VA Transaction completed"), EXPIRED("VA Expired");

  @Getter
  private String description;
}
