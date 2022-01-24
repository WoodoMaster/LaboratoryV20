package com.niptis.LaboratoryV20.db.exception;


    public class ConnectionPoolException extends Exception {
        private static final long serialVersionUID = -1651863186139215688L;

        public ConnectionPoolException() {
        }

        public ConnectionPoolException(String message) {
            super(message);
        }

        public ConnectionPoolException(String message, Throwable cause) {
            super(message, cause);
        }

        public ConnectionPoolException(Throwable cause) {
            super(cause);
        }

    }

