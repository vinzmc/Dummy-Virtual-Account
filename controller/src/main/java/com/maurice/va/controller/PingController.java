package com.maurice.va.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class PingController extends BaseController{

  @GetMapping("/ping")
  public Mono<ResponseEntity<String>> getPing() {
    return Mono.fromCallable(() -> ResponseEntity.ok("Pong!!"));
  }


}
