package com.epam.two.dots.task.data.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointFactoryImpl implements PointFactory {
    private static final String EXPLAINING_PHRASE = "Enter coordinate (first coordinate X, second Y):";
    private static final int COORDINATE_COUNT = 2;
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private final int[] creatingPoints = new int[COORDINATE_COUNT];

    public Point create() {
        System.out.println(EXPLAINING_PHRASE);
        int countArraySize = 0;
        while (countArraySize < COORDINATE_COUNT) {
            try {
                String stringNumber = reader.readLine();
                creatingPoints[countArraySize] = Integer.parseInt(stringNumber);
                countArraySize++;
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
        return new Point(creatingPoints[0], creatingPoints[1]);
    }
}
