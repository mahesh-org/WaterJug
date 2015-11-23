package com.puzzle.waterjug.exception;

public class JarOverFlowException extends RuntimeException {

    private static final long serialVersionUID = -4684072970242893809L;

    private final String message;

    public JarOverFlowException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
