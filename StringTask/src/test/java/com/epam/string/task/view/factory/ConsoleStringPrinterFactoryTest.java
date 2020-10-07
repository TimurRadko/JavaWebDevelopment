package com.epam.string.task.view.factory;

import org.junit.Assert;
import org.junit.Test;

public class ConsoleStringPrinterFactoryTest {
    private final static StringPrinterFactory EXPECTED_DATA_ACQUIRER = new ConsoleStringPrinterFactory();

    @Test
    public void testCreateShouldCreateEntity() {
        StringPrinterFactory factory = new ConsoleStringPrinterFactory();
        Assert.assertNotNull(factory);
        Assert.assertEquals(EXPECTED_DATA_ACQUIRER.getClass(), factory.getClass());
    }
}
