package by.itstep.khodosevich.sixproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.sixproject.module.logic.Coordinate.*;

public class TestCoordinate {

    @Test
    public void testCheckCoordinatePositive(){
        int actual_x1 = -5;
        int actual_y1 = 5;
        int actual_x2 = 5;
        int actual_y2 = -5;
        int actual_point_x1 = 3;
        int actual_point_y1 = 4;
        boolean actual;
        boolean expected = true;

        actual = checkCoordinate(actual_x1, actual_y1
                , actual_x2, actual_y2
                , actual_point_x1, actual_point_y1);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckCoordinateNegative(){
        int actual_x1 = -5;
        int actual_y1 = 5;
        int actual_x2 = 5;
        int actual_y2 = -5;
        int actual_point_x1 = 32;
        int actual_point_y1 = 6;
        boolean actual;
        boolean expected = false;

        actual = checkCoordinate(actual_x1, actual_y1
                , actual_x2, actual_y2
                , actual_point_x1, actual_point_y1);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckCoordinateBorderCondition(){
        int actual_x1 = -5;
        int actual_y1 = 5;
        int actual_x2 = 5;
        int actual_y2 = -5;
        int actual_point_x1 = 5;
        int actual_point_y1 = 5;
        boolean actual;
        boolean expected = true;

        actual = checkCoordinate(actual_x1, actual_y1
                , actual_x2, actual_y2
                , actual_point_x1, actual_point_y1);
        assertEquals(expected, actual);
    }
}
