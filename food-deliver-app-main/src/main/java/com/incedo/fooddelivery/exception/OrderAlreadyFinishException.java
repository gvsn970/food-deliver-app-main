package com.incedo.fooddelivery.exception;

public class OrderAlreadyFinishException extends Exception {

  public OrderAlreadyFinishException(String message) {
    super(message);
  }
}
