package com.grao.grao_app.exceptions;

public class EndpointNotFoundException extends RuntimeException {

    public EndpointNotFoundException(String mensagem) {
        super(mensagem);
    }
    public EndpointNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
