package by.itstep.khodosevich.elevenstageproject.task04;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.elevenstageproject.task04.module.logic.ReverseNumber.*;

public class ReverseNumberTest {

    @Test
    public void testGetReverseNumberPositive() {
        int actual_number = 12345;
        int expected = 54321;

        int actual = getReverseNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetReverseNumberWithZeroEnding() {
        int actual_number = 12300;
        int expected = 321;

        int actual = getReverseNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetReverseNumberWithZeroAlongNumber() {
        int actual_number = 12045;
        int expected = 54021;

        int actual = getReverseNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetReverseNumberWithOneNumber() {
        int actual_number = 5;
        int expected = 5;

        int actual = getReverseNumber(actual_number);
        assertEquals(expected, actual);
    }


    @Test(expected = RuntimeException.class)
    public void testGetReverseNumberWithZero() {
        int actual_number = 0;
        getReverseNumber(actual_number);
    }

    @Test(expected = RuntimeException.class)
    public void testGetReverseNumberNegative() {
        int actual_number = -6;
        getReverseNumber(actual_number);
    }


}
