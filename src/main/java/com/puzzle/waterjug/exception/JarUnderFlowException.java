package com.puzzle.waterjug.exception;

public class JarUnderFlowException extends RuntimeException {

    private static final long serialVersionUID = -5190997585078935961L;

    private final String message;

    public JarUnderFlowException(String message) {
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
