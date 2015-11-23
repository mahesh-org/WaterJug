package com.puzzle.waterjug.execution;

import java.util.ArrayList;
import java.util.List;

import com.puzzle.waterjug.model.Container;
import com.puzzle.waterjug.model.Jug;
import com.puzzle.waterjug.model.JugMeasurement;
import com.puzzle.waterjug.model.Sequence;
import com.puzzle.waterjug.model.Step;

public abstract class SolutionByArithmeticApproach implements Solution {

    private Container containerA;
    private Container containerB;
    private final int goal;

    public SolutionByArithmeticApproach(JugMeasurement jugMeasurement) {
        containerA = new Jug(jugMeasurement.getCapacityA());
        containerB = new Jug(jugMeasurement.getCapacityB());
        goal = jugMeasurement.getGoal();
    }

    @Override
    public final Sequence getSequence() {
        Sequence stepsByFillingContainerAFirst = getStepsByFillingContainerAFirst();
        Sequence stepsByFillingContainerBFirst = getStepsByFillingContainerBFirst();

        if (stepsByFillingContainerAFirst.size() < stepsByFillingContainerBFirst.size()) {
            return stepsByFillingContainerAFirst;
        }

        return stepsByFillingContainerBFirst;
    }

    private final Sequence getStepsByFillingContainerAFirst() {

        List<Step> steps = new ArrayList<Step>();

        ContainerConditions conditions = new ContainerConditions(containerA, containerB, goal);

        while (conditions.isGoalNotReachedYet()) {

            if (conditions.isContainerAEmpty()) {
                fillContainerA();
                addCurrentStepTo(steps);

            } else if (conditions.isContainerAtoBTransferable()) {
                transferAtoB();
                addCurrentStepTo(steps);

            } else if (conditions.isContainerBFullWithSomeAmountInA()) {
                emptyContainerB();
                addCurrentStepTo(steps);
            }
        }

        emptyBothContainers();

        return new Sequence(steps);
    }

    private final Sequence getStepsByFillingContainerBFirst() {

        List<Step> steps = new ArrayList<Step>();

        ContainerConditions conditions = new ContainerConditions(containerA, containerB, goal);

        while (conditions.isGoalNotReachedYet()) {

            if (conditions.isContainerBEmpty()) {
                fillContainerB();
                addCurrentStepTo(steps);

            } else if (conditions.isContainerBtoATransferable()) {
                transferBtoA();
                addCurrentStepTo(steps);

            } else if (conditions.isContainerAFullWithSomeAmountInB()) {
                emptyContainerA();
                addCurrentStepTo(steps);
            }
        }

        emptyBothContainers();

        return new Sequence(steps);
    }

    private void addCurrentStepTo(List<Step> steps) {
        steps.add(new Step(containerA.getQuantity(), containerB.getQuantity()));
    }

    protected Container getContainerA() {
        return containerA;
    }

    protected Container getContainerB() {
        return containerB;
    }

    public abstract void fillContainerA();

    public abstract void fillContainerB();

    public abstract void emptyContainerA();

    public abstract void emptyContainerB();

    public abstract void transferAtoB();

    public abstract void transferBtoA();

    public abstract void emptyBothContainers();

}
