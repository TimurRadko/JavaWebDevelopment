package com.epam.string.task.view.factory;

import com.epam.string.task.view.ConsoleStringPrinter;
import com.epam.string.task.view.StringPrinter;

public class ConsoleStringPrinterFactory implements StringPrinterFactory {

    @Override
    public StringPrinter create() {
        return new ConsoleStringPrinter();
    }
}
