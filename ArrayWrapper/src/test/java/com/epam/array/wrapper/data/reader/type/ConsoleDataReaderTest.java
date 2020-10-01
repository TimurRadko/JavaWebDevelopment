package com.epam.array.wrapper.data.reader.type;

import com.epam.array.wrapper.exception.DataException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class ConsoleDataReaderTest {
    private static final String EXPECTED_DATA = "1\n2\n3\n4\nExit";
    private static final int[] EXPECTED_ARRAY = {1, 2, 3, 4};
    private static final String FAILED_DATA = "Hello";

    @Test
    public void testReadShouldCorrectlyReadingFromConsole() throws DataException {
        DataReadable reader = new ConsoleDataReader();
        getTestingString(EXPECTED_DATA);
        int[] actualArray = reader.read();
        Assert.assertArrayEquals(EXPECTED_ARRAY, actualArray);
    }

    @Test(expected = NumberFormatException.class)
    public void testReadShouldThrowExceptionWhenUserEnterInvalidData() throws DataException {
        DataReadable reader = new ConsoleDataReader();
        getTestingString(FAILED_DATA);
        int[] actualArray = reader.read();
    }

    private void getTestingString(String data) {
        ByteArrayInputStream is = new ByteArrayInputStream(data.getBytes());
        System.setIn(is);
    }
}
