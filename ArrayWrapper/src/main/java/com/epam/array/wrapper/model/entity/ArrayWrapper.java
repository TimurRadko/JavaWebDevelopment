package com.epam.array.wrapper.model.entity;

import java.util.Arrays;

public class ArrayWrapper implements Wrapper {
    private final int[] array;

    public ArrayWrapper(int length) {
        this.array = new int[length];
    }

    public ArrayWrapper(int[] array) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayWrapper that = (ArrayWrapper) o;
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
