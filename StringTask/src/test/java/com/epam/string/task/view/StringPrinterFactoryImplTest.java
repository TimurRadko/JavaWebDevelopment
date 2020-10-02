package com.epam.string.task.view;

import com.epam.string.task.view.type.ConsoleStringPrinter;
import com.epam.string.task.view.type.StringPrinter;
import com.epam.string.task.view.type.StringPrinterType;
import org.junit.Assert;
import org.junit.Test;

public class StringPrinterFactoryImplTest {
    private static final StringPrinter EXPECTED_ENTITY = new ConsoleStringPrinter();

    @Test
    public void testCreateShouldCreateEntity() {
        StringPrinterFactory factory = new StringPrinterFactoryImpl();
        StringPrinter printer = factory.create(StringPrinterType.CONSOLE);
        Assert.assertNotNull(printer);
    }

    @Test
    public void testCreateShouldCreateCorrectEntity() {
        StringPrinterFactory factory = new StringPrinterFactoryImpl();
        StringPrinter printer = factory.create(StringPrinterType.CONSOLE);
        Assert.assertEquals(EXPECTED_ENTITY.getClass(), printer.getClass());
    }
}
