package com.grao.grao_app.exceptions;

public class InvalidFieldTypeException extends RuntimeException {

    public InvalidFieldTypeException(String mensagem) {
        super(mensagem);
    }
    public InvalidFieldTypeException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
