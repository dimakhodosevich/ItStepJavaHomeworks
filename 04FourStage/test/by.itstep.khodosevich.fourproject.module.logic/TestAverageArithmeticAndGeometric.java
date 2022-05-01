package by.itstep.khodosevich.fourproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourproject.module.logic.AverageArithmeticAndGeometric.*;

public class TestAverageArithmeticAndGeometric {

    @Test
    public void testCalculateAverageArithmeticValuePositive(){
        double actual_value1 = 1.0;
        double actual_value2 = 2.0;
        double actual;
        double expected = 1.5;
        double delta = 0.001;

        actual = AverageArithmeticAndGeometric.calculateAverageArithmeticValue(actual_value1, actual_value2);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateAverageArithmeticValueWithZeroValues(){
        double actual_value1 = 0;
        double actual_value2 = 0;
        double actual;
        double expected = 0;
        double delta = 0.001;

        actual = AverageArithmeticAndGeometric.calculateAverageArithmeticValue(actual_value1, actual_value2);
        assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateAverageArithmeticValueNegative(){
        double actual_value1 = -1.0;
        double actual_value2 = 2.0;
        double actual;

        actual = AverageArithmeticAndGeometric.calculateAverageArithmeticValue(actual_value1, actual_value2);
    }

    @Test
    public void testCalculateAverageGeometricValuePositive(){
        double actual_value1 = 3.0;
        double actual_value2 = 4.0;
        double actual;
        double expected = 3.464;
        double delta = 0.001;

        actual = calculateAverageGeometricValue(actual_value1, actual_value2);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateAverageGeometricValueWithZeroValues(){
        double actual_value1 = 0;
        double actual_value2 = 0;
        double actual;
        double expected = 0;
        double delta = 0.001;

        actual = calculateAverageGeometricValue(actual_value1, actual_value2);
        assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateAverageGeometricValueNegative(){
        double actual_value1 = -1;
        double actual_value2 = 3.4;

        double actual = calculateAverageGeometricValue(actual_value1, actual_value2);
    }





}
