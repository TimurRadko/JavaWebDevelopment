package com.epam.array.wrapper.model;

import com.epam.array.wrapper.model.entity.ArrayWrapper;
import com.epam.array.wrapper.model.entity.Wrapper;
import org.junit.Assert;
import org.junit.Test;

public class ArrayWrapperTest {
    private static final int EXPECTED_SIZE = 4;
    private static final int VALUE_ACTUAL_ARRAY_LENGTH = 4;

    @Test
    public void testCreateShouldCreateArrayWrapperUsingLengthCreate() {
        Wrapper arrayWrapper = new ArrayWrapper(VALUE_ACTUAL_ARRAY_LENGTH);
        Assert.assertNotNull(arrayWrapper);
    }

    @Test
    public void testCreateShouldCreateArrayWrapperUsingLengthCreateSpecifyLength() {
        Wrapper arrayWrapper = new ArrayWrapper(VALUE_ACTUAL_ARRAY_LENGTH);
        int actualArrayWrapperSize = arrayWrapper.getSizeArrayWrapper();
        Assert.assertEquals(EXPECTED_SIZE, actualArrayWrapperSize);
    }

    @Test
    public void testCreateShouldCreateArrayWrapperUsingArray() {
        int[] actualArray = {1, 2, 3, 4};
        Wrapper arrayWrapper = new ArrayWrapper(actualArray);
        Assert.assertNotNull(arrayWrapper);
    }

    @Test
    public void testCreateShouldCreateArrayWrapperUsingArraySpecifyLength() {
        int[] actualArray = {1, 2, 3, 4};
        Wrapper arrayWrapper = new ArrayWrapper(actualArray);
        int actualArrayWrapperSize = arrayWrapper.getSizeArrayWrapper();
        Assert.assertEquals(EXPECTED_SIZE, actualArrayWrapperSize);
    }
}
