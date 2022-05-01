package by.itstep.khodosevich.fifthproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fifthproject.module.logic.ReverseNumber.*;

public class TestReverseNumber {

    @Test
    public void checkReverseNumberPositive(){
        long actual = 12345;
        long expected = 54321;

        actual = reverseNumber(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void checkReverseNumberNegative(){
        long actual = -12345;
        long expected = -54321;

        actual = reverseNumber(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void checkReverseNumberWithOneNumber(){
        long actual = 1;
        long expected = 1;

        actual = reverseNumber(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void checkReverseNumberWithZero(){
        long actual = 0;
        long expected = 0;

        actual = reverseNumber(actual);
        assertEquals(expected, actual);
    }


    @Test
    public void checkReverseNumberWithZeroNumber(){
        long actual = 123045;
        long expected = 54321;

        actual = reverseNumber(actual);
        assertEquals(expected, actual);
    }

}
