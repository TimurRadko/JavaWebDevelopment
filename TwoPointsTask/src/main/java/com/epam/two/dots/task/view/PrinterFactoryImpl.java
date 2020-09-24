package com.epam.two.dots.task.view;

import com.epam.two.dots.task.view.type.Printer;
import com.epam.two.dots.task.view.type.PrinterConsole;

public class PrinterFactoryImpl implements PrinterFactory {

    @Override
    public Printer create() {
        return new PrinterConsole();
    }
}
