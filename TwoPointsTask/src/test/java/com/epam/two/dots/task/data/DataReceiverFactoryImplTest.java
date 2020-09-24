package com.epam.two.dots.task.data;

import com.epam.two.dots.task.data.receiver.type.DataReceiver;
import org.junit.Assert;
import org.junit.Test;

public class DataReceiverFactoryImplTest {

    @Test
    public void testCreateShouldCreateEntity() {
        DataReceiverFactory dataReceiverFactory = new DataReceiverFactoryImpl();
        DataReceiver dataReceiver = dataReceiverFactory.create();
        Assert.assertNotNull(dataReceiver);
    }
}
