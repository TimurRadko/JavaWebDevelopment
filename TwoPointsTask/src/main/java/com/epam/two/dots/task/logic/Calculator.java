package com.epam.two.dots.task.logic;

import com.epam.two.dots.task.data.entity.Point;

public class Calculator {

    public Point findCloserToOrigin(Point[] points) {
        Point firstPoint = points[0];
        Point secondPoint = points[1];
        return (determineDistanceFromOrigin(firstPoint)
                < determineDistanceFromOrigin(secondPoint)) ? firstPoint : secondPoint;
    }

    private double determineDistanceFromOrigin(Point point) {
        int coordinateX = point.getCoordinateX();
        int coordinateY = point.getCoordinateY();
        return Math.sqrt(Math.round(coordinateX) + Math.round(coordinateY));
    }
}
