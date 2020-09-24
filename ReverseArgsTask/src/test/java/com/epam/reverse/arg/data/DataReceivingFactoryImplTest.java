package com.epam.reverse.arg.data;

import com.epam.reverse.args.data.DataReceiverFactory;
import com.epam.reverse.args.data.DataReceivingFactoryImpl;
import com.epam.reverse.args.data.entity.DataReceiver;
import org.junit.Assert;
import org.junit.Test;

public class DataReceivingFactoryImplTest {

    @Test
    public void testCreateShouldCreateEntity() {
        DataReceiverFactory receiverFactory = new DataReceivingFactoryImpl();
        DataReceiver dataReceiver = receiverFactory.create();
        Assert.assertNotNull(dataReceiver);
    }
}
