package com.maurice.va.controller;

import com.maurice.va.controller.dto.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class PingController extends BaseController {

  @GetMapping("/ping")
  public Mono<ResponseEntity<Response<String>>> getPing() {
    return Mono.just(ResponseEntity.ok(new Response<>("Pong!!", "")));
  }


}
