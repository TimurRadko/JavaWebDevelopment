package com.epam.string.task.data;

import com.epam.string.task.data.acquirer.type.ConsoleDataAcquirer;
import com.epam.string.task.data.acquirer.type.DataAcquirer;
import com.epam.string.task.data.acquirer.type.FileDataAcquirer;

public class DataAcquirerFactoryImpl implements DataAcquirerFactory {
    private static final String FILE_PATH = "src/data/test.txt";

    public DataAcquirer create(DataReadingLocation dataReadingLocation) {
        switch (dataReadingLocation) {
            case CONSOLE:
                return new ConsoleDataAcquirer();
            case FILE:
                return new FileDataAcquirer(FILE_PATH);
            default:
                throw new IllegalArgumentException("Type of acquirer not found");
        }
    }
}
