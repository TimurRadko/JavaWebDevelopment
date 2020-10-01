package com.epam.array.wrapper.data.reader.type;

import com.epam.array.wrapper.exception.DataException;

public interface DataReadable {
    int[] read() throws DataException;
}
