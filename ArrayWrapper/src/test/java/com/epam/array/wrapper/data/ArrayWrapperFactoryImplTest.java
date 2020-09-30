package com.epam.array.wrapper.data;

import com.epam.array.wrapper.data.entity.ArrayWrapper;
import org.junit.Assert;
import org.junit.Test;

public class ArrayWrapperFactoryImplTest {
    private static final int VALUE_ACTUAL_ARRAY_LENGTH = 4;

    @Test
    public void testCreateShouldCreateArrayWrapperUsingLengthCreate() {
        ArrayWrapperFactory arrayWrapperFactory = new ArrayWrapperFactoryImpl();
        ArrayWrapper arrayWrapper = arrayWrapperFactory.create(VALUE_ACTUAL_ARRAY_LENGTH);
        Assert.assertNotNull(arrayWrapper);
    }

    @Test
    public void testCreateShouldCreateArrayWrapperUsingArrayCreate() {
        ArrayWrapperFactory arrayWrapperFactory = new ArrayWrapperFactoryImpl();
        int[] actualArray = {1, 2, 3, 4};
        ArrayWrapper arrayWrapper = arrayWrapperFactory.create(actualArray);
        Assert.assertNotNull(arrayWrapper);
    }
}
