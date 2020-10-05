package com.epam.string.task.view;

import com.epam.string.task.exception.DataException;
import com.epam.string.task.view.FileStringPrinter;
import com.epam.string.task.view.StringPrinter;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStringPrinterTest {
    private static final String FILE_PATH = "src/test/resources/printing_text.txt";
    private static final String EXPECTED_DATA = "Hello world";

    @Test
    public void testPrintShouldPrintCorrectAnswer() throws IOException, DataException {
        StringPrinter printer = new FileStringPrinter(FILE_PATH);
        String actualString = "Hello world";
        printer.print(actualString);
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
        String actualData = reader.readLine();
        Assert.assertEquals(EXPECTED_DATA, actualData);
    }
}
