package com.grao.grao_app.exceptions;

public class ExpiredTokenException extends RuntimeException {

    public ExpiredTokenException(String mensagem) {
        super(mensagem);
    }
    public ExpiredTokenException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
