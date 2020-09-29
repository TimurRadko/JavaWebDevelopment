package com.epam.array.wrapper.logic;

import com.epam.array.wrapper.data.entity.ArrayWrapper;
import com.epam.array.wrapper.data.entity.ArrayWrapperImpl;
import org.junit.Assert;
import org.junit.Test;

public class ArrayCalculatorTest {
    private static final ArrayWrapper EXPECTED_ENTITY = new ArrayWrapperImpl(new int[]{1, 2, 3, 4});
    private static final ArrayWrapper EXPECTED_ENTITY_FIBONACCI = new ArrayWrapperImpl(new int[]{0, 1, 1});

    @Test
    public void testQuickSortShouldCorrectlySortedArray() {
        int[] actualArray = {3, 2, 1, 4};
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(actualArray);
        ArrayCalculator calculator = new ArrayCalculator();
        calculator.quickSort(arrayWrapper);
        Assert.assertEquals(EXPECTED_ENTITY, arrayWrapper);
    }

    @Test
    public void testFindFibonacciNumberInArrayShouldFindCorrectNumbers() {
        int[] actualArray = {0, 1, 1, 4};
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(actualArray);
        ArrayCalculator calculator = new ArrayCalculator();
        ArrayWrapper fibonacciArrayWrapper = calculator.findFibonacciNumberInArray(arrayWrapper);
        Assert.assertEquals(EXPECTED_ENTITY_FIBONACCI, fibonacciArrayWrapper);
    }
}
