package com.epam.two.dots.task.data.receiver.type;

import com.epam.two.dots.task.data.entity.Point;
import com.epam.two.dots.task.data.entity.PointFactory;
import com.epam.two.dots.task.data.entity.PointFactoryImpl;

public class EntityDataReceiver implements DataReceiver {
    private final Point[] points = new Point[2];
    private int countArraySize = 0;
    private final PointFactoryImpl factory;

    public EntityDataReceiver() {
        factory = new PointFactoryImpl();
    }

    private void addPointsToArray(Point point) {
        points[countArraySize] = point;
        countArraySize++;
    }

    @Override
    public void receivingPoint(Point point) {
        addPointsToArray(point);
    }

    @Override
    public Point[] getPoints() {
        return points;
    }

    @Override
    public PointFactory getPointFactory() {
        return factory;
    }
}
