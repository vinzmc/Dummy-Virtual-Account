package com.maurice.va.controller;

import com.maurice.va.command.CountVACommand;
import com.maurice.va.command.GetVACommand;
import com.maurice.va.command.dto.EmptyCommandRequest;
import com.maurice.va.controller.dto.Response;
import com.maurice.va.controller.dto.response.VAWebResponse;
import com.maurice.va.validation.annotation.VAMustExists;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class VirtualAccountController extends BaseController{
  @GetMapping("/va/count")
  public Mono<ResponseEntity<Response<Long>>> countVa() {

    return commandInvoker.execute(CountVACommand.class, EmptyCommandRequest.getInstance())
        .map(Response::new)
        .map(ResponseEntity::ok);
  }

  @GetMapping("/va/{vaNumber}")
  public Mono<ResponseEntity<Response<VAWebResponse>>> getVAByNumber(@PathVariable @Valid @VAMustExists String vaNumber) {

    return commandInvoker.execute(GetVACommand.class, vaNumber)
        .map(Response::new)
        .map(ResponseEntity::ok);
  }
}
