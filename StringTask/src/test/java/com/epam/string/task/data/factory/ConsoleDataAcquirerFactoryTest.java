package com.epam.string.task.data.factory;

import org.junit.Assert;
import org.junit.Test;

public class ConsoleDataAcquirerFactoryTest {
    private final static DataAcquirerFactory EXPECTED_DATA_ACQUIRER = new ConsoleDataAcquirerFactory();

    @Test
    public void testCreateShouldCreateEntity() {
        DataAcquirerFactory factory = new ConsoleDataAcquirerFactory();
        Assert.assertNotNull(factory);
        Assert.assertEquals(EXPECTED_DATA_ACQUIRER.getClass(), factory.getClass());
    }
}
