package com.epam.two_dots_task.data;

import com.epam.two_dots_task.data.entity.Point;
import com.epam.two_dots_task.data.entity.PointFactory;

public interface DataStorage {
    void receivingPoint(Point point);
    DataStorage createDataStorage(DataStorageType type);
    Point[] getPoints();
    PointFactory getPointFactory();
}
