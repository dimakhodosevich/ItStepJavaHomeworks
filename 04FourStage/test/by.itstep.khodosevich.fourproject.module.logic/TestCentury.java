package by.itstep.khodosevich.fourproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourproject.module.logic.Century.*;

public class TestCentury {

    @Test
    public void testGetCenturyPositive(){
        int actual = 1990;
        int expected = 20;

        actual = getCentury(actual);
        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testGetCenturyZeroYear(){
        int actual = 0;

        actual = getCentury(actual);
    }

    @Test
    public void testGetCenturyYearBeforeHundred(){
        int actual = 78;
        int expected = 1;

        actual = getCentury(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCenturyYearEqualsHundred(){
        int actual = 100;
        int expected = 1;

        actual = getCentury(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCenturyNegative(){
        int actual = -201;
        int expected = 3;

        actual = getCentury(actual);
        assertEquals(expected, actual);
    }


}
