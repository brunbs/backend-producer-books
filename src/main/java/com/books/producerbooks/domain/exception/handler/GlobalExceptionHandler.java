package com.books.producerbooks.domain.exception.handler;

import com.books.producerbooks.domain.builder.ExceptionResponseBuilder;
import com.books.producerbooks.domain.exception.KafkaException;
import com.books.producerbooks.domain.response.ExceptionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.books.producerbooks.util.ConstantUtils.INTERNAL_SERVER_ERROR;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private ExceptionResponseBuilder responseBuilder;

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ExceptionResponse handleInternalServerError(Exception exception) {

        ExceptionResponse exceptionResponse =
                responseBuilder.getExceptionResponse(INTERNAL_SERVER_ERROR);

        return exceptionResponse;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ExceptionResponse handleKafkaException(KafkaException exception) {

        ExceptionResponse exceptionResponse =
                responseBuilder.getExceptionResponse(INTERNAL_SERVER_ERROR);

        return exceptionResponse;
    }


}
