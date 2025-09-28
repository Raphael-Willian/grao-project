package com.grao.grao_app.exceptions;

public class CategoryAlreadyExistsException extends RuntimeException {

    public CategoryAlreadyExistsException(String mensagem) {
        super(mensagem);
    }
    public CategoryAlreadyExistsException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
