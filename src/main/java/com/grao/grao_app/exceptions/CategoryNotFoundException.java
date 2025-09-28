package com.grao.grao_app.exceptions;

public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException(String mensagem) {
        super(mensagem);
    }
    public CategoryNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
