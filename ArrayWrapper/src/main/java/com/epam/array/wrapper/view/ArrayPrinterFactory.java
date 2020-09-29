package com.epam.array.wrapper.view;

import com.epam.array.wrapper.view.type.ArrayPrinter;
import com.epam.array.wrapper.view.type.ArrayPrinterType;

public interface ArrayPrinterFactory {
    ArrayPrinter create(ArrayPrinterType printerType);
}
