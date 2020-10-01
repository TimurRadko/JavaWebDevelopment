package com.epam.array.wrapper.view.type;

import com.epam.array.wrapper.exception.DataException;
import com.epam.array.wrapper.model.entity.ArrayWrapper;
import com.epam.array.wrapper.model.entity.Wrapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArrayPrinterFileTest {
    private static final String FILE_PATH = "src/test/resources/output.txt";
    private static final String EXPECTED_DATA = "[1, 2, 3, 4]";

    @Test
    public void testPrintShouldPrintCorrectAnswer() throws DataException, IOException {
        Wrapper actualWrapper = new ArrayWrapper(new int[]{1, 2, 3, 4});
        ArrayPrinter printer = new ArrayPrinterFile(FILE_PATH);
        printer.print(actualWrapper);
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
        String actualData = reader.readLine();
        Assert.assertEquals(EXPECTED_DATA, actualData);
    }
}
