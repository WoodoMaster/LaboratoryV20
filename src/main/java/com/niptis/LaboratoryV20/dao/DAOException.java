package com.niptis.LaboratoryV20.dao;

public class DAOException extends Exception {
    private static final long serialVersionUID = 6843661643502103853L;

    public DAOException() {
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOException(Throwable cause) {
        super(cause);
    }
}
