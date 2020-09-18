package com.epam.two_dots_task.data.data_storage_type;

import com.epam.two_dots_task.data.AbstractDataStorage;
import com.epam.two_dots_task.data.entity.Point;
import com.epam.two_dots_task.data.entity.PointFactory;
import com.epam.two_dots_task.data.entity.PointFactoryImplementation;

public class EntityDataStorage extends AbstractDataStorage {
    private final Point[] points = new Point[2];
    private int countArraySize = 0;
    private final PointFactoryImplementation factory;

    public EntityDataStorage() {
        factory = new PointFactoryImplementation();
    }

    public void receivingPoint(Point point) {
        addPointsToArray(point);
    }

    private void addPointsToArray(Point point) {
        points[countArraySize] = point;
        countArraySize++;
    }

    @Override
    public PointFactory getPointFactory() {
        return factory;
    }

    @Override
    public Point[] getPoints() {
        return points;
    }
}
