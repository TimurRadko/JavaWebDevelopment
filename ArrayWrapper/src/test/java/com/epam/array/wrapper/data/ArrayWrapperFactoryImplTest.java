package com.epam.array.wrapper.data;

import com.epam.array.wrapper.data.entity.ArrayWrapper;
import org.junit.Assert;
import org.junit.Test;

public class ArrayWrapperFactoryImplTest {

    @Test
    public void testCreateShouldCreateArrayWrapperUsingLengthCreate() {
        ArrayWrapperFactory arrayWrapperFactory = new ArrayWrapperFactoryImpl();
        int valueActualArrayLength = 4;
        ArrayWrapper arrayWrapper = arrayWrapperFactory.create(valueActualArrayLength);
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
