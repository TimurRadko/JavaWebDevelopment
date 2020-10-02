package com.epam.string.task.view;

import com.epam.string.task.view.type.ConsoleStringPrinter;
import com.epam.string.task.view.type.FileStringPrinter;
import com.epam.string.task.view.type.StringPrinter;
import com.epam.string.task.view.type.StringPrinterType;

public class StringPrinterFactoryImpl implements StringPrinterFactory {
    private static final String FILE_PATH = "src/data/output.txt";

    public StringPrinter create(StringPrinterType stringPrinterType) {
        switch(stringPrinterType) {
            case CONSOLE:
                return new ConsoleStringPrinter();
            case FILE:
                return new FileStringPrinter(FILE_PATH);
            default:
                throw new IllegalArgumentException("String printer type not found");
        }
    }
}
