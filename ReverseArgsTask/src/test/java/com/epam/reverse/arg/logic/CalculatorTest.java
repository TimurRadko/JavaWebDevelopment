package com.epam.reverse.arg.logic;

import com.epam.reverse.args.logic.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CalculatorTest {
    private final List<String> actualDataList = Arrays.asList("1", "2", "3", "4");
    private final String[] expectedReversingData = {"4", "3", "2", "1"};

    @Test
    public void testReverseDataShouldCorrectReversingData() {
        Calculator calculator = new Calculator();
        List<String> reversingList = calculator.reverseData(actualDataList);
        String[] actualReverseArray = reversingList.toArray(new String[0]);
        Assert.assertArrayEquals(expectedReversingData, actualReverseArray);
    }
}
