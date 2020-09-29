package com.epam.array.wrapper.data.entity.type;

import com.epam.array.wrapper.data.entity.ArrayWrapper;
import com.epam.array.wrapper.exception.DataException;

import java.io.*;

public class ArrayWrapperFillerFile implements ArrayWrapperFiller {
    private final String filename;
    private static final String DELIMITER_REGEX = "\\s+";

    public ArrayWrapperFillerFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void fill(ArrayWrapper arrayWrapper) {
        int arrayLength = arrayWrapper.getSizeArrayWrapper();
        int indexArray = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null && indexArray < arrayLength) {
                String[] arrayString = line.split(DELIMITER_REGEX);
                for (int i = 0; i < arrayString.length; i++) {
                    String stringValue = arrayString[i];
                    int value = Integer.parseInt(stringValue);
                    arrayWrapper.setValue(i + indexArray, value);
                }
                indexArray++;
            }
        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }
    }
}