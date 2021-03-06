package com.epam.array.wrapper.model;

import com.epam.array.wrapper.model.entity.ArrayWrapper;
import com.epam.array.wrapper.model.entity.Wrapper;

public class ArrayWrapperCreatorImpl implements ArrayWrapperCreator {

    @Override
    public Wrapper create(int[] array) {
        return new ArrayWrapper(array);
    }
}