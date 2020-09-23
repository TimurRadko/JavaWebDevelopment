import com.epam.two.dots.task.data.entity.Point;
import com.epam.two.dots.task.data.entity.PointFactory;
import com.epam.two.dots.task.data.entity.PointFactoryImpl;
import com.epam.two.dots.task.logic.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TwoPointsCalculationTest {
    private static final double DELTA = 0.01;
    private final Point expectedPoint = new Point(4,4);
    private final Point closerPoint = new Point(1,1);
    private final Point expectedZeroPoint = new Point(0,0);
    private final Point[] checkingPoints = {closerPoint, expectedPoint};

    @Test
    public void shouldCreateCorrectPoint() {
        Assert.assertEquals(expectedPoint, new Point(4,4));
    }

    @Test(expected = NumberFormatException.class)
    public void shouldExceptionWhenUserEnterIncorrectData() {
        String data = "Hello" + "\n";
        getTestingString(data);
        PointFactory pointFactory = new PointFactoryImpl();
        pointFactory.createPoint();
    }

    @Test
    public void shouldCreateCorrectPointUsingCreatePointMethod() {
        String data = 4 + "\n" + 4 + "\n";
        getTestingString(data);
        PointFactory pointFactory = new PointFactoryImpl();
        Point createdPoint = pointFactory.createPoint();
        Assert.assertEquals(expectedPoint, createdPoint);
    }

    private void getTestingString(String data) {
        InputStream is = new ByteArrayInputStream(data.getBytes());
        System.setIn(is);
    }

    @Test
    public void shouldCorrectFindCloserPoint() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(closerPoint, calculator.findingCloserToOriginPoint(checkingPoints));
    }

    @Test
    public void shouldReturnCorrectDefaultDistanceAfterCreatingPoint() {
        Assert.assertEquals(0,expectedZeroPoint.getDistanceFromOrigin(), DELTA);
    }
}
