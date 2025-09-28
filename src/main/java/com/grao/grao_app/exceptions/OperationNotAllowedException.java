package com.grao.grao_app.exceptions;

public class OperationNotAllowedException extends RuntimeException {

    public OperationNotAllowedException(String mensagem) {
        super(mensagem);
    }
    public OperationNotAllowedException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
