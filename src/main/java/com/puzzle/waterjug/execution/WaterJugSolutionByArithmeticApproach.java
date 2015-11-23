package com.puzzle.waterjug.execution;

import com.puzzle.waterjug.model.JugMeasurement;

public class WaterJugSolutionByArithmeticApproach extends SolutionByArithmeticApproach {

    public WaterJugSolutionByArithmeticApproach(JugMeasurement jugMeasurement) {
        super(jugMeasurement);
    }

    @Override
    public void fillContainerA() {
        getContainerA().fill();
    }

    @Override
    public void fillContainerB() {
        getContainerB().fill();

    }

    @Override
    public void emptyContainerA() {
        getContainerA().empty();
    }

    @Override
    public void emptyContainerB() {
        getContainerB().empty();
    }

    @Override
    public void transferAtoB() {

        int quantityOfContainerA = getContainerA().getQuantity();

        int quantityContainerBCanAccomodate = getContainerB().getMaximumCapacity() - getContainerB().getQuantity();

        int transferAmountFromAtoB = (quantityOfContainerA < quantityContainerBCanAccomodate) ? quantityOfContainerA
                : quantityContainerBCanAccomodate;

        getContainerA().remove(transferAmountFromAtoB);
        getContainerB().add(transferAmountFromAtoB);

    }

    @Override
    public void transferBtoA() {

        int quantityOfContainerB = getContainerB().getQuantity();

        int quantityContainerACanAccomodate = getContainerA().getMaximumCapacity() - getContainerA().getQuantity();

        int transferAmountFromBtoA = (quantityOfContainerB < quantityContainerACanAccomodate) ? quantityOfContainerB
                : quantityContainerACanAccomodate;

        getContainerB().remove(transferAmountFromBtoA);
        getContainerA().add(transferAmountFromBtoA);
    }

    @Override
    public void emptyBothContainers() {
        getContainerA().empty();
        getContainerB().empty();
    }
}
