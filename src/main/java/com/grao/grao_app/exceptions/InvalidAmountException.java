package com.grao.grao_app.exceptions;

public class InvalidAmountException extends RuntimeException {

    public InvalidAmountException(String mensagem) {
        super(mensagem);
    }
    public InvalidAmountException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
