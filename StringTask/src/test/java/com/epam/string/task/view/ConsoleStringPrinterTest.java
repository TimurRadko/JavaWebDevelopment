package com.epam.string.task.view;

import com.epam.string.task.exception.DataException;
import com.epam.string.task.view.ConsoleStringPrinter;
import com.epam.string.task.view.StringPrinter;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleStringPrinterTest {
    private static final String EXPECTED_TEXT = "Hello";

    @Test
    public void testPrintShouldCorrectPrinting() throws DataException {
        String actualText = "Hello";
        String actualDataString = getTestingConsoleOutput(actualText);
        Assert.assertEquals(EXPECTED_TEXT, actualDataString);
    }

    private String getTestingConsoleOutput(String printingText) throws DataException {
        StringPrinter printer = new ConsoleStringPrinter();
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        printer.print(printingText);
        System.setOut(consoleStream);
        String resultString = outputStream.toString();
        return resultString.trim();
    }
}
