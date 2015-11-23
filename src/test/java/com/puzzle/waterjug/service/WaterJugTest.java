package com.puzzle.waterjug.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.puzzle.waterjug.exception.NoSolutionPossibleException;
import com.puzzle.waterjug.model.JugMeasurement;

public class WaterJugTest {

    @Test
    public void testSolve() throws NoSolutionPossibleException {
        JugMeasurement jugMeasurement = new JugMeasurement();

        jugMeasurement.setCapacityA(5);
        jugMeasurement.setCapacityB(3);
        jugMeasurement.setGoal(3);

        assertNotNull(WaterJug.solve(jugMeasurement));
    }

    @Test(expected = NoSolutionPossibleException.class)
    public void testSolveForException() throws NoSolutionPossibleException {
        JugMeasurement jugMeasurement = new JugMeasurement();

        jugMeasurement.setCapacityA(5);
        jugMeasurement.setCapacityB(3);
        jugMeasurement.setGoal(8);

        WaterJug.solve(jugMeasurement);
    }

    @Test(expected = NoSolutionPossibleException.class)
    public void testValidateForNegativeNumbers() throws NoSolutionPossibleException {
        JugMeasurement jugMeasurement = new JugMeasurement();

        jugMeasurement.setCapacityA(5);
        jugMeasurement.setCapacityB(-3);
        jugMeasurement.setGoal(4);

        WaterJug.solve(jugMeasurement);
    }

}
