package com.epam.array.wrapper.view.type;

import com.epam.array.wrapper.exception.DataException;
import com.epam.array.wrapper.model.entity.Wrapper;
import com.epam.array.wrapper.model.entity.ArrayWrapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ArrayPrinterConsoleTest {
    private static final String EXPECTED_PRINT = "[1, 2, 3, 4]";

    @Test
    public void testPrintShouldPrintCorrectAnswer() throws DataException {
        int[] actualData = {1, 2, 3, 4};
        Wrapper arrayWrapper = new ArrayWrapper(actualData);
        String actualDataString = getTestingConsoleOutput(arrayWrapper);
        Assert.assertEquals(EXPECTED_PRINT, actualDataString);
    }

    private String getTestingConsoleOutput(Wrapper arrayWrapper) throws DataException {
        ArrayPrinter printer = new ArrayPrinterConsole();
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        printer.print(arrayWrapper);
        System.setOut(consoleStream);
        String resultString = outputStream.toString();
        return resultString.trim();
    }
}
