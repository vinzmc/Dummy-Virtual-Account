package com.maurice.va.command.impl;

import com.maurice.va.command.CountVACommand;
import com.maurice.va.command.dto.EmptyCommandRequest;
import com.maurice.va.repository.VirtualAccountRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CountVACommandImpl implements CountVACommand {

  private final VirtualAccountRepository repository;

  public CountVACommandImpl(VirtualAccountRepository repository) {
    this.repository = repository;
  }

  @Override
  public Mono<Long> execute(EmptyCommandRequest request) {
    return  repository.count();
  }
}
