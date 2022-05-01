package by.itstep.khodosevich.elevenstageproject.task08;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.elevenstageproject.task08.module.logic.GreatestCommonDivisor.*;

public class GreatestCommonDivisorTest {

    @Test
    public void testGetGreatestCommonDivisorPositive() {
        int actual_var1 = 18;
        int actual_var2 = 27;
        int expected = 3;

        int actual = getGreatestCommonDivisor(actual_var1, actual_var2);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetGreatestCommonDivisorWithPrimeNumber() {
        int actual_var1 = 17;
        int actual_var2 = 7;
        int expected = -1;

        int actual = getGreatestCommonDivisor(actual_var1, actual_var2);
        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testGetGreatestCommonDivisorWithNegativeNumber() {
        int actual_var1 = -18;
        int actual_var2 = -27;

        getGreatestCommonDivisor(actual_var1, actual_var2);
    }

    @Test(expected = RuntimeException.class)
    public void testGetGreatestCommonDivisorWithZero() {
        int actual_var1 = 0;
        int actual_var2 = 18;

        getGreatestCommonDivisor(actual_var1, actual_var2);
    }

    @Test(expected = RuntimeException.class)
    public void testGetGreatestCommonDivisorWithOne() {
        int actual_var1 = 1;
        int actual_var2 = 27;

        getGreatestCommonDivisor(actual_var1, actual_var2);
    }

}
