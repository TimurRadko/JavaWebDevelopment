package com.epam.two.dots.task.data.receiver.type;

import com.epam.two.dots.task.data.entity.Point;
import com.epam.two.dots.task.data.entity.PointFactory;

public interface DataReceiver {
    void receivingPoint(Point point);
    Point[] getPoints();
    PointFactory getPointFactory();
}
