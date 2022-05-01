package by.itstep.khodosevich.secondproject.logic;

import by.itstep.khodosevich.secondproject.module.data.Age;
import org.junit.Test;
import org.junit.Assert;

public class TestAge {

    @Test
    public void testTranslateMonthInYearPositive(){
        int actual = 1;
        int expected = 12;

        actual = Age.translateYearInMonth(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateMonthInYearNegative(){
        int actual = -1;

        Age.translateYearInMonth(actual);
    }

    @Test
    public void testTranslateYearInDayPositive(){
        int actual = 1;
        int expected = 365;

        actual = Age.translateYearInDay(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateYearInDayNegative(){
        int actual = -1;

        Age.translateYearInDay(actual);
    }

    @Test
    public void testTranslateDayInHourPositive(){
        int actual = 1;
        int expected = 24;

        actual = Age.translateDayInHour(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateDayInHourNegative(){
        int actual = -1;

        Age.translateDayInHour(actual);
    }

    @Test
    public void testTranslateHourInMinutPositive(){
        int actual = 1;
        int expected = 60;

        actual = Age.translateHourInMinut(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateHourInMinutNegative(){
        int actual = -1;

        Age.translateHourInMinut(actual);
    }



    @Test
    public void testTranslateMinutInSecondPositive(){
        int actual = 1;
        int expected = 60;

        actual = Age.translateMinutInSecond(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateMinutInSecondNegative(){
        int actual = -1;

        Age.translateMinutInSecond(actual);
    }


    @Test
    public void testTranslateSecondInMillisecondPositive(){
        long actual = 1;
        long expected = 1000;

        actual = Age.translateSecondInMillisecond(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateSecondInMillisecondNegative(){
        int actual = -1;

        Age.translateSecondInMillisecond(actual);
    }

}
