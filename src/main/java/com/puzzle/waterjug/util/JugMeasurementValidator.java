package com.puzzle.waterjug.util;

import com.puzzle.waterjug.model.JugMeasurement;

public class JugMeasurementValidator {

    private JugMeasurementValidator() {
    }

    public static boolean isValid(JugMeasurement jugMeasurement) {

        if (isAnyNegativeNumberIn(jugMeasurement)) {
            return false;
        }

        if (isGcdCanDivideGoalOf(jugMeasurement)) {
            return false;
        }

        if (isGoalGreaterThanContainerCapacity(jugMeasurement)) {
            return false;
        }

        return true;

    }

    private static boolean isAnyNegativeNumberIn(JugMeasurement jugMeasurement) {
        return jugMeasurement.getCapacityA() < 0 || jugMeasurement.getCapacityB() < 0 || jugMeasurement.getGoal() < 0;
    }

    private static boolean isGcdCanDivideGoalOf(JugMeasurement jugMeasurement) {
        int gcd = Gcd.of(jugMeasurement.getCapacityA(), jugMeasurement.getCapacityB());

        return jugMeasurement.getGoal() % gcd != 0;
    }

    private static boolean isGoalGreaterThanContainerCapacity(JugMeasurement jugMeasurement) {
        int largerJugCapacity = jugMeasurement.getCapacityA() > jugMeasurement.getCapacityB()
                ? jugMeasurement.getCapacityA() : jugMeasurement.getCapacityB();

        return jugMeasurement.getGoal() >= largerJugCapacity;
    }
}
