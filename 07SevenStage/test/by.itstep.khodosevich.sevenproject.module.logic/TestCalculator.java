package by.itstep.khodosevich.sevenproject.module.logic;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.sevenproject.module.logic.Calculator.*;

public class TestCalculator {

    @Test
    public void testCalculatePlus() {
        char actual_action = '+';
        double actual_var1 = 5;
        double actual_var2 = 5;
        double actual;
        double expected = 10;
        double delta = 0.001;

        actual = calculate(actual_action, actual_var1, actual_var2);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateMinus() {
        char actual_action = '-';
        double actual_var1 = 5;
        double actual_var2 = 5;
        double actual;
        double expected = 0;
        double delta = 0.001;

        actual = calculate(actual_action, actual_var1, actual_var2);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateMultiple() {
        char actual_action = '*';
        double actual_var1 = 5;
        double actual_var2 = 5;
        double actual;
        double expected = 25;
        double delta = 0.001;

        actual = calculate(actual_action, actual_var1, actual_var2);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateDividePositive() {
        char actual_action = '/';
        double actual_var1 = 5;
        double actual_var2 = 5;
        double actual;
        double expected = 1;
        double delta = 0.001;

        actual = calculate(actual_action, actual_var1, actual_var2);
        assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateDivideZero() {
        char actual_action = '/';
        double actual_var1 = 5;
        double actual_var2 = 0;
        double actual;

        actual = calculate(actual_action, actual_var1, actual_var2);
    }

    @Test
    public void testCalculateModPositive() {
        char actual_action = '%';
        double actual_var1 = 5;
        double actual_var2 = 5;
        double actual;
        double expected = 0;
        double delta = 0.001;

        actual = calculate(actual_action, actual_var1, actual_var2);
        assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateModZero() {
        char actual_action = '/';
        double actual_var1 = 5;
        double actual_var2 = 0;
        double actual;

        actual = calculate(actual_action, actual_var1, actual_var2);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateNegative() {
        char actual_action = '^';
        double actual_var1 = 5;
        double actual_var2 = 0;
        double actual;

        actual = calculate(actual_action, actual_var1, actual_var2);
    }

}
