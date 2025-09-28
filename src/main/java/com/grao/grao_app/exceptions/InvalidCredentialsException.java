package com.grao.grao_app.exceptions;

public class InvalidCredentialsException extends RuntimeException {

    public InvalidCredentialsException(String mensagem) {
        super(mensagem);
    }
    public InvalidCredentialsException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
