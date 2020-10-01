package com.epam.string.task.view;

import com.epam.string.task.view.type.StringPrinter;
import com.epam.string.task.view.type.StringPrinterType;

public interface StringPrinterFactory {
    StringPrinter create(StringPrinterType stringPrinterType);
}
