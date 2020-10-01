package com.epam.array.wrapper.model;

import com.epam.array.wrapper.exception.DataException;
import com.epam.array.wrapper.model.entity.Wrapper;

public interface ArrayWrapperCreator {
    Wrapper create(int[] array) throws DataException;
}
