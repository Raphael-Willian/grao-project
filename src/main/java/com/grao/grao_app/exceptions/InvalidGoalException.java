package com.grao.grao_app.exceptions;

public class InvalidGoalException extends RuntimeException {

    public InvalidGoalException(String mensagem) {
        super(mensagem);
    }
    public InvalidGoalException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

}
