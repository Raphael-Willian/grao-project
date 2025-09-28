package com.grao.grao_app.exceptions;

public class BalanceExceededException extends RuntimeException {

    public BalanceExceededException(String mensagem) {
        super(mensagem);
    }
    public BalanceExceededException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
