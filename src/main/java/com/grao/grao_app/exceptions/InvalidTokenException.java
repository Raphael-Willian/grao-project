package com.grao.grao_app.exceptions;

public class InvalidTokenException extends RuntimeException {

    public InvalidTokenException(String mensagem) {
        super(mensagem);
    }
    public InvalidTokenException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
