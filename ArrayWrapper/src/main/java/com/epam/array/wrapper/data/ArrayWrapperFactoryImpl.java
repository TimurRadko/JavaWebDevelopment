package com.epam.array.wrapper.data;

import com.epam.array.wrapper.data.entity.ArrayWrapper;
import com.epam.array.wrapper.data.entity.ArrayWrapperImpl;

public class ArrayWrapperFactoryImpl implements ArrayWrapperFactory {

    @Override
    public ArrayWrapper create(int length) {
        return new ArrayWrapperImpl(length);
    }

    @Override
    public ArrayWrapper create(int[] array) {
        return new ArrayWrapperImpl(array);
    }
}