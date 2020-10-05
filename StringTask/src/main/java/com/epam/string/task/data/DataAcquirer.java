package com.epam.string.task.data;

import com.epam.string.task.exception.DataException;

public interface DataAcquirer {
    String getData() throws DataException;
}
