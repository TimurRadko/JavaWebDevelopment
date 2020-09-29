package com.epam.array.wrapper.data.entity;

import com.epam.array.wrapper.data.entity.type.ArrayFillerType;

public interface ArrayWrapper {
    void fillWrapperArray(ArrayFillerType fillingType);
    int getSizeArrayWrapper();
    int getValue(int index);
    void setValue(int index, int value);
}
