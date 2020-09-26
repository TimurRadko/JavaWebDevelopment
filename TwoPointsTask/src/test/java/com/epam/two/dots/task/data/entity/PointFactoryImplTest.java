package com.epam.two.dots.task.data.entity;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class PointFactoryImplTest {
    private static final String DATA_FOR_CREATING_POINT = "4\n4\n";
    private static final String INCORRECT_DATA_FOR_CREATING_POINT = "Hello\n";
    private final Point expectedPoint = new Point(4,4);

    @Test
    public void testCreateShouldCreateCorrectPoint() {
        getTestingString(DATA_FOR_CREATING_POINT);
        Point createdPoint = new Point(4,4);
        Assert.assertEquals(expectedPoint, createdPoint);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateShouldThrowExceptionWhenUserEnterIncorrectData() {
        getTestingString(INCORRECT_DATA_FOR_CREATING_POINT);
        PointFactory pointFactory = new PointFactoryImpl();
        pointFactory.create();
    }

    private void getTestingString(String data) {
        InputStream is = new ByteArrayInputStream(data.getBytes());
        System.setIn(is);
    }
}
