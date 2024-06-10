package com.todo.application.exception;

public class DuplicateEntryException extends RuntimeException{

    public DuplicateEntryException(String message){
        super(message);
    }
}
