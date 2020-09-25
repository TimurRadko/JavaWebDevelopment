package com.epam.salad.view;

import com.epam.salad.view.printer.type.SaladPrinter;
import com.epam.salad.view.printer.type.SaladPrinterConsole;

public class SaladPrinterFactoryImpl implements SaladPrinterFactory {

    public SaladPrinter create() {
        return new SaladPrinterConsole();
    }
}
