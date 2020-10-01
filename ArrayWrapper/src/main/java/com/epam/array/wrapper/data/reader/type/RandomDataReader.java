package com.epam.array.wrapper.data.reader.type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomDataReader implements DataReadable {
    private static final int RANDOM_BOUND = 45;

    @Override
    public int[] read() {
        int arrayLength = getArrayLength();
        int[] creatingArray = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            int value = random.nextInt(RANDOM_BOUND);
            creatingArray[i] = value;
        }
        return creatingArray;
    }

    private int getArrayLength() {
        System.out.println("Please, enter the array length:");
        int arrayLength = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String stringArrayLength = reader.readLine();
            arrayLength = Integer.parseInt(stringArrayLength);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayLength;
    }
}
