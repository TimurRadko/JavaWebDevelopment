package com.epam.string.task.data;

import com.epam.string.task.data.acquirer.type.DataAcquirer;

public interface DataAcquirerFactory {
    DataAcquirer create(DataReadingLocation dataReadingLocation);
}
