package com.epam.array.wrapper.data.entity.type;

import com.epam.array.wrapper.data.entity.ArrayWrapper;
import com.epam.array.wrapper.data.entity.ArrayWrapperImpl;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ArrayWrapperFillerConsoleTest {
    private static final String CREATING_ARRAY_DATA = "1\n2\n3\n4\n";
    private static final ArrayWrapper EXPECTED_ENTITY = new ArrayWrapperImpl(new int[]{1, 2, 3, 4});

    @Test
    public void testFillShouldCorrectlyFilledArrayWrapper() {
        ArrayWrapperFiller arrayWrapperFiller = new ArrayWrapperFillerConsole();
        int actualSize = 4;
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(actualSize);
        getTestingString(CREATING_ARRAY_DATA);
        arrayWrapperFiller.fill(arrayWrapper);
        Assert.assertEquals(EXPECTED_ENTITY, arrayWrapper);
    }

    private void getTestingString(String data) {
        InputStream is = new ByteArrayInputStream(data.getBytes());
        System.setIn(is);
    }
}