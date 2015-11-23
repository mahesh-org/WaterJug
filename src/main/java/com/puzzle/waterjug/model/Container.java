package com.puzzle.waterjug.model;

public interface Container {
    void fill();

    void empty();

    void add(int addAmount);

    void remove(int removeAmount);

    int getQuantity();

    int getMaximumCapacity();
}
