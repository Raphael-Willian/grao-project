package com.grao.grao_app.exceptions;

public class InvalidDateException extends RuntimeException {

    public InvalidDateException(String mensagem) {
        super(mensagem);
    }
    public InvalidDateException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
