package by.itstep.khodosevich.fifthproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fifthproject.module.logic.Coordinate.*;

public class TestCoordinate {

    @Test
    public void testCheckCoordinatePositivePart1(){
        int actual_x = 1;
        int actual_y = 1;
        int actual;
        int expected = 1;

        actual = checkCoordinate(actual_x, actual_y);
        assertEquals(actual, expected);
    }

    @Test
    public void testCheckCoordinatePositivePart2(){
        int actual_x = -1;
        int actual_y = 1;
        int actual;
        int expected = 2;

        actual = checkCoordinate(actual_x, actual_y);
        assertEquals(actual, expected);
    }

    @Test
    public void testCheckCoordinatePositivePart3(){
        int actual_x = -1;
        int actual_y = -1;
        int actual;
        int expected = 3;

        actual = checkCoordinate(actual_x, actual_y);
        assertEquals(actual, expected);
    }

    @Test
    public void testCheckCoordinatePositivePart4(){
        int actual_x = 1;
        int actual_y = -1;
        int actual;
        int expected = 4;

        actual = checkCoordinate(actual_x, actual_y);
        assertEquals(actual, expected);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckCoordinateNegative(){
        int actual_x = 0;
        int actual_y = 0;
        int actual;

        actual = checkCoordinate(actual_x, actual_y);
    }
}
