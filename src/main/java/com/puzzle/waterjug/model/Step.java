package com.puzzle.waterjug.model;

public class Step {
    private int aContent;
    private int bContent;

    public Step(int aContent, int bContent) {
        this.aContent = aContent;
        this.bContent = bContent;
    }

    @Override
    public String toString() {
        return "{A=" + aContent + ",B=" + bContent + "}";
    }

}
