package com.epam.string.task.data;

import com.epam.string.task.data.acquirer.type.ConsoleDataAcquirer;
import com.epam.string.task.data.acquirer.type.DataAcquirer;
import org.junit.Assert;
import org.junit.Test;

public class DataAcquirerFactoryImplTest {
    private final static DataAcquirer EXPECTED_DATA_ACQUIRER = new ConsoleDataAcquirer();

    @Test
    public void testCreateShouldCreateEntity() {
        DataAcquirerFactory factory = new DataAcquirerFactoryImpl();
        DataAcquirer dataAcquirer = factory.create(DataReadingLocation.CONSOLE);
        Assert.assertNotNull(dataAcquirer);
    }

    @Test
    public void testCreateShouldCreateCorrectEntity() {
        DataAcquirerFactory factory = new DataAcquirerFactoryImpl();
        DataAcquirer dataAcquirer = factory.create(DataReadingLocation.CONSOLE);
        Assert.assertEquals(EXPECTED_DATA_ACQUIRER.getClass(), dataAcquirer.getClass());
    }
}
