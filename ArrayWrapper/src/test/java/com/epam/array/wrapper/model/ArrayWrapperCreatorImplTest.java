package com.epam.array.wrapper.model;

import com.epam.array.wrapper.data.reader.type.DataReadable;
import com.epam.array.wrapper.data.reader.type.FileDataReader;
import com.epam.array.wrapper.exception.DataException;
import com.epam.array.wrapper.model.entity.ArrayWrapper;
import com.epam.array.wrapper.model.entity.Wrapper;
import org.junit.Assert;
import org.junit.Test;

public class ArrayWrapperCreatorImplTest {
    private static final int[] ACTUAL_DATA = {1 ,2, 3, 4};
    private static final Wrapper EXPECTED_WRAPPER = new ArrayWrapper(ACTUAL_DATA);
    private static final String FILE_PATH = "src/test/resources/horizontal_input.txt";

    @Test
    public void testCreateShouldCorrectEntity() throws DataException {
        ArrayWrapperCreator arrayWrapperCreator = new ArrayWrapperCreatorImpl();
        DataReadable reader = new FileDataReader(FILE_PATH);
        int[] actualArray = reader.read();
        Wrapper actualWrapper = arrayWrapperCreator.create(actualArray);
        Assert.assertEquals(EXPECTED_WRAPPER, actualWrapper);
    }
}
