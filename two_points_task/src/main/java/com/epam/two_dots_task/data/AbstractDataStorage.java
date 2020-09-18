package com.epam.two_dots_task.data;

import com.epam.two_dots_task.data.data_storage_type.DBDataStorage;
import com.epam.two_dots_task.data.data_storage_type.EntityDataStorage;
import com.epam.two_dots_task.data.data_storage_type.FileDataStorage;
import com.epam.two_dots_task.data.entity.Point;

public abstract class AbstractDataStorage implements DataStorage {

    @Override
    public DataStorage createDataStorage(DataStorageType type) {

        switch (type) {
            case ENTITY:
                return new EntityDataStorage();
            case DB:
                return new DBDataStorage();
            case FILE:
                return new FileDataStorage();
            default:
                return null;
        }
    }

    public abstract void receivingPoint(Point point);

    public abstract Point[] getPoints();
}
