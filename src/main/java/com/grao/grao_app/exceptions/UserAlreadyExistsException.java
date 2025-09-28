package com.grao.grao_app.exceptions;

public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException(String mensagem) {
        super(mensagem);
    }
    public UserAlreadyExistsException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
