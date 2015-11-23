package com.puzzle.waterjug.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SequenceTest {

    @Test
    public void testSequence() {
        List<Step> steps = new ArrayList<Step>();
        steps.add(new Step(4, 0));
        steps.add(new Step(4, 3));
        Sequence sequence = new Sequence(steps);
        assertNotNull(sequence);
    }

    @Test
    public void testSize() {
        List<Step> steps = new ArrayList<Step>();
        steps.add(new Step(4, 0));
        steps.add(new Step(4, 3));
        Sequence sequence = new Sequence(steps);
        assertEquals(2, sequence.size());
    }

    @Test
    public void testToString() {
        List<Step> steps = new ArrayList<Step>();
        steps.add(new Step(4, 0));
        steps.add(new Step(4, 3));
        Sequence sequence = new Sequence(steps);
        assertNotNull(sequence.toString());
    }

}
