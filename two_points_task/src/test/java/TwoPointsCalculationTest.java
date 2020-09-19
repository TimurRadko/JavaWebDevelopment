import com.epam.two_dots_task.data.entity.Point;
import com.epam.two_dots_task.logic.Calculator;
import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void shouldCorrectFindCloserPoint() {
        Calculator abstractCalculator = Calculator.getCalculator();
        Assert.assertEquals(closerPoint, abstractCalculator.findingCloserToOriginPoint(checkingPoints));
    }

    @Test
    public void shouldReturnCorrectDefaultDistanceAfterCreatingPoint() {
        Assert.assertEquals(0,expectedZeroPoint.getDistanceFromOrigin(), DELTA);
    }
}
