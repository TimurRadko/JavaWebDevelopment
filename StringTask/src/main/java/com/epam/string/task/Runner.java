package com.epam.string.task;

import com.epam.string.task.data.DataReadingLocation;
import com.epam.string.task.data.acquirer.type.DataAcquirer;
import com.epam.string.task.data.DataAcquirerFactory;
import com.epam.string.task.data.DataAcquirerFactoryImpl;
import com.epam.string.task.exception.DataException;
import com.epam.string.task.logic.StringCalculator;
import com.epam.string.task.logic.parser.ParserFactory;
import com.epam.string.task.logic.parser.ParserFactoryImpl;
import com.epam.string.task.logic.parser.StringParser;
import com.epam.string.task.logic.parser.type.ParserType;
import com.epam.string.task.view.StringPrinterFactory;
import com.epam.string.task.view.StringPrinterFactoryImpl;
import com.epam.string.task.view.type.StringPrinter;
import com.epam.string.task.view.type.StringPrinterType;

public class Runner {
    public static void main(String[] args) throws DataException {
        DataAcquirerFactory dataAcquirerFactory = new DataAcquirerFactoryImpl();
        DataAcquirer dataAcquirer = dataAcquirerFactory.create(DataReadingLocation.FILE);
        String data = dataAcquirer.getData();

        ParserFactory parserFactory = new ParserFactoryImpl();
        StringParser stringParser = parserFactory.create(ParserType.STRING_METHODS);

        StringCalculator calculator = new StringCalculator(stringParser);
        String resultingString = calculator.changeReceivingString(data);

        StringPrinterFactory stringPrinterFactory = new StringPrinterFactoryImpl();
        StringPrinter printer = stringPrinterFactory.create(StringPrinterType.CONSOLE);
        printer.print(resultingString);
    }
}
