package com.maurice.va.command.dto;

public final class EmptyCommandRequest {
  private static EmptyCommandRequest INSTANCE;

  // Private constructor to prevent instantiation
  private EmptyCommandRequest() {
    // Private constructor to prevent instantiation
  }

  // Factory method to obtain an instance
  public static EmptyCommandRequest getInstance() {
    if(INSTANCE == null) {
      INSTANCE = new EmptyCommandRequest();
    }

    return INSTANCE;
  }
}
