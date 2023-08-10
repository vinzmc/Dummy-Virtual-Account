package com.maurice.va.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class CommandInvoker {
  private final ApplicationContext context;

  @Autowired
  public CommandInvoker(ApplicationContext context) {
    this.context = context;
  }

  public <T, K> Mono<K> execute(Class<? extends Command<T, K>> commandClass, T request) {
    return Mono.fromCallable(() -> (Command) context.getBean(commandClass)).flatMap(command -> command.execute(request));
  }
}
