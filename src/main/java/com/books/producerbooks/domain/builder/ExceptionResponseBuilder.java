package com.books.producerbooks.domain.builder;

import com.books.producerbooks.domain.response.ExceptionResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ExceptionResponseBuilder {

  public ExceptionResponse getExceptionResponse(String message) {
    return ExceptionResponse.builder()
            .timestamp(LocalDateTime.now())
            .message(message)
            .build();
  }

}
