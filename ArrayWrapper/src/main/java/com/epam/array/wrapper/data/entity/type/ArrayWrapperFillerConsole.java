package com.epam.array.wrapper.data.entity.type;

import com.epam.array.wrapper.data.entity.ArrayWrapper;
import com.epam.array.wrapper.exception.DataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayWrapperFillerConsole implements ArrayWrapperFiller {

    public void fill(ArrayWrapper arrayWrapper) {
        int arrayLength = arrayWrapper.getSizeArrayWrapper();
        System.out.printf("Please, enter the %d numbers:\n", arrayLength);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < arrayLength; i++) {
                String stringNumber = reader.readLine();
                int number = Integer.parseInt(stringNumber);
                arrayWrapper.setValue(i, number);
            }
        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }
    }
}
