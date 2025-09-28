package com.grao.grao_app.exceptions;

public class InvalidPasswordException extends RuntimeException {

    public InvalidPasswordException(String mensagem) {
        super(mensagem);
    }
    public InvalidPasswordException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
