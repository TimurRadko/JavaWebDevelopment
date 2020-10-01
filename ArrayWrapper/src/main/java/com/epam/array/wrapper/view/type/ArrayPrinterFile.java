package com.epam.array.wrapper.view.type;

import com.epam.array.wrapper.model.entity.Wrapper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ArrayPrinterFile implements ArrayPrinter {
    private final String filename;

    public ArrayPrinterFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void print(Wrapper arrayWrapper) {
        int[] arrayForPrinting = getArrayForPrinting(arrayWrapper);
        try (FileWriter writer = new FileWriter(filename)) {
                writer.write(Arrays.toString(arrayForPrinting));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private int[] getArrayForPrinting(Wrapper arrayWrapper) {
        int arrayLength = arrayWrapper.getSizeArrayWrapper();
        int[] printingArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            printingArray[i] = arrayWrapper.getValue(i);
        }
        return printingArray;
    }
}
