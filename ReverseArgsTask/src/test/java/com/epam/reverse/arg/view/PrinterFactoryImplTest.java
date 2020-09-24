package com.epam.reverse.arg.view;

import com.epam.reverse.args.view.PrinterFactory;
import com.epam.reverse.args.view.PrinterFactoryImpl;
import com.epam.reverse.args.view.entity.Printer;
import org.junit.Assert;
import org.junit.Test;

public class PrinterFactoryImplTest {

    @Test
    public void testCreateShouldCreateEntity() {
        PrinterFactory printerFactory = new PrinterFactoryImpl();
        Printer printer = printerFactory.create();
        Assert.assertNotNull(printer);
    }
}
