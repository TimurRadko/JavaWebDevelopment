package com.epam.string.task.view.factory;

import com.epam.string.task.view.FileStringPrinter;
import com.epam.string.task.view.StringPrinter;

public class FileStringPrinterFactory implements StringPrinterFactory {
    private static final String FILE_PATH = "src/data/output.txt";

    @Override
    public StringPrinter create() {
        return new FileStringPrinter(FILE_PATH);
    }
}
