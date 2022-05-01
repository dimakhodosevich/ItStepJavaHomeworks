package by.itstep.khodosevich.sevenproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.sevenproject.module.logic.Horoscope.*;

public class TestHoroscope {

    @Test
    public void testCheckHoroscopeAquariusFirst(){
        int actual_day = 21;
        int actual_month = 1;
        int actual_year = 2022;
        String actual;
        String expected = "Aquarius";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeAquariusMiddle(){
        int actual_day = 28;
        int actual_month = 1;
        int actual_year = 2022;
        String actual;
        String expected = "Aquarius";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeAquariusSecond(){
        int actual_day = 19;
        int actual_month = 2;
        int actual_year = 2022;
        String actual;
        String expected = "Aquarius";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopePiscesFirst(){
        int actual_day = 20;
        int actual_month = 2;
        int actual_year = 2022;
        String actual;
        String expected = "Pisces";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopePiscesMiddle(){
        int actual_day = 29;
        int actual_month = 2;
        int actual_year = 2022;
        String actual;
        String expected = "Pisces";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopePiscesSecond(){
        int actual_day = 20;
        int actual_month = 3;
        int actual_year = 2022;
        String actual;
        String expected = "Pisces";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeAriesFirst(){
        int actual_day = 21;
        int actual_month = 3;
        int actual_year = 2022;
        String actual;
        String expected = "Aries";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeAriesMiddle(){
        int actual_day = 28;
        int actual_month = 3;
        int actual_year = 2022;
        String actual;
        String expected = "Aries";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeAriesSecond(){
        int actual_day = 20;
        int actual_month = 4;
        int actual_year = 2022;
        String actual;
        String expected = "Aries";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeTaurusFirst(){
        int actual_day = 21;
        int actual_month = 4;
        int actual_year = 2022;
        String actual;
        String expected = "Taurus";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeTaurusMiddle(){
        int actual_day = 28;
        int actual_month = 4;
        int actual_year = 2022;
        String actual;
        String expected = "Taurus";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeTaurusSecond(){
        int actual_day = 21;
        int actual_month = 5;
        int actual_year = 2022;
        String actual;
        String expected = "Taurus";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeGeminiFirst(){
        int actual_day = 22;
        int actual_month = 5;
        int actual_year = 2022;
        String actual;
        String expected = "Gemini";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeGeminiMiddle(){
        int actual_day = 28;
        int actual_month = 5;
        int actual_year = 2022;
        String actual;
        String expected = "Gemini";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeGeminiSecond(){
        int actual_day = 21;
        int actual_month = 6;
        int actual_year = 2022;
        String actual;
        String expected = "Gemini";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeCancerFirst(){
        int actual_day = 22;
        int actual_month = 6;
        int actual_year = 2022;
        String actual;
        String expected = "Cancer";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeCancerMiddle(){
        int actual_day = 26;
        int actual_month = 6;
        int actual_year = 2022;
        String actual;
        String expected = "Cancer";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeCancerSecond(){
        int actual_day = 22;
        int actual_month = 7;
        int actual_year = 2022;
        String actual;
        String expected = "Cancer";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeLeoFirst(){
        int actual_day = 23;
        int actual_month = 7;
        int actual_year = 2022;
        String actual;
        String expected = "Leo";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeLeoMiddle(){
        int actual_day = 28;
        int actual_month = 7;
        int actual_year = 2022;
        String actual;
        String expected = "Leo";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeLeoSecond(){
        int actual_day = 21;
        int actual_month = 8;
        int actual_year = 2022;
        String actual;
        String expected = "Leo";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeVirgoFirst(){
        int actual_day = 22;
        int actual_month = 8;
        int actual_year = 2022;
        String actual;
        String expected = "Virgo";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeVirgoMiddle(){
        int actual_day = 28;
        int actual_month = 8;
        int actual_year = 2022;
        String actual;
        String expected = "Virgo";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeVirgoSecond(){
        int actual_day = 23;
        int actual_month = 9;
        int actual_year = 2022;
        String actual;
        String expected = "Virgo";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeLibraFirst(){
        int actual_day = 24;
        int actual_month = 9;
        int actual_year = 2022;
        String actual;
        String expected = "Libra";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeLibraMiddle(){
        int actual_day = 28;
        int actual_month = 9;
        int actual_year = 2022;
        String actual;
        String expected = "Libra";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeLibraSecond(){
        int actual_day = 23;
        int actual_month = 10;
        int actual_year = 2022;
        String actual;
        String expected = "Libra";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeScorpioFirst(){
        int actual_day = 24;
        int actual_month = 10;
        int actual_year = 2022;
        String actual;
        String expected = "Scorpio";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeScorpioMiddle(){
        int actual_day = 28;
        int actual_month = 10;
        int actual_year = 2022;
        String actual;
        String expected = "Scorpio";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeScorpioSecond(){
        int actual_day = 22;
        int actual_month = 11;
        int actual_year = 2022;
        String actual;
        String expected = "Scorpio";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeSagittariusFirst(){
        int actual_day = 23;
        int actual_month = 11;
        int actual_year = 2022;
        String actual;
        String expected = "Sagittarius";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeSagittariusMiddle(){
        int actual_day = 29;
        int actual_month = 11;
        int actual_year = 2022;
        String actual;
        String expected = "Sagittarius";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeSagittariusSecond(){
        int actual_day = 22;
        int actual_month = 12;
        int actual_year = 2022;
        String actual;
        String expected = "Sagittarius";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeCapricornFirst(){
        int actual_day = 23;
        int actual_month = 12;
        int actual_year = 2022;
        String actual;
        String expected = "Capricorn";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeCapricornMiddle(){
        int actual_day = 28;
        int actual_month = 12;
        int actual_year = 2022;
        String actual;
        String expected = "Capricorn";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckHoroscopeCapricornSecond(){
        int actual_day = 20;
        int actual_month = 1;
        int actual_year = 2022;
        String actual;
        String expected = "Capricorn";

        actual = checkHoroscope(actual_day, actual_month, actual_year);
        assertEquals(expected, actual);
    }

    @Test(expected = AssertionError.class)
    public void testCheckHoroscopeNegativeFirst(){
        int actual_day = 31;
        int actual_month = 2;
        int actual_year = 2022;
        String actual;

        actual = checkHoroscope(actual_day, actual_month, actual_year);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckHoroscopeNegativeSecond(){
        int actual_day = 0;
        int actual_month = 2;
        int actual_year = 2022;
        String actual;

        actual = checkHoroscope(actual_day, actual_month, actual_year);
    }

}
