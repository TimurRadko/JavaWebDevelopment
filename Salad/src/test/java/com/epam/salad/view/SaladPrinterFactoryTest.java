package com.epam.salad.view;

import com.epam.salad.view.printer.type.SaladPrinter;
import org.junit.Assert;
import org.junit.Test;

public class SaladPrinterFactoryTest {

    @Test
    public void testCreateShouldReturnCreatingPrinterFactory() {
        SaladPrinterFactory saladPrinterFactory = new SaladPrinterFactoryImpl();
        Assert.assertNotNull(saladPrinterFactory);
    }

    @Test
    public void testCreateShouldReturnSaladPrinter() {
        SaladPrinterFactory saladPrinterFactory = new SaladPrinterFactoryImpl();
        SaladPrinter saladPrinter = saladPrinterFactory.create();
        Assert.assertNotNull(saladPrinter);
    }
}
