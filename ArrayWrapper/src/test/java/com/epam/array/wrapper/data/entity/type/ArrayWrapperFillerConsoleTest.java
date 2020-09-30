package com.epam.array.wrapper.data.entity.type;

import com.epam.array.wrapper.data.entity.ArrayWrapper;
import com.epam.array.wrapper.data.entity.ArrayWrapperImpl;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ArrayWrapperFillerConsoleTest {
    private static final String CREATING_ARRAY_DATA = "1\n2\n3\n4\n";
    private static final String FAILED_DATA = "Hello";
    private static final ArrayWrapper EXPECTED_ENTITY = new ArrayWrapperImpl(new int[]{1, 2, 3, 4});
    private static final int VALUE_ACTUAL_ARRAY_LENGTH = 4;

    @Test
    public void testFillShouldCorrectlyFilledArrayWrapper() {
        ArrayWrapperFiller arrayWrapperFiller = new ArrayWrapperFillerConsole();
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(VALUE_ACTUAL_ARRAY_LENGTH);
        getTestingString(CREATING_ARRAY_DATA);
        arrayWrapperFiller.fill(arrayWrapper);
        Assert.assertEquals(EXPECTED_ENTITY, arrayWrapper);
    }

    @Test(expected = NumberFormatException.class)
    public void testFillShouldThrowDataExceptionWhenUserEnterInvalidData() {
        ArrayWrapperFiller fillerConsole = new ArrayWrapperFillerConsole();
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(VALUE_ACTUAL_ARRAY_LENGTH);
        getTestingString(FAILED_DATA);
        fillerConsole.fill(arrayWrapper);
    }

    private void getTestingString(String data) {
        InputStream is = new ByteArrayInputStream(data.getBytes());
        System.setIn(is);
    }
}
