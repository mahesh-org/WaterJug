package com.puzzle.waterjug.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.puzzle.waterjug.exception.JarOverFlowException;
import com.puzzle.waterjug.exception.JarUnderFlowException;

public class JugTest {

    @Test
    public void testFill() {
        Jug jug = new Jug(5);
        jug.fill();
        assertEquals(5, jug.getQuantity());
    }

    @Test
    public void testEmpty() {
        Jug jug = new Jug(5);
        jug.fill();
        jug.empty();
        assertEquals(0, jug.getQuantity());
    }

    @Test
    public void testAdd() {
        Jug jug = new Jug(5);
        jug.add(3);
        assertEquals(3, jug.getQuantity());
    }

    @Test(expected = JarOverFlowException.class)
    public void testAddForException() {
        Jug jug = new Jug(5);
        jug.add(6);
    }

    @Test
    public void testRemove() {
        Jug jug = new Jug(5);
        jug.fill();
        jug.remove(3);
        assertEquals(2, jug.getQuantity());
    }

    @Test(expected = JarUnderFlowException.class)
    public void testRemoveForException() {
        Jug jug = new Jug(5);
        jug.fill();
        jug.remove(6);
    }

    @Test
    public void testGetQuantity() {
        Jug jug = new Jug(5);
        jug.fill();
        jug.remove(3);
        assertEquals(2, jug.getQuantity());
    }

    @Test
    public void testGetMaximumCapacity() {
        Jug jug = new Jug(5);
        assertEquals(5, jug.getMaximumCapacity());
    }

}
