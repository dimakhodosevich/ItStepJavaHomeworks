package by.itstep.khodosevich.fourproject.module.logic;

import org.junit.Test;
import org.junit.Assert;

import static by.itstep.khodosevich.fourproject.module.logic.Triangle.*;

public class TestTriangle {

    @Test
    public void testCalculateSquareOfTrianglePositive() {
        double actual_length = 3.0;
        double actual_width = 4.0;
        double actual;
        double expected = 6.0;
        double delta = 0.001;

        actual = calculateSquareOfTriangle(actual_length, actual_width);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateSquareOfTriangleWithZeroLengthAndWidth() {
        double actual_length = 0;
        double actual_width = 0;
        double actual;
        double expected = 0;
        double delta = 0.001;

        actual = calculateSquareOfTriangle(actual_length, actual_width);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateSquareOfTriangleNegative() {
        double actual_length = -3.0;
        double actual_width = 4.0;

        double actual = calculateSquareOfTriangle(actual_length, actual_width);
    }

    @Test
    public void testCalculatePerimeterOfTrianglePositive() {
        double actual_length = 3.0;
        double actual_width = 4.0;
        double actual;
        double expected = 12.0;
        double delta = 0.001;

        actual = calculatePerimeterOfTriangle(actual_length, actual_width);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculatePerimeterOfTriangleWithZeroLengthAndWidth() {
        double actual_length = 0;
        double actual_width = 0;
        double actual;
        double expected = 0;
        double delta = 0.001;

        actual = calculatePerimeterOfTriangle(actual_length, actual_width);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculatePerimeterOfTriangleNegative() {
        double actual_length = -3.0;
        double actual_width = 4.0;

double        actual = calculatePerimeterOfTriangle(actual_length, actual_width);
    }

    @Test
    public void testCalculateHypotenuseOfTrianglePositive() {
        double actual_length = 3.0;
        double actual_width = 4.0;
        double actual;
        double expected = 5.0;
        double delta = 0.001;

        actual = calculateHypotenuseOfTriangle(actual_length, actual_width);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateHypotenuseOfTriangleWithZeroLength() {
        double actual_length = 0;
        double actual_width = 0;
        double actual;
        double expected = 0;
        double delta = 0.001;

        actual = calculateHypotenuseOfTriangle(actual_length, actual_width);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateHypotenuseOfTriangleNegative() {
        double actual_length = -3;
        double actual_width = 4.0;

        double actual = calculateHypotenuseOfTriangle(actual_length, actual_width);
    }

}
