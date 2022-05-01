package by.itstep.khodosevich.elevenstageproject.task01;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.elevenstageproject.task01.module.logic.NumberSumAndCounter.*;

public class NumberSumAndCounterTest {

    @Test
    public void testGetSumOfValuePositive() {
        int actual_number = 12345;
        int expected = 15;

        int actual = getSumOfValue(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetSumOfValueWithZero() {
        int actual_number = 0;
        int expected = 0;

        int actual = getSumOfValue(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetSumOfValueWithNegativeValue() {
        int actual_number = -12345;
        int expected = 15;

        int actual = getSumOfValue(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNumberOfValuePositive() {
        int actual_number = 12345;
        int expected = 5;

        int actual = countNumberOfValue(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNumberOfValueWithOneNumber() {
        int actual_number = 0;
        int expected = 1;

        int actual = countNumberOfValue(actual_number);
        assertEquals(expected, actual);
    }

}
