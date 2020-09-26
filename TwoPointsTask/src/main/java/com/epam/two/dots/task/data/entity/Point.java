package com.epam.two.dots.task.data.entity;

import java.util.Objects;

public class Point {
    private final int coordinateX;
    private final int coordinateY;

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return coordinateX == point.coordinateX &&
                coordinateY == point.coordinateY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateX, coordinateY);
    }

    @Override
    public String toString() {
        return "point with coordinate(x=" + coordinateX +
                ", y=" + coordinateY +
                ')';
    }
}
