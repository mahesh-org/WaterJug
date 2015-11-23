package com.puzzle.waterjug.model;

import com.puzzle.waterjug.exception.JarOverFlowException;
import com.puzzle.waterjug.exception.JarUnderFlowException;

public class Jug implements Container {

    private final int maximumCapacity;

    private int quantity;

    public Jug(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    @Override
    public void fill() {
        quantity = maximumCapacity;
    }

    @Override
    public void empty() {
        quantity = 0;
    }

    @Override
    public void add(int addAmount) {
        if ((quantity + addAmount) <= maximumCapacity) {
            quantity = quantity + addAmount;
        } else {
            throw new JarOverFlowException("Cannot add " + addAmount + " units of water to this jug");
        }
    }

    @Override
    public void remove(int removeAmount) {
        if ((quantity - removeAmount) >= 0) {
            quantity = quantity - removeAmount;
        } else {
            throw new JarUnderFlowException("Cannot remove " + removeAmount + " units of water from this jug");
        }
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public int getMaximumCapacity() {
        return maximumCapacity;
    }
}
