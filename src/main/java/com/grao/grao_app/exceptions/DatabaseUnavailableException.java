package com.grao.grao_app.exceptions;

public class DatabaseUnavailableException extends RuntimeException {

    public DatabaseUnavailableException(String mensagem) {
        super(mensagem);
    }
    public DatabaseUnavailableException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
