package com.epam.reverse.args.view;

import com.epam.reverse.args.view.entity.PrinterConsole;
import com.epam.reverse.args.view.entity.Printer;

public class PrinterFactoryImpl implements PrinterFactory{

    @Override
    public Printer create() {
        return new PrinterConsole();
    }
}
