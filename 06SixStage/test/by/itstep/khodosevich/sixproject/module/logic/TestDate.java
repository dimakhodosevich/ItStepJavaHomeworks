package by.itstep.khodosevich.sixproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.sixproject.module.logic.Data.*;

public class TestDate {

    @Test
    public void testCheckDataJanuary(){
        int actual_day = 15;
        int actual_month = 1;
        int actual_year = 2022;

        String actual;
        StringBuilder stringBuilder = new StringBuilder();
        String expected = stringBuilder.append("DAY NUMBER = ").append(actual_day).
                append("; DAY NAME = ").append("SUNDAY").
                append("; MONTH NUMBER = ").append(actual_month).
                append("; MONTH NAME = ").append("JANUARY").
                append("; YEAR = ").append(actual_year) + ".";

        actual = checkDate(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckDataFebruary(){
        int actual_day = 7;
        int actual_month = 2;
        int actual_year = 2022;

        String actual;
        StringBuilder stringBuilder = new StringBuilder();
        String expected = stringBuilder.append("DAY NUMBER = ").append(actual_day+JANUARY).
                append("; DAY NAME = ").append("MONDAY").
                append("; MONTH NUMBER = ").append(actual_month).
                append("; MONTH NAME = ").append("FEBRUARY").
                append("; YEAR = ").append(actual_year) + ".";

        actual = checkDate(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckDataNovember(){
        int actual_day = 7;
        int actual_month = 11;
        int actual_year = 2022;

        String actual;
        StringBuilder stringBuilder = new StringBuilder();
        String expected = stringBuilder.append("DAY NUMBER = ").
                append(actual_day+FIRST_DECADE+SECOND_DECADE+THIRD_DECADE+OCTOBER).
                append("; DAY NAME = ").append("MONDAY").
                append("; MONTH NUMBER = ").append(actual_month).
                append("; MONTH NAME = ").append("NOVEMBER").
                append("; YEAR = ").append(actual_year) + ".";

        actual = checkDate(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckDataDecember(){
        int actual_day = 27;
        int actual_month = 12;
        int actual_year = 2022;

        String actual;
        StringBuilder stringBuilder = new StringBuilder();
        String expected = stringBuilder.append("DAY NUMBER = ").
                append(actual_day+FIRST_DECADE+SECOND_DECADE+THIRD_DECADE+OCTOBER+NOVEMBER).
                append("; DAY NAME = ").append("TUESDAY").
                append("; MONTH NUMBER = ").append(actual_month).
                append("; MONTH NAME = ").append("DECEMBER").
                append("; YEAR = ").append(actual_year) + ".";

        actual = checkDate(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }
}
