package com.puzzle.waterjug.execution;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.puzzle.waterjug.model.JugMeasurement;

public class SolutionFactoryTest {

    @Test
    public void testGetSolution() {
        JugMeasurement jugMeasurement = new JugMeasurement();
        jugMeasurement.setCapacityA(5);
        jugMeasurement.setCapacityB(3);
        jugMeasurement.setGoal(4);

        Solution solution = SolutionFactory.getSolution(jugMeasurement);
        assertNotNull(solution);
    }

}
