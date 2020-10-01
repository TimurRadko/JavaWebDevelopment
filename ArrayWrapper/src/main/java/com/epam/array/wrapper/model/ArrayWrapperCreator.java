package com.epam.array.wrapper.model;

import com.epam.array.wrapper.data.reader.type.DataReadable;
import com.epam.array.wrapper.exception.DataException;
import com.epam.array.wrapper.model.entity.Wrapper;

public interface ArrayWrapperCreator {
    Wrapper create(DataReadable reader) throws DataException;
}
