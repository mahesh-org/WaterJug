package com.puzzle.waterjug.model;

import java.util.List;

public class Sequence {
    private List<Step> steps;

    public Sequence(List<Step> steps) {
        this.steps = steps;
    }

    public int size() {
        return steps.size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Step step : steps) {
            builder.append(step + "\n");
        }
        return builder.toString();
    }
}
