package com.grao.grao_app.exceptions;

public class DuplicateTransactionException extends RuntimeException {

    public DuplicateTransactionException(String mensagem) {
        super(mensagem);
    }
    public DuplicateTransactionException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
