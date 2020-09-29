package com.epam.array.wrapper.view.type;

import com.epam.array.wrapper.data.entity.ArrayWrapper;
import com.epam.array.wrapper.data.entity.ArrayWrapperImpl;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ArrayPrinterConsoleTest {
    private static final String EXPECTED_PRINT = "[1, 2, 3, 4]";

    @Test
    public void testPrintShouldPrintCorrectAnswer() {
        int[] actualData = {1, 2, 3, 4};
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(actualData);
        String actualDataString = getTestingConsoleOutput(arrayWrapper);
        Assert.assertEquals(EXPECTED_PRINT, actualDataString);
    }

    private String getTestingConsoleOutput(ArrayWrapper arrayWrapper) {
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
