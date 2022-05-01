package by.itstep.khodosevich.fifthproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fifthproject.module.logic.SameOppositeNumber.*;

public class TestSameOppositeNumber {

    @Test
    public void testCheckTheSameOppositeNumberPositive(){
        int actual_a = -7;
        int actual_b = 8;
        int actual_c = 7;
        boolean actual;
        boolean expected = true;

        actual = checkTheSameOppositeNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckTheSameOppositeNumberNegative(){
        int actual_a = 7;
        int actual_b = 8;
        int actual_c = 9;
        boolean actual;
        boolean expected = false;

        actual = checkTheSameOppositeNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckTheSameOppositeNumberWithPositiveValues(){
        int actual_a = 7;
        int actual_b = 8;
        int actual_c = 7;
        boolean actual;
        boolean expected = false;

        actual = checkTheSameOppositeNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckTheSameOppositeNumberWithNegativeValues(){
        int actual_a = -7;
        int actual_b = -8;
        int actual_c = -7;
        boolean actual;
        boolean expected = false;

        actual = checkTheSameOppositeNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckTheSameOppositeNumberWithZero(){
        int actual_a = 0;
        int actual_b = 0;
        int actual_c = 0;
        boolean actual;
        boolean expected = false;

        actual = checkTheSameOppositeNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testCheckTheSameOppositeNumberWithZeroLength(){
        boolean actual;

        actual = checkTheSameOppositeNumber(new int[0]);
    }

    @Test (expected = RuntimeException.class)
    public void testCheckTheSameOppositeNumberWithNull(){
        boolean actual;

        actual = checkTheSameOppositeNumber(null);
    }

}
