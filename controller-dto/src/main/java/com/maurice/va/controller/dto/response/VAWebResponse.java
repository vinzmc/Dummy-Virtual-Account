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
  String virtualAccountNumber;
  String description;
  String accountName;
  Date expiredDate;
}
