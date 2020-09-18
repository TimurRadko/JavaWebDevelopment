package com.epam.two_dots_task.data.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointFactoryImplementation implements PointFactory {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private final int[] creatingPoints = new int[2];
    private int countArraySize = 0;

    public Point createPoint() {
        System.out.println("Enter coordinate (first coordinate X, second Y):");
        int countingCorrectlyEnteringNumbers = 0;
        countArraySize = 0;
        while (countingCorrectlyEnteringNumbers < 2) {
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
