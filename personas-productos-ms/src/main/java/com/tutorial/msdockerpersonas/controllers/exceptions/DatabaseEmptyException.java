package com.tutorial.msdockerpersonas.controllers.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DatabaseEmptyException extends RuntimeException {
  public DatabaseEmptyException(String message) {
    super(message);
  }
}
