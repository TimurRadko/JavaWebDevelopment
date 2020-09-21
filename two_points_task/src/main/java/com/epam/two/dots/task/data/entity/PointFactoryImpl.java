package com.epam.two.dots.task.data.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointFactoryImpl implements PointFactory {
    private static final int MAX_COUNT_POINTS = 2;
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private final int[] creatingPoints = new int[MAX_COUNT_POINTS];
    private int countArraySize = 0;

    public Point createPoint() {
        System.out.println("Enter coordinate (first coordinate X, second Y):");
        int countingCorrectlyEnteringNumbers = 0;
        countArraySize = 0;
        while (countingCorrectlyEnteringNumbers < MAX_COUNT_POINTS) {
            try {
                String numberInString = reader.readLine();
                if (checkingCorrectlyEnteringNumber(numberInString)) {
                    addOneCoordinate(numberInString);
                    countingCorrectlyEnteringNumbers++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return new Point(creatingPoints[0], creatingPoints[1]);
    }

    private boolean checkingCorrectlyEnteringNumber(String numberInString) {
        try {
            Integer.parseInt(numberInString);
        } catch (NumberFormatException e) {
            System.err.println("This is not valid number: " + numberInString);
            System.out.println("Please, enter valid number:");
            return false;
        }
        return true;
    }

    private void addOneCoordinate(String numberInString) {
        creatingPoints[countArraySize] = Integer.parseInt(numberInString);
        countArraySize++;
    }
}
