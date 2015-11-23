package com.puzzle.waterjug.execution;

import com.puzzle.waterjug.model.Container;

public class ContainerConditions {

    private Container containerA;
    private Container containerB;
    private int goal;

    public ContainerConditions(Container containerA, Container containerB, int goal) {
        this.containerA = containerA;
        this.containerB = containerB;
        this.goal = goal;
    }

    public boolean isGoalNotReachedYet() {
        return !(containerA.getQuantity() == goal || containerB.getQuantity() == goal);
    }

    public boolean isContainerAEmpty() {
        return containerA.getQuantity() == 0;
    }

    public boolean isContainerBEmpty() {
        return containerB.getQuantity() == 0;
    }

    public boolean isContainerAtoBTransferable() {
        return containerA.getQuantity() > 0 && containerB.getQuantity() != containerB.getMaximumCapacity();
    }

    public boolean isContainerBtoATransferable() {
        return containerB.getQuantity() > 0 && containerA.getQuantity() != containerA.getMaximumCapacity();
    }

    public boolean isContainerAFullWithSomeAmountInB() {
        return containerB.getQuantity() > 0 && containerA.getQuantity() == containerA.getMaximumCapacity();
    }

    public boolean isContainerBFullWithSomeAmountInA() {
        return containerA.getQuantity() > 0 && containerB.getQuantity() == containerB.getMaximumCapacity();
    }

}
