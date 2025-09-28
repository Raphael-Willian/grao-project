package com.grao.grao_app.exceptions;

public class ExternalTimeoutException extends RuntimeException {

    public ExternalTimeoutException(String mensagem) {
        super(mensagem);
    }
    public ExternalTimeoutException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
