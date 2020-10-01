package com.epam.array.wrapper;

import com.epam.array.wrapper.data.DataReaderFactory;
import com.epam.array.wrapper.data.DataReaderFactoryImpl;
import com.epam.array.wrapper.data.reader.type.DataReadable;
import com.epam.array.wrapper.data.reader.type.DataReadingLocation;
import com.epam.array.wrapper.exception.DataException;
import com.epam.array.wrapper.logic.ArrayCalculator;
import com.epam.array.wrapper.model.ArrayWrapperCreator;
import com.epam.array.wrapper.model.ArrayWrapperCreatorImpl;
import com.epam.array.wrapper.model.entity.ArrayWrapper;
import com.epam.array.wrapper.model.entity.Wrapper;
import com.epam.array.wrapper.view.ArrayPrinterFactory;
import com.epam.array.wrapper.view.ArrayPrinterFactoryImpl;
import com.epam.array.wrapper.view.type.ArrayPrinter;
import com.epam.array.wrapper.view.type.ArrayPrinterType;

public class Runner {
    public static void main(String[] args) throws DataException {
        DataReaderFactory dataReaderFactory = new DataReaderFactoryImpl();
        DataReadable reader = dataReaderFactory.create(DataReadingLocation.RANDOM);
        ArrayWrapperCreator wrapperCreator = new ArrayWrapperCreatorImpl();
        Wrapper arrayWrapper = wrapperCreator.create(reader);

        ArrayPrinterFactory printerFactory = new ArrayPrinterFactoryImpl();
        ArrayPrinter printer = printerFactory.create(ArrayPrinterType.CONSOLE);
        printer.print(arrayWrapper);

        ArrayCalculator calculator = new ArrayCalculator();
        Wrapper sortWrapper = calculator.quickSort(arrayWrapper);
        printer.print(sortWrapper);

        Wrapper fibonacciWrapper = calculator.findFibonacciNumberInArray(arrayWrapper);
        printer.print(fibonacciWrapper);
    }
}
