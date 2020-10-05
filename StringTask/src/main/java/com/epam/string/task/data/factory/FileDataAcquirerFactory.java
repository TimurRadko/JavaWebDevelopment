package com.epam.string.task.data.factory;

import com.epam.string.task.data.DataAcquirer;
import com.epam.string.task.data.FileDataAcquirer;

public class FileDataAcquirerFactory implements DataAcquirerFactory {
    private static final String FILE_PATH = "src/data/test.txt";

    @Override
    public DataAcquirer create() {
        return new FileDataAcquirer(FILE_PATH);
    }
}
