package com.epam.array.wrapper.data;

import com.epam.array.wrapper.data.reader.type.*;

public class DataReaderFactoryImpl implements DataReaderFactory {
    private static final String FILE_PATH = "src/main/java/com/epam/array/wrapper/input.txt";

    @Override
    public DataReadable create(DataReadingLocation readingLocation) {
        switch (readingLocation) {
            case CONSOLE:
                return new ConsoleDataReader();
            case FILE:
                return new FileDataReader(FILE_PATH);
            case RANDOM:
                return new RandomDataReader();
            default:
                throw new IllegalArgumentException("Not found array wrapper type");
        }
    }
}
