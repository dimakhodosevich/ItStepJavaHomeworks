package by.itstep.khodosevich.nineproject.task04;

import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.nineproject.task04.module.logic.NextDay.*;

public class TestNextDay {

    @Test
    public void testGetNextDayPositive() throws ParseException {
        String actual_day = "28.02.2022";

        String expected = "01.03.2022";

        String actual = getNextDay(actual_day);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNextDayLeapYear() throws ParseException {
        String actual_day = "28.02.2000";

        String expected = "29.02.2000";

        String actual = getNextDay(actual_day);
        assertEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testGetNextDayNull() throws ParseException {

        String actual = getNextDay(null);
    }

    @Test (expected = RuntimeException.class)
    public void testGetNextDayWithZeroLength() throws ParseException {

        String actual = getNextDay(new String(""));
    }

}
