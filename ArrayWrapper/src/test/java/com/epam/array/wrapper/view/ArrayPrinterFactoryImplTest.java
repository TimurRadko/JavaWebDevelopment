package com.epam.array.wrapper.view;

import com.epam.array.wrapper.view.type.ArrayPrinter;
import com.epam.array.wrapper.view.type.ArrayPrinterType;
import org.junit.Assert;
import org.junit.Test;

public class ArrayPrinterFactoryImplTest {

    @Test
    public void testCreateShouldReturnEntity() {
        ArrayPrinterFactory factory = new ArrayPrinterFactoryImpl();
        ArrayPrinter printer = factory.create(ArrayPrinterType.CONSOLE);
        Assert.assertNotNull(printer);
    }
}
