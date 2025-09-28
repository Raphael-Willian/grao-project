package com.grao.grao_app.exceptions;

public class MissingFieldException extends RuntimeException {

    public MissingFieldException(String mensagem) {
        super(mensagem);
    }
    public MissingFieldException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
