package com.epam.array.wrapper;

import com.epam.array.wrapper.data.ArrayWrapperFactory;
import com.epam.array.wrapper.data.ArrayWrapperFactoryImpl;
import com.epam.array.wrapper.data.entity.ArrayWrapper;
import com.epam.array.wrapper.data.entity.type.ArrayFillerType;
import com.epam.array.wrapper.logic.ArrayCalculator;
import com.epam.array.wrapper.view.ArrayPrinterFactory;
import com.epam.array.wrapper.view.ArrayPrinterFactoryImpl;
import com.epam.array.wrapper.view.type.ArrayPrinter;
import com.epam.array.wrapper.view.type.ArrayPrinterType;

public class Runner {
    public static void main(String[] args) {
        //Filling in using the console.
        ArrayWrapperFactory arrayWrapperFactory = new ArrayWrapperFactoryImpl();
        ArrayWrapper consoleArrayWrapper = arrayWrapperFactory.create(4);
        consoleArrayWrapper.fillWrapperArray(ArrayFillerType.CONSOLE);

        //Printing in using the console
        ArrayPrinterFactory printerFactory = new ArrayPrinterFactoryImpl();
        ArrayPrinter printerConsole = printerFactory.create(ArrayPrinterType.CONSOLE);
        printerConsole.print(consoleArrayWrapper);

        ArrayCalculator calculator = new ArrayCalculator();
        calculator.quickSort(consoleArrayWrapper);
        printerConsole.print(consoleArrayWrapper);

        ArrayWrapper fibonacciNumberInArray = calculator.findFibonacciNumberInArray(consoleArrayWrapper);
        printerConsole.print(fibonacciNumberInArray);

        //Filling in using the random
        ArrayWrapper randomArrayWrapper = arrayWrapperFactory.create(5);
        randomArrayWrapper.fillWrapperArray(ArrayFillerType.RANDOM);
        printerConsole.print(randomArrayWrapper);

        calculator.quickSort(randomArrayWrapper);
        printerConsole.print(randomArrayWrapper);

        fibonacciNumberInArray = calculator.findFibonacciNumberInArray(randomArrayWrapper);
        printerConsole.print(fibonacciNumberInArray);

        //Filling in using the file
        ArrayWrapper fileArrayWrapper = arrayWrapperFactory.create(4);
        fileArrayWrapper.fillWrapperArray(ArrayFillerType.FILE);

        ArrayPrinter printerFile = printerFactory.create(ArrayPrinterType.FILE);
        printerFile.print(fileArrayWrapper);

        calculator.quickSort(fileArrayWrapper);
        printerConsole.print(fileArrayWrapper);

        fibonacciNumberInArray = calculator.findFibonacciNumberInArray(fileArrayWrapper);
        printerConsole.print(fibonacciNumberInArray);
    }
}
