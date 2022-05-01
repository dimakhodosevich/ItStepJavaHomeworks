package by.itstep.khodosevich.elevenstageproject.task10;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.elevenstageproject.task10.module.logic.HappyNumber.*;

public class HappyNumberTest {

    private static final String ERROR_MESSAGE;

    static {
        ERROR_MESSAGE = "Your method works bad!!!";
    }

    @Test
    public void testIsHappyNumberPositive() {
        int actual_number = 123123;

        boolean actual = isHappyNumber(actual_number);
        assertTrue(ERROR_MESSAGE, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testIsHappyNumberPositiveWithZeroFirst() {
        int actual_number = 000123;

        isHappyNumber(actual_number);
    }

    @Test
    public void testIsHappyNumberPositiveWithOneZeroFirst() {
        int actual_number = 000000;

        boolean actual = isHappyNumber(actual_number);
        assertTrue(ERROR_MESSAGE, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testIsHappyNumberNegativeWithFiveNumbers() {
        int actual_number = 12312;

        isHappyNumber(actual_number);
    }

    @Test
    public void testIsHappyNumberNegativeWithDifferenceNumber() {
        int actual_number = 123456;

        boolean actual = isHappyNumber(actual_number);
        assertFalse(ERROR_MESSAGE, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testIsHappyNumberNegativeWithSevenNumbers() {
        int actual_number = 1231232;

        isHappyNumber(actual_number);
    }


}
