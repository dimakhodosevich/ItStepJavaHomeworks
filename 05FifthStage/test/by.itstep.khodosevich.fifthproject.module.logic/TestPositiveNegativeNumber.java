package by.itstep.khodosevich.fifthproject.module.logic;

import org.junit.Test;

import static by.itstep.khodosevich.fifthproject.module.logic.Parity.checkParity;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fifthproject.module.logic.PositiveNegativeNumber.*;

public class TestPositiveNegativeNumber {

    @Test
    public void testCheckNumberPositive(){
        int actual_a = 1;
        int actual_b = 2;
        int actual_c = 3;
        boolean actual;
        boolean expected = true;

        actual = checkNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckNumberNegative(){
        int actual_a = -1;
        int actual_b = -2;
        int actual_c = -3;
        boolean actual;
        boolean expected = false;

        actual = checkNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckNumberAllZero(){
        int actual_a = 0;
        int actual_b = 0;
        int actual_c = 0;
        boolean actual;

        actual = checkNumber(actual_a, actual_b, actual_c);
    }

    @Test
    public void testCheckNumberBorder(){
        int actual_a = 1;
        int actual_b = -2;
        int actual_c = -3;
        int actual_d = 1;
        boolean actual;
        boolean expected = false;

        actual = checkNumber(actual_a, actual_b, actual_c, actual_d);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckNumberBorderNegative(){
        int actual_a = 1;
        int actual_b = -2;
        int actual_c = -3;
        boolean actual;
        boolean expected = false;

        actual = checkNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckNumberBorderPositive(){
        int actual_a = 1;
        int actual_b = 2;
        int actual_c = -3;
        boolean actual;
        boolean expected = true;

        actual = checkNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testCheckNumberWithZeroLength(){
        boolean actual;

        actual = checkNumber(new int[0]);
    }

    @Test (expected = RuntimeException.class)
    public void testCheckNumberWithNull(){
        boolean actual;

        actual = checkNumber(null);
    }

}
