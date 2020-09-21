package com.epam.two.dots.task.view;

import com.epam.two.dots.task.view.type.ConsolePrinter;

public interface PrinterFactory {
    ConsolePrinter createConsolePrinter();
}
