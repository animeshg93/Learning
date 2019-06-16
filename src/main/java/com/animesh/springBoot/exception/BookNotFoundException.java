package com.animesh.springBoot.exception;

public class BookNotFoundException extends Exception {

    public BookNotFoundException(){
        super();
    }

    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
