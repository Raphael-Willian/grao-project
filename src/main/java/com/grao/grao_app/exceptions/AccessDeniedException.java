package com.grao.grao_app.exceptions;

public class AccessDeniedException extends RuntimeException {

    public AccessDeniedException(String mensagem) {
        super(mensagem);
    }
    public AccessDeniedException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
