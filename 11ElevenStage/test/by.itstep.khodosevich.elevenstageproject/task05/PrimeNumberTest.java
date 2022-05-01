package by.itstep.khodosevich.elevenstageproject.task05;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.elevenstageproject.task05.module.logic.PrimeNumber.*;
import static by.itstep.khodosevich.elevenstageproject.view.Printer.*;

public class PrimeNumberTest {

    private static final int[] arrayNumber;
    private static final boolean[] arrayNumberAnswer;

    static {
        arrayNumber = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        arrayNumberAnswer = new boolean[]{true, true, false, true, false,
                true, false, false, false, true, false, true, false, false};
    }

    @Test
    public void testIsPrimeNumberPositive() {
        int actual_number = 7;

        boolean actual = isPrimeNumber(actual_number);
        assertTrue(ERROR_MESSAGE, actual);
    }

    @Test
    public void testIsPrimeNumberPositiveWithArray() {

        boolean[] expected = new boolean[arrayNumber.length];

        for (int i = 0; i < arrayNumber.length; i++) {
            expected[i] = isPrimeNumber(arrayNumber[i]);
        }

        assertArrayEquals(ERROR_MESSAGE, expected, arrayNumberAnswer);
    }

    @Test
    public void testIsPrimeNumberNegative() {
        int actual_number = 9;

        boolean actual = isPrimeNumber(actual_number);
        assertFalse(ERROR_MESSAGE, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testIsPrimeNumberWithZero() {
        int actual_number = 0;

        isPrimeNumber(actual_number);
    }

    @Test(expected = RuntimeException.class)
    public void testIsPrimeNumberWithONe() {
        int actual_number = 1;

        isPrimeNumber(actual_number);
    }


}
