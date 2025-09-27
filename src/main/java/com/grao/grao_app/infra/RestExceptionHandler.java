package com.grao.grao_app.infra;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.http.ResponseEntity;
import com.grao.grao_app.exceptions.*;


@ControllerAdvice //receberá as exceções
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EventNotFoundException.class)
    private ResponseEntity<String> eventNotFoundHandler(EventNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Event Not Found.");
    }
    @ExceptionHandler(InvalidTokenException.class)
    private ResponseEntity<String> invalidTokenException(InvalidTokenException exception) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("O token fornecido é inválido.");
    }
}
