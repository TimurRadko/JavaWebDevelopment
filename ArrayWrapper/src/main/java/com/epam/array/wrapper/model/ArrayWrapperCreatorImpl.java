package com.epam.array.wrapper.model;

import com.epam.array.wrapper.data.reader.type.DataReadable;
import com.epam.array.wrapper.exception.DataException;
import com.epam.array.wrapper.model.entity.ArrayWrapper;
import com.epam.array.wrapper.model.entity.Wrapper;

public class ArrayWrapperCreatorImpl implements ArrayWrapperCreator {

    @Override
    public Wrapper create(DataReadable reader) throws DataException {
        int[] array = reader.read();
        return new ArrayWrapper(array);
    }
}