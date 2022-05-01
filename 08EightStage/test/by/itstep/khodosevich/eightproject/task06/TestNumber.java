package by.itstep.khodosevich.eightproject.task06;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.eightproject.task06.module.logic.Number.*;

public class TestNumber {

    @Test
    public void testGetStringNumberUnit(){
        int actual_number = 1;
        String expected = "one";

        String actual = getStringNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringNumberTen(){
        int actual_number = 11;
        String expected = "eleven";

        String actual = getStringNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringNumberTens(){
        int actual_number = 71;
        String expected = "seventy-one";

        String actual = getStringNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringNumberHundred(){
        int actual_number = 100;
        String expected = "one hundred";

        String actual = getStringNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringNumberHundredsOne(){
        int actual_number = 221;
        String expected = "two hundred twenty-one";

        String actual = getStringNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringNumberHundredsTwo(){
        int actual_number = 657;
        String expected = "six hundred fifty-seven";

        String actual = getStringNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringNumberHundredsTree(){
        int actual_number = 999;
        String expected = "nine hundred ninety-nine";

        String actual = getStringNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringNumberNegativeZero(){
        int actual_number = 0;
        String expected = "out of out bound";

        String actual = getStringNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringNumberNegativeThousand(){
        int actual_number = 1000;
        String expected = "out of out bound";

        String actual = getStringNumber(actual_number);
        assertEquals(expected, actual);
    }






}
