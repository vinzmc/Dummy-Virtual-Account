package com.maurice.va.command.impl;

import com.maurice.va.command.GetVACommand;
import com.maurice.va.controller.dto.response.VAWebResponse;
import com.maurice.va.repository.VirtualAccountRepository;
import com.maurice.va.util.DateTimeUtils;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetVACommandImpl implements GetVACommand {

  private final VirtualAccountRepository repository;

  public GetVACommandImpl(VirtualAccountRepository repository) {
    this.repository = repository;
  }

  @Override
  public Mono<VAWebResponse> execute(String request) {
    return repository.findByVANumber(request)
        .map(va -> VAWebResponse.builder()
            .virtualAccountNumber(va.getVANumber())
            .description(va.getDescription())
            .accountName(va.getName())
            .status(va.getStatus().getDescription())
            .expiredDate(DateTimeUtils.epochToDateConverter(va.getExpiredDate()))
            .build());
  }
}
