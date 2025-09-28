package com.grao.grao_app.exceptions;

public class MalformedRequestException extends RuntimeException {

    public MalformedRequestException(String mensagem) {
        super(mensagem);
    }
    public MalformedRequestException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
