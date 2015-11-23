package com.puzzle.waterjug.main;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.puzzle.waterjug.exception.NoSolutionPossibleException;
import com.puzzle.waterjug.model.JugMeasurement;
import com.puzzle.waterjug.service.WaterJug;
import com.puzzle.waterjug.util.UserMessages;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    private Main() {
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int capacityA;
        int capacityB;
        int goal;

        JugMeasurement jugMeasurement = null;
        String solution = "";

        try {
            LOGGER.info(UserMessages.get("enter.message.containerA"));
            capacityA = in.nextInt();

            LOGGER.info(UserMessages.get("enter.message.containerB"));
            capacityB = in.nextInt();

            LOGGER.info(UserMessages.get("enter.message.goal"));
            goal = in.nextInt();

            jugMeasurement = new JugMeasurement();
            jugMeasurement.setCapacityA(capacityA);
            jugMeasurement.setCapacityB(capacityB);
            jugMeasurement.setGoal(goal);

            solution = WaterJug.solve(jugMeasurement);

            LOGGER.info("\n" + UserMessages.get("solution.message.header"));

            LOGGER.info(UserMessages.get("message.start"));
            LOGGER.info(solution);
            LOGGER.info(UserMessages.get("message.stop"));

        } catch (NoSolutionPossibleException ex) {

            LOGGER.error(ex.getMessage(), ex);

        } finally {

            in.close();
        }

    }
}
