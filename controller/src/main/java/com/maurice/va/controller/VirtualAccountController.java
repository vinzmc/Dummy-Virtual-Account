package com.maurice.va.controller;

import com.maurice.va.command.CountVACommand;
import com.maurice.va.command.dto.EmptyCommandRequest;
import com.maurice.va.controller.dto.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class VirtualAccountController extends BaseController{
  @GetMapping("/va")
  public Mono<ResponseEntity<Response<Long>>> countVa() {

    return commandInvoker.execute(CountVACommand.class, EmptyCommandRequest.getInstance())
        .map(Response::new)
        .map(ResponseEntity::ok);
  }
}
