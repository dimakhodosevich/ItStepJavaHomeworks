package by.itstep.khodosevich.fifthproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fifthproject.module.logic.SameNumber.*;

public class TestSameNumber {

    @Test
    public void testCheckTheSameNumberPositive(){
        int actual_a = 7;
        int actual_b = 8;
        int actual_c = 7;
        boolean actual;
        boolean expected = true;

        actual = checkTheSameNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckTheSameNumberNegative(){
        int actual_a = 7;
        int actual_b = 8;
        int actual_c = 9;
        boolean actual;
        boolean expected = false;

        actual = checkTheSameNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckTheSameNumberWithNegativeValues(){
        int actual_a = -7;
        int actual_b = 8;
        int actual_c = 7;
        boolean actual;
        boolean expected = true;

        actual = checkTheSameNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckTheSameNumberWithZero(){
        int actual_a = 0;
        int actual_b = 0;
        int actual_c = 0;
        boolean actual;
        boolean expected = true;

        actual = checkTheSameNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testCheckParityWithZeroLength(){
        boolean actual;

        actual = checkTheSameNumber(new int[0]);
    }

    @Test (expected = RuntimeException.class)
    public void testCheckParityWithNull(){
        boolean actual;

        actual = checkTheSameNumber(null);
    }

}
