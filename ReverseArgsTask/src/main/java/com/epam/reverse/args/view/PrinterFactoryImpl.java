package com.epam.reverse.args.view;

import com.epam.reverse.args.view.type.ConsolePrinter;
import com.epam.reverse.args.view.type.Printer;

public class PrinterFactoryImpl implements PrinterFactory{

    @Override
    public Printer getPrinter() {
        return new ConsolePrinter();
    }
}
