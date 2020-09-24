package com.epam.two.dots.task.view;

import com.epam.two.dots.task.view.type.Printer;
import org.junit.Assert;
import org.junit.Test;

public class PrinterFactoryImplTest {

    @Test
    public void testCreateShouldReturnCorrectEntity() {
        PrinterFactory printerFactory = new PrinterFactoryImpl();
        Printer printer = printerFactory.create();
        Assert.assertNotNull(printer);
    }
}
