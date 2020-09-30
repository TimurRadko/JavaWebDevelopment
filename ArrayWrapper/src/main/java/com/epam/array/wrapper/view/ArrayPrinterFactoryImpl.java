package com.epam.array.wrapper.view;

import com.epam.array.wrapper.view.type.ArrayPrinter;
import com.epam.array.wrapper.view.type.ArrayPrinterConsole;
import com.epam.array.wrapper.view.type.ArrayPrinterFile;
import com.epam.array.wrapper.view.type.ArrayPrinterType;

public class ArrayPrinterFactoryImpl implements ArrayPrinterFactory {
    private static final String FILE_PATH = "src/main//java/com/epam/array/wrapper/output.txt";

    public ArrayPrinter create(ArrayPrinterType printerType) {
        switch (printerType) {
            case CONSOLE:
                return new ArrayPrinterConsole();
            case FILE:
                return new ArrayPrinterFile(FILE_PATH);
            default:
                throw new IllegalArgumentException("Printer type not found");
        }
    }
}
