package com.puzzle.waterjug.exception;

public class NoSolutionPossibleException extends Exception {

    private static final long serialVersionUID = 32807307524710400L;

    private final String message;

    public NoSolutionPossibleException(String message) {
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
