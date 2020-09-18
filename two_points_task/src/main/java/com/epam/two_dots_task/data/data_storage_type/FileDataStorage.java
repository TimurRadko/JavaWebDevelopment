package com.epam.two_dots_task.data.data_storage_type;

import com.epam.two_dots_task.data.AbstractDataStorage;
import com.epam.two_dots_task.data.entity.Point;
import com.epam.two_dots_task.data.entity.PointFactory;

public class FileDataStorage extends AbstractDataStorage {

    @Override
    public void receivingPoint(Point point) {
        throw new UnsupportedOperationException("This operation don't available yet");
    }

    @Override
    public Point[] getPoints() {
        throw new UnsupportedOperationException("This operation don't available yet");
    }

    @Override
    public PointFactory getPointFactory() {
        throw new UnsupportedOperationException("This operation don't available yet");
    }
}
