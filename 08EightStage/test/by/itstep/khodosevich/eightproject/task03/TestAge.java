package by.itstep.khodosevich.eightproject.task03;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.eightproject.task03.module.logic.Age.*;

public class TestAge {

    @Test
    public void testGetStringAgePositiveOne() {
        double actual_age = 1;
        String expected = "один год";

        String actual = getStringAge(actual_age);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringAgePositiveTwo() {
        double actual_age = 19;
        String expected = "девятнадцать лет";

        String actual = getStringAge(actual_age);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringAgePositiveTree() {
        double actual_age = 21;
        String expected = "двадцать один год";

        String actual = getStringAge(actual_age);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringAgePositiveFour() {
        double actual_age = 100;
        String expected = "сто лет";

        String actual = getStringAge(actual_age);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringAgePositiveFive() {
        double actual_age = 119;
        String expected = "сто девятнадцать лет";

        String actual = getStringAge(actual_age);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringAgePositiveSix() {
        double actual_age = 74;
        String expected = "семьдесят четыре года";

        String actual = getStringAge(actual_age);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringAgePositiveSeven() {
        double actual_age = 4;
        String expected = "четыре года";

        String actual = getStringAge(actual_age);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringAgePositiveEight() {
        double actual_age = 120;
        String expected = "сто двадцать лет";

        String actual = getStringAge(actual_age);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringAgePositiveNine() {
        double actual_age = 11;
        String expected = "одинадцать лет";

        String actual = getStringAge(actual_age);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStringAgePositiveTen() {
        double actual_age = 19;
        String expected = "девятнадцать лет";

        String actual = getStringAge(actual_age);
        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testGetStringAgeNegativeOne() {
        double actual_age = -1;
        getStringAge(actual_age);
    }

    @Test(expected = RuntimeException.class)
    public void testGetStringAgeNegativeTwo() {
        double actual_age = 121;
        getStringAge(actual_age);
    }


}
