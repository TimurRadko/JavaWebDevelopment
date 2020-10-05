package com.epam.string.task.view.factory;

import org.junit.Assert;
import org.junit.Test;

public class FileStringPrinterFactoryTest {
    private final static StringPrinterFactory EXPECTED_DATA_ACQUIRER = new FileStringPrinterFactory();

    @Test
    public void testCreateShouldCreateEntity() {
        StringPrinterFactory factory = new FileStringPrinterFactory();
        Assert.assertNotNull(factory);
        Assert.assertEquals(EXPECTED_DATA_ACQUIRER.getClass(), factory.getClass());
    }
}
