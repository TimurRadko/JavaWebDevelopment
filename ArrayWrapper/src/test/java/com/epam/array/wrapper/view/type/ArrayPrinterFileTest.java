package com.epam.array.wrapper.view.type;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArrayPrinterFileTest {
    private static final String FILE_PATH = "src/test/resources/output.txt";
    private static final String EXPECTED_DATA = "[1, 2, 3, 4]";

    @Test
    public void testPrintShouldPrintCorrectAnswer() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
        String actualData = reader.readLine();
        Assert.assertEquals(EXPECTED_DATA, actualData);
    }
}
