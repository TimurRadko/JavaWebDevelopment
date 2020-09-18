package com.epam.two_dots_task.data.entity;

import java.util.Objects;

public class Point {
    private int coordinateX;
    private int coordinateY;
    private double distanceFromOrigin;

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.distanceFromOrigin = 0;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double getDistanceFromOrigin() {
        return distanceFromOrigin;
    }

    public void setDistanceFromOrigin(double distanceFromOrigin) {
        this.distanceFromOrigin = distanceFromOrigin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return coordinateX == point.coordinateX &&
                coordinateY == point.coordinateY &&
                Double.compare(point.distanceFromOrigin, distanceFromOrigin) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateX, coordinateY, distanceFromOrigin);
    }

    @Override
    public String toString() {
        return "point with coordinate(" +
                "x=" + coordinateX +
                ", y=" + coordinateY +
                ')';
    }
}
