package com.maurice.va.command.dto;

public final class EmptyCommandRequest {
  // Private constructor to prevent instantiation
  private EmptyCommandRequest() {
    // Private constructor to prevent instantiation
  }

  // Factory method to obtain an instance
  public static EmptyCommandRequest getInstance() {
    return new EmptyCommandRequest();
  }
}
