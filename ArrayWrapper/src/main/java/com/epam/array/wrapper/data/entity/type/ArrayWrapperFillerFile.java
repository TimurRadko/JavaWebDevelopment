package com.epam.array.wrapper.data.entity.type;

import com.epam.array.wrapper.data.entity.ArrayWrapper;

import java.io.*;

public class ArrayWrapperFillerFile implements ArrayWrapperFiller {
    private final String FILENAME;
    private static final String DELIMITER_REGEX = "\\s+";

    public ArrayWrapperFillerFile(String filename) {
        this.FILENAME = filename;
    }

    @Override
    public void fill(ArrayWrapper arrayWrapper) {
        int arrayLength = arrayWrapper.getSizeArrayWrapper();
        int indexArray = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
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
            System.err.println(e.getMessage());
        }
    }
}