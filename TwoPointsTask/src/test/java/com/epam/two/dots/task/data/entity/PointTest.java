package com.epam.two.dots.task.data.entity;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    private static final double DELTA = 0.01;
    private final Point expectedPoint = new Point(4,4);

    @Test
    public void testConstructor() {
        Assert.assertEquals(expectedPoint, new Point(4,4));
    }

    @Test
    public void testGetDistanceFromOriginShouldReturnCorrectDistanceAfterCreatingPoint() {
        Assert.assertEquals(0,expectedPoint.getDistanceFromOrigin(), DELTA);
    }
}
