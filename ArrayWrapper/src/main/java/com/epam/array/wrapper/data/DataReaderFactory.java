package com.epam.array.wrapper.data;

import com.epam.array.wrapper.data.reader.type.DataReadable;
import com.epam.array.wrapper.data.reader.type.DataReadingLocation;

public interface DataReaderFactory {
    DataReadable create(DataReadingLocation readingLocation);
}
