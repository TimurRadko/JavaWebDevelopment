package com.epam.array.wrapper.data.entity.type;

import com.epam.array.wrapper.data.entity.ArrayWrapper;
import com.epam.array.wrapper.data.entity.ArrayWrapperImpl;
import org.junit.Assert;
import org.junit.Test;

public class ArrayWrapperFillerFileTest {
    private static final String FILE_PATH_HORIZONTAL = "src/test/resources/horizontal_input.txt";
    private static final String FILE_PATH_VERTICAL = "src/test/resources/vertical_input.txt";
    private static final ArrayWrapper EXPECTED_ENTITY = new ArrayWrapperImpl(new int[]{1, 2, 3, 4});
    private static final int VALUE_ACTUAL_ARRAY_LENGTH = 4;

    @Test
    public void testFillShouldCorrectlyFilledArrayWrapperWhenDataIsArrangedVerticallyAndFileExists() {
        ArrayWrapperFiller arrayWrapperFiller = new ArrayWrapperFillerFile(FILE_PATH_HORIZONTAL);
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(VALUE_ACTUAL_ARRAY_LENGTH);
        arrayWrapperFiller.fill(arrayWrapper);
        Assert.assertEquals(EXPECTED_ENTITY, arrayWrapper);
    }

    @Test
    public void testFillShouldCorrectlyFilledArrayWrapperWhenDataIsArrangedHorizontallyAndFileExists() {
        ArrayWrapperFiller arrayWrapperFiller = new ArrayWrapperFillerFile(FILE_PATH_VERTICAL);
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(VALUE_ACTUAL_ARRAY_LENGTH);
        arrayWrapperFiller.fill(arrayWrapper);
        Assert.assertEquals(EXPECTED_ENTITY, arrayWrapper);
    }
}
