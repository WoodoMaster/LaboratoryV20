package com.niptis.LaboratoryV20.service;

public class ServiceException extends Exception{

    private static final long serialVersionUID = 7964000571075610683L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}
