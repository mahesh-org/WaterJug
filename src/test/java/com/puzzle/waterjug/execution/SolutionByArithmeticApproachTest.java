package com.puzzle.waterjug.execution;

import static org.junit.Assert.*;

import org.junit.Test;

import com.puzzle.waterjug.model.JugMeasurement;

public class SolutionByArithmeticApproachTest {

    @Test
    public void testGetSequence() {
        JugMeasurement jugMeasurement = new JugMeasurement();
        jugMeasurement.setCapacityA(3);
        jugMeasurement.setCapacityB(5);
        jugMeasurement.setGoal(4);
        
        SolutionByArithmeticApproach solution = new WaterJugSolutionByArithmeticApproach(jugMeasurement);
        
        assertNotNull(solution.getSequence());
    }
    
    @Test
    public void testGetSequenceByFillingAFirst() {
        JugMeasurement jugMeasurement = new JugMeasurement();
        jugMeasurement.setCapacityA(5);
        jugMeasurement.setCapacityB(3);
        jugMeasurement.setGoal(4);
        
        SolutionByArithmeticApproach solution = new WaterJugSolutionByArithmeticApproach(jugMeasurement);
        
        assertNotNull(solution.getSequence());
    }

}
