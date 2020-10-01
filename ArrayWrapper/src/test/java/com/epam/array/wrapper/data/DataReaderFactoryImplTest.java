package com.epam.array.wrapper.data;

import com.epam.array.wrapper.data.reader.type.DataReadable;
import com.epam.array.wrapper.data.reader.type.FileDataReader;
import com.epam.array.wrapper.exception.DataException;
import org.junit.Test;

public class DataReaderFactoryImplTest {
    private static final String FAILED_PATH = "src/test/resources/failed.txt";

    @Test(expected = DataException.class)
    public void testReadShouldThrowExceptionWhenFileNotExists() throws DataException {
        DataReadable reader = new FileDataReader(FAILED_PATH);
        int[] actualArray = reader.read();
    }
}
