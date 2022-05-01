package by.itstep.khodosevich.fourproject.module.logic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
import static by.itstep.khodosevich.fourproject.module.logic.Rectangle.*;
//import static org.junit.Assert.*;

public class TestRectangle {

    @Test
    public void testCalculeteSquareOfRectanglePositive(){
        double actual_length = 2.0;
        double actual_width = 4.0;
        double delta = 0.001;
        double actual;
        double expected = 8.0;

        actual = calculateSquareOfRectangle(actual_length, actual_width);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculeteSquareOfRectangleWithZeroLengthANdWidth(){
        double actual_length = 0;
        double actual_width = 0;
        double delta = 0.001;
        double actual;
        double expected =0;

        actual = calculateSquareOfRectangle(actual_length, actual_width);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculeteSquareOfRectangleNegative(){
        double actual_length = -1;
        double actual_width = 4.0;

        double actual = calculateSquareOfRectangle(actual_length, actual_width);
    }

    @Test
    public void testCalculatePerimeterOfRectanglePositive(){
        double actual_length = 2.0;
        double actual_width = 4.0;
        double actual;
        double expected = 12.0;
        double delta = 0.001;

        actual = calculatePerimeterOfRectangle(actual_length, actual_width);
        Assert.assertEquals(expected, actual,delta);
    }

    @Test
    public void testCalculatePerimeterOfRectangleWithZeroLengthAndWidth(){
        double actual_length = 0;
        double actual_width = 0;
        double actual;
        double expected = 0;
        double delta = 0.001;

        actual = calculatePerimeterOfRectangle(actual_length, actual_width);
        Assert.assertEquals(expected, actual,delta);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculatePerimeterOfRectangleNegative(){
        double actual_length = -1;
        double actual_width = 4.0;

        double actual = calculatePerimeterOfRectangle(actual_length, actual_width);
    }

}
