package com.epam.string.task.data.acquirer.type;

import com.epam.string.task.exception.DataException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class ConsoleDataAcquirerTest {
    private static final String EXPECTED_DATA = "12345abcde";

    @Test
    public void testGetDataShouldReceiveCorrectData() throws DataException {
        DataAcquirer consoleDataAcquirer = new ConsoleDataAcquirer();
        String receivedData = "12345abcde";
        getTestingString(receivedData);
        consoleDataAcquirer.getData();
        Assert.assertEquals(EXPECTED_DATA, receivedData);
    }

    private void getTestingString(String data) {
        ByteArrayInputStream is = new ByteArrayInputStream(data.getBytes());
        System.setIn(is);
    }
}
