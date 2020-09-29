package com.epam.array.wrapper.data.entity.type;

import com.epam.array.wrapper.data.entity.ArrayWrapper;
import com.epam.array.wrapper.data.entity.ArrayWrapperImpl;
import com.epam.array.wrapper.exception.DataException;
import org.junit.Assert;
import org.junit.Test;

public class ArrayWrapperFillerFileTest {
    private static final String FILE_PATH_HORIZONTAL = "src/test/resources/horizontal_input.txt";
    private static final String FILE_PATH_VERTICAL = "src/test/resources/vertical_input.txt";
    private static final String FAILED_PATH = "src/test/resources/exception.txt";
    private static final ArrayWrapper EXPECTED_ENTITY = new ArrayWrapperImpl(new int[]{1, 2, 3, 4});

    @Test
    public void testFillShouldCorrectlyFilledArrayWrapperWhenDataIsArrangedVerticallyAndFileExists() {
        ArrayWrapperFiller arrayWrapperFiller = new ArrayWrapperFillerFile(FILE_PATH_HORIZONTAL);
        int valueActualArrayLength = 4;
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(valueActualArrayLength);
        arrayWrapperFiller.fill(arrayWrapper);
        Assert.assertEquals(EXPECTED_ENTITY, arrayWrapper);
    }

    @Test(expected = DataException.class)
    public void testFillShouldThrowDataExceptionWhenFileNotExist() {
        ArrayWrapperFiller arrayWrapperFiller = new ArrayWrapperFillerFile(FAILED_PATH);
        int valueActualArrayLength = 4;
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(valueActualArrayLength);
        arrayWrapperFiller.fill(arrayWrapper);
    }

    @Test
    public void testFillShouldCorrectlyFilledArrayWrapperWhenDataIsArrangedHorizontallyAndFileExists() {
        ArrayWrapperFiller arrayWrapperFiller = new ArrayWrapperFillerFile(FILE_PATH_VERTICAL);
        int valueActualArrayLength = 4;
        ArrayWrapper arrayWrapper = new ArrayWrapperImpl(valueActualArrayLength);
        arrayWrapperFiller.fill(arrayWrapper);
        Assert.assertEquals(EXPECTED_ENTITY, arrayWrapper);
    }
}
