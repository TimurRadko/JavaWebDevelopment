package com.epam.array.wrapper.data;

import com.epam.array.wrapper.data.entity.ArrayWrapper;

public interface ArrayWrapperFactory {
    ArrayWrapper create(int length);
    ArrayWrapper create(int[] array);
}
