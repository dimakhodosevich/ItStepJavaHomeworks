package by.itstep.khodosevich.fifthproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fifthproject.module.logic.AllPositiveNegativeNumber.*;

public class TestAllPositiveNegativeNumber {

    @Test
    public void testCheckAllNumberPositive(){
        int actual_a = 7;
        int actual_b = 8;
        int actual_c = 9;
        boolean actual;
        boolean expected = true;

        actual = checkAllNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckAllNumberNegative(){
        int actual_a = -7;
        int actual_b = -8;
        int actual_c = -9;
        boolean actual;
        boolean expected = false;

        actual = checkAllNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckAllNumberAllZero(){
        int actual_a = 0;
        int actual_b = 0;
        int actual_c = 0;
        boolean actual;
        boolean expected = true;

        actual = checkAllNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckAllNumberWithZeroLength(){
        boolean actual;

        actual = checkAllNumber(new int[0]);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckAllNumberWithNull(){
        boolean actual;

        actual = checkAllNumber(null);
    }


}
