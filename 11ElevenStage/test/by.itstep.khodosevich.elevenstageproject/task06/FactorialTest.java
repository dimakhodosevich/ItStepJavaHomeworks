package by.itstep.khodosevich.elevenstageproject.task06;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.elevenstageproject.task06.module.logic.Factorial.*;

public class FactorialTest {
    private static final int[] FACTORIAL_NUMBERS;
    private static final int[] FACTORIAL_NUMBERS_ANSWER;

    static {
        FACTORIAL_NUMBERS = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        FACTORIAL_NUMBERS_ANSWER = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800};
    }

    @Test
    public void testCalculateFactorialPositive() {
        int[] actual = new int[FACTORIAL_NUMBERS.length];

        for (int i = 0; i < FACTORIAL_NUMBERS.length; i++) {
            actual[i] = calculateFactorial(FACTORIAL_NUMBERS[i]);
        }

        assertArrayEquals(FACTORIAL_NUMBERS_ANSWER, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateFactorialNegative() {
        int actual_number = -1;
        calculateFactorial(actual_number);
    }

}
