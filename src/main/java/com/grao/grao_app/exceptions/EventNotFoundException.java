package com.grao.grao_app.exceptions;

public class EventNotFoundException extends RuntimeException{

    public EventNotFoundException(String mensagem) {
        super(mensagem);
    }
    public EventNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
