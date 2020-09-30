package com.epam.array.wrapper.data.entity;

import com.epam.array.wrapper.data.entity.type.*;

import java.util.Arrays;

public class ArrayWrapperImpl implements ArrayWrapper {
    private final int[] array;
    private static final String FILE_PATH = "src/main/java/com/epam/array/wrapper/input.txt";

    public ArrayWrapperImpl(int length) {
        this.array = new int[length];
    }

    public ArrayWrapperImpl(int[] array) {
        this.array = array;
    }

    @Override
    public int getSizeArrayWrapper() {
        return array.length;
    }

    @Override
    public int getValue(int index) {
        return array[index];
    }

    @Override
    public void setValue(int index, int value) {
        array[index] = value;
    }

    @Override
    public void fillArrayWrapper(ArrayFillerType fillingType) {
        ArrayWrapperFiller arrayWrapperFiller;
        switch (fillingType) {
            case CONSOLE:
                arrayWrapperFiller = new ArrayWrapperFillerConsole();
                arrayWrapperFiller.fill(this);
                break;
            case FILE:
                arrayWrapperFiller = new ArrayWrapperFillerFile(FILE_PATH);
                arrayWrapperFiller.fill(this);
                break;
            case RANDOM:
                arrayWrapperFiller = new ArrayWrapperFillerRandom();
                arrayWrapperFiller.fill(this);
                break;
            default:
                throw new IllegalArgumentException("Not found array wrapper type");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayWrapperImpl that = (ArrayWrapperImpl) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
