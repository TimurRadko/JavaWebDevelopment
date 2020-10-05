package com.epam.string.task.data;

import com.epam.string.task.exception.DataException;
import org.junit.Assert;
import org.junit.Test;

public class FileDataAcquirerTest {
    private static final String FILE_PATH = "src/test/resources/test.txt";
    private static final String EXPECTED_DATA = "12345abcde";
    private static final String FAILED_FILE_PATH = "src/test/resources/fail.txt";

    @Test
    public void testGetDataShouldReceiveCorrectDataWhenFileExists() throws DataException {
        DataAcquirer fileDataAcquirer = new FileDataAcquirer(FILE_PATH);
        String data = fileDataAcquirer.getData();
        Assert.assertEquals(EXPECTED_DATA, data);
    }

    @Test(expected = DataException.class)
    public void testCreateShouldThrowExceptionWhenFileNotExists() throws DataException {
        DataAcquirer fileDataAcquirer = new FileDataAcquirer(FAILED_FILE_PATH);
        fileDataAcquirer.getData();
    }
}
