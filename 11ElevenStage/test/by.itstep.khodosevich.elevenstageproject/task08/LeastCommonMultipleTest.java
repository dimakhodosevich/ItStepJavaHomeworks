package by.itstep.khodosevich.elevenstageproject.task08;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.elevenstageproject.task08.module.logic.LeastCommonMultiple.*;

public class LeastCommonMultipleTest {

    @Test
    public void testGetLeastCommonMultiplePositiveFirst() {
        int actual_var1 = 9;
        int actual_var2 = 12;
        int expected = 36;

        int actual = getLeastCommonMultiple(actual_var1, actual_var2);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLeastCommonMultiplePositiveSecond() {
        int actual_var1 = 50;
        int actual_var2 = 180;
        int expected = 900;

        int actual = getLeastCommonMultiple(actual_var1, actual_var2);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLeastCommonMultipleWithPrimeNumber() {
        int actual_var1 = 7;
        int actual_var2 = 17;
        int expected = 119;

        int actual = getLeastCommonMultiple(actual_var1, actual_var2);
        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testGetLeastCommonMultipleWithZero() {
        int actual_var1 = 0;
        int actual_var2 = 12;

        getLeastCommonMultiple(actual_var1, actual_var2);
    }

    @Test(expected = RuntimeException.class)
    public void testGetLeastCommonMultipleWithOne() {
        int actual_var1 = 1;
        int actual_var2 = 12;

        getLeastCommonMultiple(actual_var1, actual_var2);
    }

    @Test(expected = RuntimeException.class)
    public void testGetLeastCommonMultipleWithNegativeNumber() {
        int actual_var1 = 12;
        int actual_var2 = -1;

        getLeastCommonMultiple(actual_var1, actual_var2);
    }

}
