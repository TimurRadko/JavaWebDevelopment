package com.epam.two.dots.task.data.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointFactoryImpl implements PointFactory {
    private static final int COORDINATE_COUNT = 2;
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private final int[] creatingPoints = new int[COORDINATE_COUNT];
    private int countArraySize = 0;

    public Point createPoint() {
        System.out.println("Enter coordinate (first coordinate X, second Y):");
        countArraySize = 0;
        while (countArraySize < COORDINATE_COUNT) {
            try {
                String stringNumber = reader.readLine();
                addOneCoordinate(stringNumber);
                countArraySize++;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new Point(creatingPoints[0], creatingPoints[1]);
    }

    private void addOneCoordinate(String numberInString) {
        creatingPoints[countArraySize] = Integer.parseInt(numberInString);
    }
}
