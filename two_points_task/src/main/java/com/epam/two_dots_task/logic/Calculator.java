package com.epam.two_dots_task.logic;

import com.epam.two_dots_task.data.entity.Point;

public class Calculator {
    private static volatile Calculator calculator;

    private Calculator() {}

    public static synchronized Calculator getCalculator() {
        Calculator localCalculator = calculator;
        if (localCalculator == null) {
            synchronized (Calculator.class) {
                localCalculator = calculator;
                if (localCalculator == null) {
                    calculator = localCalculator = new Calculator();
                }
            }
        }
        return localCalculator;
    }

    public Point findingCloserToOriginPoint(Point[] points) {
        Point[] pointsWithAddingDistance = addDistanceToEveryPoint(points);
        return (pointsWithAddingDistance[0].getDistanceFromOrigin()
                < pointsWithAddingDistance[1].getDistanceFromOrigin()) ? points[0] : points[1];
    }

    private void determiningDistanceFromOrigin(Point point) {
        double distanceFromOrigin = Math.sqrt(Math.round(point.getCoordinateX()) + Math.round(point.getCoordinateY()));
        point.setDistanceFromOrigin(distanceFromOrigin);
    }

    private Point[] addDistanceToEveryPoint(Point[] points) {
        Point[] pointsWithAddingDistance = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            determiningDistanceFromOrigin(points[i]);
            pointsWithAddingDistance[i] = points[i];
        }
        return pointsWithAddingDistance;
    }
}
