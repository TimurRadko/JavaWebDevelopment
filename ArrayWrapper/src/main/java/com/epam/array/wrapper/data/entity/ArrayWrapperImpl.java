package com.epam.array.wrapper.data.entity;

import com.epam.array.wrapper.data.entity.type.*;
import com.epam.array.wrapper.exception.NotFoundArrayWrapperFillingTypeException;

import java.util.Arrays;
import java.util.Objects;

public class ArrayWrapperImpl implements ArrayWrapper {
    private final int[] array;
    private final int sizeArrayWrapper;
    private static final String FILE_PATH = "src/main/java/com/epam/array/wrapper/input.txt";

    public ArrayWrapperImpl(int length) {
        this.array = new int[length];
        this.sizeArrayWrapper = length;
    }

    public ArrayWrapperImpl(int[] array) {
        this.array = array;
        this.sizeArrayWrapper = array.length;
    }

    @Override
    public int getSizeArrayWrapper() {
        return sizeArrayWrapper;
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
                throw new NotFoundArrayWrapperFillingTypeException("Not found array wrapper type");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayWrapperImpl that = (ArrayWrapperImpl) o;
        return sizeArrayWrapper == that.sizeArrayWrapper &&
                Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(sizeArrayWrapper);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
