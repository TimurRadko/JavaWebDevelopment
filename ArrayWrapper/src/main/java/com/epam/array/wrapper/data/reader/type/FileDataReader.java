package com.epam.array.wrapper.data.reader.type;

import com.epam.array.wrapper.exception.DataException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDataReader implements DataReadable {
    private final String filename;
    private static final String DELIMITER_REGEX = "\\s+";

    public FileDataReader(String filename) {
        this.filename = filename;
    }

    @Override
    public int[] read() throws DataException {
        List<Integer> filledList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arrayString = line.split(DELIMITER_REGEX);
                for (String stringValue : arrayString) {
                    int value = Integer.parseInt(stringValue);
                    filledList.add(value);
                }
            }
        } catch (IOException e) {
            throw new DataException("You enter invalid data. Cause of exception is ", e);
        }
        return convertListToArray(filledList);
    }

    private int[] convertListToArray(List<Integer> list) {
        int[] convertingArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            convertingArray[i] = number;
        }
        return convertingArray;
    }
}