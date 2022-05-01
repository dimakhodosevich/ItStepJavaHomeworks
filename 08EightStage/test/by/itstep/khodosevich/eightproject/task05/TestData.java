package by.itstep.khodosevich.eightproject.task05;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.eightproject.task05.module.logic.Data.*;

public class TestData {

    @Test
    public void testGetDayOfMonthPositive(){
        int[] actual_numbersOfMonth = {1,2,3,4,5,6,7,8,9,10,11,12};
        int expected = 365;
        int actual = 0;

        for(int element: actual_numbersOfMonth){
            actual += getDayOfMonth(element);
        }

        assertEquals(expected, actual);
    }

    @Test
    public void testGetDayOfMonthNegativeOne(){
        int actual_number = 0;
        int expected = -1;

        int actual = getDayOfMonth(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetDayOfMonthNegativeTwo(){
        int actual_number = 13;
        int expected = -1;

        int actual = getDayOfMonth(actual_number);
        assertEquals(expected, actual);
    }


    @Test
    public void testIsLeapYear2000(){
        int actual_year = 2000;
        boolean expected = true;

        boolean actual = isLeapYear(actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsLeapYear1900(){
        int actual_year = 1900;
        boolean expected = false;

        boolean actual = isLeapYear(actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsLeapYear2008(){
        int actual_year = 2008;
        boolean expected = true;

        boolean actual = isLeapYear(actual_year);
        assertEquals(expected, actual);
    }



}
