package com.epam.two.dots.task.data.entity;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    private final Point expectedPoint = new Point(4,4);

    @Test
    public void testConstructor() {
        Assert.assertEquals(expectedPoint, new Point(4,4));
    }
}
