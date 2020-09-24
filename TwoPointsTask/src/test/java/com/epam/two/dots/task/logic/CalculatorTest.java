package com.epam.two.dots.task.logic;

import com.epam.two.dots.task.data.entity.Point;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private final Point closerPoint = new Point(1,1);
    private final Point furtherPoint = new Point(4,4);
    private final Point[] checkingPoints = {closerPoint, furtherPoint};

    @Test
    public void testFindCloserToOriginShouldReturnCorrectAnswer() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(closerPoint, calculator.findCloserToOrigin(checkingPoints));
    }
}
