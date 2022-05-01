package by.itstep.khodosevich.fifthproject.module.logic;

import org.junit.Test;

import static by.itstep.khodosevich.fifthproject.module.logic.AllPositiveNegativeNumber.checkAllNumber;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fifthproject.module.logic.MostPositiveNegativeNumber.*;

public class TestMostPositiveNegativeNumber {

    @Test
    public void testCheckMostPositiveNegativeNumberPositive(){
        int actual_a = 5;
        int actual_b = 6;
        int actual_c = -3;
        boolean actual;
        boolean expected = true;

        actual = checkMostPositiveNegativeNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckMostPositiveNegativeNumberNegative(){
        int actual_a = 5;
        int actual_b = -6;
        int actual_c = -3;
        boolean actual;
        boolean expected = false;

        actual = checkMostPositiveNegativeNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckMostPositiveNegativeNumberAllZero(){
        int actual_a = 0;
        int actual_b = 0;
        int actual_c = 0;
        boolean actual;
        boolean expected = true;

        actual = checkMostPositiveNegativeNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }


    @Test(expected = RuntimeException.class)
    public void testCheckMostPositiveNegativeNumberWithZeroLength(){
        boolean actual;

        actual = checkMostPositiveNegativeNumber(new int[0]);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckMostPositiveNegativeNumberWithNull(){
        boolean actual;

        actual = checkMostPositiveNegativeNumber(null);
    }

}
