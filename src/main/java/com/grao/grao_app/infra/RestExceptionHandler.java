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
    //Exceptions Autorização e Autenticação
    @ExceptionHandler(InvalidTokenException.class)
    private ResponseEntity<String> invalidTokenException(InvalidTokenException exception) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("O token fornecido é inválido.");
    }
    @ExceptionHandler(ExpiredTokenException.class)
    private ResponseEntity<String> expiredTokenException(ExpiredTokenException exception) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("A sessão expirou. Faça login novamente.");
    }
    @ExceptionHandler(InvalidCredentialsException.class)
    private ResponseEntity<String> invalidCredentialsException(InvalidCredentialsException exception) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("E-mail ou senha incorretos.");
    }
    @ExceptionHandler(AccessDeniedException.class)
    private ResponseEntity<String> accessDeniedException(AccessDeniedException exception) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Você não tem permissão para acessar este recurso.");
    }
    //Excepitons Users:
    @ExceptionHandler(UserAlreadyExistsException.class)
    private ResponseEntity<String> userAlreadyExistsException(UserAlreadyExistsException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Já existe um usuário cadastrado com este e-mail.");
    }
    @ExceptionHandler(UserNotFoundException.class)
    private ResponseEntity<String> userNotFoundException(UserNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não encontrado.");
    }
    @ExceptionHandler(InvalidPasswordException.class)
    private ResponseEntity<String> invalidPasswordException(InvalidPasswordException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("A senha não atende aos requisitos mínimos de segurança.");
    }
    //Exceptions Despesas e Receitas:
    @ExceptionHandler(TransactionNotFoundException.class)
    private ResponseEntity<String> transacionNotFoundException(TransactionNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Transação não encontrada.");
    }
    @ExceptionHandler(InvalidAmountException.class)
    private ResponseEntity<String> invalidAmountException(InvalidAmountException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O valor deve ser maior que zero.");
    }
    @ExceptionHandler(InvalidDateException.class)
    private ResponseEntity<String> invalidDateException(InvalidDateException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("A data informada é inválida.");
    }
    @ExceptionHandler(CategoryNotFoundException.class)
    private ResponseEntity<String> categoryNotFoundException(CategoryNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Categoria não encontrada.");
    }
}
