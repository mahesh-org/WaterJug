package com.puzzle.waterjug.execution;

import com.puzzle.waterjug.model.JugMeasurement;

public class SolutionFactory {

    private SolutionFactory() {
    }

    public static Solution getSolution(JugMeasurement jugMeasurement) {
        return new WaterJugSolutionByArithmeticApproach(jugMeasurement);
    }
}
