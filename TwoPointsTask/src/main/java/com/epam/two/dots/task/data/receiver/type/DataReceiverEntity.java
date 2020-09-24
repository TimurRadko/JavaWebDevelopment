package com.epam.two.dots.task.data.receiver.type;

import com.epam.two.dots.task.data.entity.Point;
import com.epam.two.dots.task.data.entity.PointFactory;
import com.epam.two.dots.task.data.entity.PointFactoryImpl;

public class DataReceiverEntity implements DataReceiver {
    private static final int MAX_COUNT_POINT = 2;
    private final Point[] points = new Point[MAX_COUNT_POINT];
    private int countArraySize = 0;
    private final PointFactoryImpl factory;

    public DataReceiverEntity() {
        factory = new PointFactoryImpl();
    }

    @Override
    public void receivePoint(Point point) {
        points[countArraySize] = point;
        countArraySize++;
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
