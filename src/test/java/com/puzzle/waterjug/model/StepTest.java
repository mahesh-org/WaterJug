package com.puzzle.waterjug.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class StepTest {

    @Test
    public void testStep() {
        Step step = new Step(4, 0);
        assertNotNull(step);
    }

    @Test
    public void testToString() {
        assertEquals("{A=4,B=0}", new Step(4, 0).toString());
    }

}
