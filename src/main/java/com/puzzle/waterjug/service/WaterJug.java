package com.puzzle.waterjug.service;

import com.puzzle.waterjug.exception.NoSolutionPossibleException;
import com.puzzle.waterjug.execution.Solution;
import com.puzzle.waterjug.execution.SolutionFactory;
import com.puzzle.waterjug.model.JugMeasurement;
import com.puzzle.waterjug.model.Sequence;
import com.puzzle.waterjug.util.JugMeasurementValidator;

public class WaterJug {

    private WaterJug() {
    }

    public static String solve(JugMeasurement jugMeasurement) throws NoSolutionPossibleException {

        validate(jugMeasurement);

        Solution solution = SolutionFactory.getSolution(jugMeasurement);

        Sequence sequence = solution.getSequence();

        return sequence.toString();

    }

    public static void validate(JugMeasurement jugMeasurement) throws NoSolutionPossibleException {
        if (!JugMeasurementValidator.isValid(jugMeasurement)) {
            throw new NoSolutionPossibleException("The solution is not possible for this combination of values");
        }
    }

}
