package com.maurice.va.controller;

import com.maurice.va.command.CommandInvoker;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {

  @Autowired
  protected CommandInvoker commandInvoker;

}
