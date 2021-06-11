package com.devsuperior.dslearnbds.services.exceptions;

public class ForbiddenException extends RuntimeException{

    public ForbiddenException() {
        super("Access denied");
    }
}
