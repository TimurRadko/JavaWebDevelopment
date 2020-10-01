package com.epam.array.wrapper.logic;

import com.epam.array.wrapper.model.entity.Wrapper;
import com.epam.array.wrapper.model.entity.ArrayWrapper;
import org.junit.Assert;
import org.junit.Test;

public class ArrayCalculatorTest {
    private static final Wrapper EXPECTED_ENTITY = new ArrayWrapper(new int[]{1, 2, 3, 4});
    private static final Wrapper EXPECTED_ENTITY_FIBONACCI = new ArrayWrapper(new int[]{0, 1, 1});

    @Test
    public void testQuickSortShouldCorrectlySortedArray() {
        int[] actualArray = {3, 2, 1, 4};
        Wrapper arrayWrapper = new ArrayWrapper(actualArray);
        ArrayCalculator calculator = new ArrayCalculator();
        Wrapper sortedWrapper = calculator.quickSort(arrayWrapper);
        Assert.assertEquals(EXPECTED_ENTITY, sortedWrapper);
    }

    @Test
    public void testFindFibonacciNumberInArrayShouldFindCorrectNumbers() {
        int[] actualArray = {0, 1, 1, 4};
        Wrapper arrayWrapper = new ArrayWrapper(actualArray);
        ArrayCalculator calculator = new ArrayCalculator();
        Wrapper fibonacciArrayWrapper = calculator.findFibonacciNumberInArray(arrayWrapper);
        Assert.assertEquals(EXPECTED_ENTITY_FIBONACCI, fibonacciArrayWrapper);
    }
}
