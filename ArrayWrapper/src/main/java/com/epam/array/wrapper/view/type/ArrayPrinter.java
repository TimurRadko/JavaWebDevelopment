package com.epam.array.wrapper.view.type;

import com.epam.array.wrapper.exception.DataException;
import com.epam.array.wrapper.model.entity.Wrapper;

public interface ArrayPrinter {
    void print(Wrapper arrayWrapper) throws DataException;
}
