package com.epam.string.task.data.factory;

import org.junit.Assert;
import org.junit.Test;

public class FileDataAcquirerFactoryTest {
    private final static DataAcquirerFactory EXPECTED_DATA_ACQUIRER = new FileDataAcquirerFactory();

    @Test
    public void testCreateShouldCreateEntity() {
        DataAcquirerFactory factory = new FileDataAcquirerFactory();
        Assert.assertNotNull(factory);
        Assert.assertEquals(EXPECTED_DATA_ACQUIRER.getClass(), factory.getClass());
    }
}
