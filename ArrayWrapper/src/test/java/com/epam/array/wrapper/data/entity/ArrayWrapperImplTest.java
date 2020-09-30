package com.epam.array.wrapper.data.entity;

import org.junit.Assert;
import org.junit.Test;

public class ArrayWrapperImplTest {
    private static final int EXPECTED_SIZE = 4;
    private static final int VALUE_ACTUAL_ARRAY_LENGTH = 4;

    @Test
    public void testCreateShouldCreateArrayWrapperUsingLengthCreate() {
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(VALUE_ACTUAL_ARRAY_LENGTH);
        Assert.assertNotNull(arrayWrapper);
    }

    @Test
    public void testCreateShouldCreateArrayWrapperUsingLengthCreateSpecifyLength() {
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(VALUE_ACTUAL_ARRAY_LENGTH);
        int actualArrayWrapperSize = arrayWrapper.getSizeArrayWrapper();
        Assert.assertEquals(EXPECTED_SIZE, actualArrayWrapperSize);
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
        Assert.assertEquals(EXPECTED_SIZE, actualArrayWrapperSize);
    }
}
