package com.maurice.va.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VAWebResponse {
  private String virtualAccountNumber;
  private String description;
  private String accountName;
  private String status;
  private Date expiredDate;
}
