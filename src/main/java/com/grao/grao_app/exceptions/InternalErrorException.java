package com.grao.grao_app.exceptions;

public class InternalErrorException extends RuntimeException {

    public InternalErrorException(String mensagem) {
        super(mensagem);
    }
    public InternalErrorException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
