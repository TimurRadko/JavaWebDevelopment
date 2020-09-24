package com.epam.two.dots.task.data.receiver.type;

import com.epam.two.dots.task.data.entity.Point;
import com.epam.two.dots.task.data.entity.PointFactory;
import org.junit.Assert;
import org.junit.Test;

public class DataReceiverEntityTest {
    private final Point expectedPoint = new Point(4, 4);

    @Test
    public void testReceivePointShouldCorrectReceivingPoint() {
        DataReceiver dataReceiver = new DataReceiverEntity();
        Point actualPoint = new Point(4, 4);
        dataReceiver.receivePoint(actualPoint);
        Point gettingActualPoint = dataReceiver.getPoints()[0];
        Assert.assertEquals(expectedPoint, gettingActualPoint);
    }

    @Test
    public void testGetPointFactoryShouldReturnCorrectEntity() {
        DataReceiver dataReceiver = new DataReceiverEntity();
        PointFactory pointFactory = dataReceiver.getPointFactory();
        Assert.assertNotNull(pointFactory);
    }
}
