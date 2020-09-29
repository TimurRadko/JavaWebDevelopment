package com.epam.array.wrapper.data.entity.type;

import com.epam.array.wrapper.data.entity.ArrayWrapper;

import java.util.Random;

public class ArrayWrapperFillerRandom implements ArrayWrapperFiller {
    private static final int RANDOM_BOUND = 45;

    @Override
    public void fill(ArrayWrapper arrayWrapper) {
        Random random = new Random();
        int arrayLength = arrayWrapper.getSizeArrayWrapper();
        for (int i = 0; i < arrayLength; i++) {
            int value = random.nextInt(RANDOM_BOUND);
            arrayWrapper.setValue(i, value);
        }
    }
}
