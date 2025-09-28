package com.grao.grao_app.exceptions;

public class TransactionNotFoundException extends RuntimeException {

    public TransactionNotFoundException(String mensagem) {
        super(mensagem);
    }
    public TransactionNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
