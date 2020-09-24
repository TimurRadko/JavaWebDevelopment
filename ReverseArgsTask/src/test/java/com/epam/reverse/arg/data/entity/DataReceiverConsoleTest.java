package com.epam.reverse.arg.data.entity;

import com.epam.reverse.args.data.entity.DataReceiverConsole;
import com.epam.reverse.args.data.entity.DataReceiver;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DataReceiverConsoleTest {
    private final String[] actualDataArray = {"1", "2", "3", "4"};
    private final String[] expectedDataArray = {"1", "2", "3", "4"};

    @Test
    public void testReceiveDataShouldReceiveCorrectData() {
        DataReceiver dataReceiver = new DataReceiverConsole();
        dataReceiver.receiveData(actualDataArray);
        List<String> actualDataList = dataReceiver.getReceiveData();
        Assert.assertArrayEquals(expectedDataArray, actualDataList.toArray());
    }
}
