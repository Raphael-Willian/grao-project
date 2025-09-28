package com.grao.grao_app.exceptions;

public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(String mensagem) {
        super(mensagem);
    }
    public InsufficientBalanceException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
