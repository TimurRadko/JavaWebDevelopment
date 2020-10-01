package com.epam.array.wrapper.data.reader.type;

import com.epam.array.wrapper.exception.DataException;
import org.junit.Assert;
import org.junit.Test;

public class FileDataReaderTest {
    private static final String FILE_PATH_HORIZONTAL = "src/test/resources/horizontal_input.txt";
    private static final String FILE_PATH_VERTICAL = "src/test/resources/vertical_input.txt";
    private static final int[] EXPECTED_ARRAY = {1, 2, 3, 4};

    @Test
    public void testReadShouldCorrectlyReadingWhenFileExistsAndDataVertical() throws DataException {
        DataReadable reader = new FileDataReader(FILE_PATH_VERTICAL);
        int[] actualArray = reader.read();
        Assert.assertArrayEquals(EXPECTED_ARRAY, actualArray);
    }

    @Test
    public void testReadShouldCorrectlyReadingWhenFileExistsAndDataHorizontal() throws DataException {
        DataReadable reader = new FileDataReader(FILE_PATH_HORIZONTAL);
        int[] actualArray = reader.read();
        Assert.assertArrayEquals(EXPECTED_ARRAY, actualArray);
    }
}
