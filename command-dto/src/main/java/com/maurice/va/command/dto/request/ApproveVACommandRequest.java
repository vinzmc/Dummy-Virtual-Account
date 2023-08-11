package com.maurice.va.command.dto.request;

import com.maurice.va.validation.annotation.VAMustValid;
import jakarta.validation.Valid;

public class ApproveVACommandRequest {

  @Valid
  @VAMustValid
  private String vaNumber;
}
