package com.maurice.va.command;

import reactor.core.publisher.Mono;

public interface Command<T, K> {
  Mono<K> execute(T request);
}
