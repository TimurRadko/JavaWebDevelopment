package com.epam.string.task;

import com.epam.string.task.data.DataAcquirer;
import com.epam.string.task.data.factory.DataAcquirerFactory;
import com.epam.string.task.data.factory.FileDataAcquirerFactory;
import com.epam.string.task.exception.DataException;
import com.epam.string.task.logic.StringCalculator;
import com.epam.string.task.logic.parser.ParserFactory;
import com.epam.string.task.logic.parser.ParserFactoryImpl;
import com.epam.string.task.logic.parser.type.StringParser;
import com.epam.string.task.logic.parser.type.ParserType;
import com.epam.string.task.view.factory.ConsoleStringPrinterFactory;
import com.epam.string.task.view.factory.StringPrinterFactory;
import com.epam.string.task.view.StringPrinter;

public class Runner {
    public static void main(String[] args) throws DataException {
        DataAcquirerFactory dataAcquirerFactory = new FileDataAcquirerFactory();
        DataAcquirer dataAcquirer = dataAcquirerFactory.create();
        String data = dataAcquirer.getData();

        ParserFactory parserFactory = new ParserFactoryImpl();
        StringParser stringParser = parserFactory.create(ParserType.STRING_METHODS);

        StringCalculator calculator = new StringCalculator(stringParser);
        String resultingString = calculator.changeReceivingString(data);

        StringPrinterFactory stringPrinterFactory = new ConsoleStringPrinterFactory();
        StringPrinter printer = stringPrinterFactory.create();
        printer.print(resultingString);
    }
}
