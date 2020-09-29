package com.epam.array.wrapper.data.entity;

import org.junit.Assert;
import org.junit.Test;

public class ArrayWrapperImplTest {
    private final int expectedSize = 4;

    @Test
    public void testCreateShouldCreateArrayWrapperUsingLengthCreate() {
        int actualSize = 4;
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(actualSize);
        Assert.assertNotNull(arrayWrapper);
    }

    @Test
    public void testCreateShouldCreateArrayWrapperUsingLengthCreateSpecifyLength() {
        int valueActualArrayLength = 4;
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(valueActualArrayLength);
        int actualArrayWrapperSize = arrayWrapper.getSizeArrayWrapper();
        Assert.assertEquals(expectedSize, actualArrayWrapperSize);
    }

    @Test
    public void testCreateShouldCreateArrayWrapperUsingArray() {
        int[] actualArray = {1, 2, 3, 4};
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(actualArray);
        Assert.assertNotNull(arrayWrapper);
    }

    @Test
    public void testCreateShouldCreateArrayWrapperUsingArraySpecifyLength() {
        int[] actualArray = {1, 2, 3, 4};
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(actualArray);
        int actualArrayWrapperSize = arrayWrapper.getSizeArrayWrapper();
        Assert.assertEquals(expectedSize, actualArrayWrapperSize);
    }
}
