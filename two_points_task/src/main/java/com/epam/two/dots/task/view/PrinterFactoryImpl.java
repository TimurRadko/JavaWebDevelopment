package com.epam.two.dots.task.view;

import com.epam.two.dots.task.view.type.ConsolePrinter;
import com.epam.two.dots.task.view.type.ConsolePrinterImpl;

public class PrinterFactoryImpl implements PrinterFactory {

    @Override
    public ConsolePrinter createConsolePrinter() {
        return new ConsolePrinterImpl();
    }
}
