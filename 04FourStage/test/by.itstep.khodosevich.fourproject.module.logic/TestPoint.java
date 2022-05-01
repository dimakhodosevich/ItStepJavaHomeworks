package by.itstep.khodosevich.fourproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourproject.module.logic.Point.*;

public class TestPoint {

    @Test
    public void testCalculatePointPositiveValues(){
        double actual_x1 = 3;
        double actual_x2 = 5;
        double actual;
        double expected = -2;
        double delta = 0.001;

        actual = calculatePointX(actual_x1, actual_x2);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculatePointNegativeValues(){
        double actual_x1 = -3;
        double actual_x2 = -5;
        double actual;
        double expected = 2;
        double delta = 0.001;

        actual = calculatePointX(actual_x1, actual_x2);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculatePointYPositiveValues(){
        double actual_y1 = 3;
        double actual_y2 = 5;
        double actual;
        double expected = -2;
        double delta = 0.001;

        actual = calculatePointY(actual_y1, actual_y2);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculatePointYNegativeValues(){
        double actual_y1 = -3;
        double actual_y2 = -5;
        double actual;
        double expected = 2;
        double delta = 0.001;

        actual = calculatePointY(actual_y1, actual_y2);
        assertEquals(expected, actual, delta);
    }


    @Test
    public void testFindDistanceBetweenTwoPointPosiviteValues(){
        double actual_x = 3;
        double actual_y = 4;
        double actual;
        double expected = 5;
        double delta = 0.001;

        actual = findDistanceBetweenTwoPoint(actual_x,actual_y);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testFindDistanceBetweenTwoPointNegativeValues(){
        double actual_x = -3;
        double actual_y = -4;
        double actual;
        double expected = 5;
        double delta = 0.001;

        actual = findDistanceBetweenTwoPoint(actual_x,actual_y);
        assertEquals(expected, actual, delta);
    }

}
