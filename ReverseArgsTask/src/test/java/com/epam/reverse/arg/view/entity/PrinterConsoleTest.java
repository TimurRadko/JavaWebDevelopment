package com.epam.reverse.arg.view.entity;

import com.epam.reverse.args.view.entity.PrinterConsole;
import com.epam.reverse.args.view.entity.Printer;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrinterConsoleTest {
    private final String[] expectedData = {"1", "2", "3", "4"};
    private final List<String> expectedEmptyDataList = new ArrayList<>(0);
    private final static String EMPTY_CONSOLE_MESSAGE = "Console args is empty";
    private final static String EXPECTED_STRING_DATA = "1 2 3 4";

    @Test
    public void testPrintAnswerShouldPrintCorrectAnswerWithEmptyConsoleLine() {
        Assert.assertEquals(EMPTY_CONSOLE_MESSAGE, getTestingConsoleOutput(expectedEmptyDataList));
    }

    @Test
    public void testPrintAnswerShouldPrintCorrectAnswerWithFilledConsoleLine() {
        List<String> actualDataList = Arrays.asList(expectedData);
        Assert.assertEquals(EXPECTED_STRING_DATA, getTestingConsoleOutput(actualDataList));
    }

    private String getTestingConsoleOutput(List<String> expectedData) {
        Printer printer = new PrinterConsole();
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        printer.printAnswer(expectedData);
        System.setOut(consoleStream);
        String resultString = outputStream.toString();
        return resultString.trim();
    }
}
